/*
 * CharacterAffectCompPanel.java
 *
 * Copyright (c) 2005 by Patrick Gebhard
 * All rights reserved.
 *
 */
package de.affect.gui;

import de.affect.compute.DecayFunction;
import de.affect.compute.ExponentialDecayFunction;
import de.affect.compute.LinearDecayFunction;
import de.affect.compute.TangensHyperbolicusDecayFunction;
import de.affect.data.AffectConsts;
import static de.affect.gui.AlmaGUI.sAlmaGUI;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.Helpers.createHelpers;
import static de.affect.gui.Helpers.decadeMinuteLabels;
import static de.affect.gui.Helpers.decayTimeLabels;
import static de.affect.gui.Helpers.getFillerBox;
import static de.affect.gui.Helpers.makeJSliderHorizontal;
import static de.affect.gui.Helpers.makeLabelSliderPanelHorizontal;
import static de.affect.gui.Helpers.milliSecondsLabel;
import static de.affect.gui.Helpers.minuteLabels;
import static de.affect.gui.Helpers.smallNumberConfigLabel;
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;
import static de.affect.util.Convert.doubleValue;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * The
 * <code>CharacterAffectCompPanel</code> provides an graphical interfaces for
 * all computing relevant variables of ALMA affect computing sub modules
 *
 * This code relys on the xml bean classes created with xmlbeans v2.0 from the
 * Affect.xsd schema that is part of this distribution.
 *
 * @author Patrick Gebhard
 *
 * @version 1.0
 */
public class CharacterAffectCompPanel extends JPanel implements ActionListener {

  private String fCharacterName = null;
  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;
  private SliderListener sliderListener = null;
  private JSlider functionParamSlider = null;
  private JSlider emotionDecaySlider = null;
  private JSlider emotionDecayPeriodSlider = null;
  private JSlider moodReturnSlider = null;
  private JSlider moodUpdatePeriodSlider = null;
  private JSlider moodTrajectorySlider = null;
  private JRadioButton linearDecayButton = new JRadioButton("Linear");
  private JRadioButton exponentialDecayButton = new JRadioButton("Exponential");
  private JRadioButton tanhDecayButton = new JRadioButton("Tan-Hyper");
  private JRadioButton neurotismforMoodStabilityButton = new JRadioButton("Mood stability controlled by Neurotism");
  private EmotionDecayPanel emotionDecayPanel = null;
  private JPanel mControlPanel = new JPanel();
  private JButton mPauseButton;
  private JButton mResumeButton;
  private JButton mStepButton;
  private String decayFctString = "linear";
  private int emotionDecayTime = -1;
  private int emotionDecayPeriod = -1;
  private int moodReturnTime = -1;
  private int moodReturnPeriod = -1;
  private int moodTrajectoryDecayTime =1;
  private boolean neurotismforMoodStability = false;
  private JSlider fPersonalityOnEmotionInfluenceSlider = null;
  private CharacterManager fCharacter = null;

  
  

  public CharacterAffectCompPanel(String characterName, CharacterAffect characterAffectProfile) {

    createHelpers();
    
    try {
      fCharacter = affectManager.getCharacterByName(characterName);
    } catch(IllegalArgumentException iae) {
      iae.printStackTrace();
      return;
    }
    this.setOpaque(false);
    sliderListener = new SliderListener();
    fCharacterName = characterName;
    // get the actual values ...
    CharacterAffect.EmotionSpecification emoSpec = characterAffectProfile.getEmotionSpecification();
    CharacterAffect.MoodSpecification moodSpec = characterAffectProfile.getMoodSpecification();
    emotionDecayTime = (new Long(emoSpec.getDecaytime() / 1000)).intValue();
    emotionDecayPeriod = (new Long(emoSpec.getDecayperiod())).intValue();
    moodReturnTime = (new Long(moodSpec.getDecaytime() / 1000)).intValue();
    moodReturnPeriod = (new Long(moodSpec.getDecayperiod())).intValue();
    neurotismforMoodStability = moodSpec.getNeurotismstability();;
    
     //Personality Influcene Stuff
    CharacterAffect.PersonalitySpecification persSpec = characterAffectProfile.getPersonalitySpecification();
    JPanel personalityInfluencePanel = new JPanel();//tengfei
    personalityInfluencePanel.setOpaque(false);
    personalityInfluencePanel.setLayout(new BoxLayout(personalityInfluencePanel, BoxLayout.Y_AXIS));
    Double val = new Double(persSpec.getEmotioninfluence()) * 100.0d;
    fPersonalityOnEmotionInfluenceSlider = makeJSliderHorizontal(0, 50, val.intValue(), 
								 10, 5, smallNumberConfigLabel,sliderListener );
    fPersonalityOnEmotionInfluenceSlider.setOpaque(false);
    //fPersonalityOnEmotionInfluenceSlider.addChangeListener(this);
    personalityInfluencePanel.add(fPersonalityOnEmotionInfluenceSlider);
    Border border = 
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Personality Influence ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1));
    personalityInfluencePanel.setBorder(border);
    // Build Dialog
    JPanel configPanel = new JPanel();
    configPanel.setOpaque(false);
    // Emotion Decay
    /*JPanel emotionDecayVariablesPanel = new JPanel();
    emotionDecaySlider =
      makeJSliderHorizontal(0, 240, emotionDecayTime, 60, 12, minuteLabels, sliderListener);
    JPanel emotionDecaySliderEntity =
      makeLabelSliderPanelHorizontal("Emotion Decay Time", emotionDecaySlider);
    emotionDecayPeriodSlider =
      makeJSliderHorizontal(10, 1000, emotionDecayPeriod, 500, 125, milliSecondsLabel, sliderListener);
    JPanel emotionDecayPeriodSliderEntity =
      makeLabelSliderPanelHorizontal("Emotion Compute Period", emotionDecayPeriodSlider);
    emotionDecayVariablesPanel.setLayout(new BoxLayout(emotionDecayVariablesPanel, BoxLayout.Y_AXIS));
    emotionDecayVariablesPanel.add(emotionDecaySliderEntity);
    emotionDecayVariablesPanel.add(emotionDecayPeriodSliderEntity);
    emotionDecayVariablesPanel.add(getFillerBox(10, 10, 5000, 5000));
    border = createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      " Emotion Decay ", 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 1, 1, 1));
    emotionDecayVariablesPanel.setBorder(border);*/
    
    
    // Emotion Decay Characteristics		
    
    JPanel emotionPanel = new JPanel();
    emotionPanel.setOpaque(false);
    emotionPanel.setLayout(new BoxLayout(emotionPanel, BoxLayout.Y_AXIS));
    JPanel emotionDecayVariablesPanel = new JPanel();
    emotionDecayVariablesPanel.setOpaque(false);
    JPanel decayFctPanel = new JPanel();
    decayFctPanel.setOpaque(false);
    emotionDecaySlider =
      makeJSliderHorizontal(0, 240, emotionDecayTime, 60, 12, minuteLabels, sliderListener);
    emotionDecaySlider.setOpaque(false);
    JPanel emotionDecaySliderEntity =
      makeLabelSliderPanelHorizontal("Decay Time", emotionDecaySlider);
     emotionDecaySliderEntity.setOpaque(false);
    emotionDecayPeriodSlider =
      makeJSliderHorizontal(10, 1000, emotionDecayPeriod, 500, 125, milliSecondsLabel, sliderListener);
    emotionDecayPeriodSlider.setOpaque(false);
    JPanel emotionDecayPeriodSliderEntity =
      makeLabelSliderPanelHorizontal("Compute Period", emotionDecayPeriodSlider);
    emotionDecayPeriodSliderEntity.setOpaque(false);
    emotionDecayVariablesPanel.setLayout(new BoxLayout(emotionDecayVariablesPanel, BoxLayout.Y_AXIS));
    emotionDecayVariablesPanel.add(emotionDecaySliderEntity);
    emotionDecayVariablesPanel.add(emotionDecayPeriodSliderEntity);
    emotionDecayVariablesPanel.add(getFillerBox(10, 10, 5000, 5000));
  
    ButtonGroup decayFcts = new ButtonGroup();
    
    DecayFunction decay = null;
    decayFcts.add(linearDecayButton);
    decayFcts.add(exponentialDecayButton);
    decayFcts.add(tanhDecayButton);
    decayFctString = emoSpec.getDecayfunction().toString().trim();
    linearDecayButton.setOpaque(false);
    linearDecayButton.addActionListener(this);
    linearDecayButton.setActionCommand("linear");
    if (decayFctString.equals("linear")) {
      decay = new LinearDecayFunction(steps());
      linearDecayButton.setSelected(true);
    }
    exponentialDecayButton.addActionListener(this);
    exponentialDecayButton.setOpaque(false);
    exponentialDecayButton.setActionCommand("exponential");
    if (decayFctString.equals("exponential")) {
      decay = new ExponentialDecayFunction(steps());
      exponentialDecayButton.setSelected(true);
    }
    tanhDecayButton.addActionListener(this);
    tanhDecayButton.setOpaque(false);
    tanhDecayButton.setActionCommand("hyperbolic");
    if (decayFctString.equals("hyperbolic")) {
      decay = new TangensHyperbolicusDecayFunction(steps());
      tanhDecayButton.setSelected(true);
    }
    double functionParam = decay.getConfigParameter();
    functionParam = (functionParam == -1.0d) ? 0.1d : functionParam;
    functionParamSlider =
      makeJSliderHorizontal(10, 100, (int) (functionParam * 100), 10, 2, smallNumberConfigLabel, sliderListener);
    functionParamSlider.setOpaque(false);
    if (decay.hasConfigParameter()) {
      functionParamSlider.setEnabled(true);
      functionParamSlider.setValue((int) (functionParam * 100));
    } else {
      functionParamSlider.setEnabled(false);
      functionParamSlider.setValue((int) (functionParam * 100));
    }
    JPanel radioPanel = new JPanel();
    radioPanel.setOpaque(false);
    radioPanel.setLayout(new GridLayout(0, 1));
    radioPanel.add(linearDecayButton);
    radioPanel.add(exponentialDecayButton);
    JPanel tanhDecayPanel = new JPanel();
    tanhDecayPanel.setOpaque(false);
    tanhDecayPanel.setLayout(new BoxLayout( tanhDecayPanel, BoxLayout.X_AXIS));
    tanhDecayPanel.setMinimumSize(new Dimension(275,30));
    tanhDecayPanel.add(tanhDecayButton);
    //radioPanel.add(new JLabel("Function parameter"));
    tanhDecayPanel.add(functionParamSlider);
    radioPanel.add(tanhDecayPanel);
    decayFctPanel.setLayout(new BoxLayout(decayFctPanel, BoxLayout.X_AXIS));
    
    decayFctPanel.add(radioPanel);
    //decayFctPanel.add(getFillerBox(4, 4, 4, 4));
    emotionDecayPanel = new EmotionDecayPanel(decay, Color.RED);
    emotionDecayPanel.setOpaque(false);
    emotionDecayPanel.setMinimumSize(new Dimension(200, 70));
    emotionDecayPanel.setPreferredSize(new Dimension(200, 100));
    decayFctPanel.add(emotionDecayPanel);
    //decayFctPanel.add(getFillerBox(4, 4, 4, 4));
  
    //decayFctPanel.setBorder(border);
    
    emotionPanel.add(emotionDecayVariablesPanel);
    emotionPanel.add(decayFctPanel);
      border = createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      " Emotion ", 0, 0, sDefaultTitleFont),
       createEmptyBorder(1, 1, 1, 1));
    emotionPanel.setBorder(border);
    // Mood Return
    JPanel moodConfigPanel = new JPanel();
    moodConfigPanel.setOpaque(false);
    moodReturnSlider =
      makeJSliderHorizontal(0, 1800, moodReturnTime, 600, 60, decadeMinuteLabels, sliderListener);
    
    moodReturnSlider.setOpaque(false);
    JPanel moodReturnSliderEntity =
      makeLabelSliderPanelHorizontal("Mood Return Time", moodReturnSlider);
    moodReturnSliderEntity.setOpaque(false);
    moodUpdatePeriodSlider =
      makeJSliderHorizontal(0, 1000, moodReturnPeriod, 500, 125, milliSecondsLabel, sliderListener);
    moodUpdatePeriodSlider.setOpaque(false);
    JPanel moodUpdatePeriodSliderEntity =
      makeLabelSliderPanelHorizontal("Mood Compute Period", moodUpdatePeriodSlider);
    moodUpdatePeriodSliderEntity.setOpaque(false);
    moodTrajectorySlider =
      makeJSliderHorizontal(1, 10, moodTrajectoryDecayTime, 1, 1, decayTimeLabels, sliderListener);
    moodTrajectorySlider.setOpaque(false);
    JPanel moodTrajectorySliderEntity =
      makeLabelSliderPanelHorizontal("Mood Trajectory Decay",  moodTrajectorySlider);
    moodTrajectorySliderEntity.setOpaque(false);
    
    neurotismforMoodStabilityButton.addActionListener(this);
    neurotismforMoodStabilityButton.setOpaque(false);
    neurotismforMoodStabilityButton.setActionCommand("neutrotism_controls_mood_stability");
    neurotismforMoodStabilityButton.setSelected(neurotismforMoodStability);
    JPanel moodComputeVariablesPanel = new JPanel();
    moodComputeVariablesPanel.setOpaque(false);
    moodComputeVariablesPanel.setLayout(new GridLayout(0, 1));
    moodComputeVariablesPanel.add(neurotismforMoodStabilityButton);
    moodConfigPanel.setLayout(new BoxLayout(moodConfigPanel, BoxLayout.Y_AXIS));
    moodConfigPanel.add(moodReturnSliderEntity);
    moodConfigPanel.add(moodUpdatePeriodSliderEntity);
    moodConfigPanel.add(moodTrajectorySliderEntity);
    moodConfigPanel.add(moodComputeVariablesPanel);
    
    moodConfigPanel.add(getFillerBox(10, 10, 5000, 5000));
    border = createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      " Mood ", 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 1, 1, 1));
    moodConfigPanel.setBorder(border);
    // Computation Control Panel
    initControlPanel();
    // Tie config panels together
    configPanel.setLayout(new BoxLayout(configPanel, BoxLayout.Y_AXIS));
    configPanel.add(personalityInfluencePanel);
    configPanel.add(moodConfigPanel);
    //configPanel.add(emotionDecayVariablesPanel);
    //configPanel.add(decayFctPanel);
    configPanel.add(emotionPanel);
    configPanel.add(mControlPanel);
   
    // Tie all together
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.add(configPanel);
  
  }

  private void initControlPanel() {
    mControlPanel.setLayout(new BoxLayout(mControlPanel, BoxLayout.X_AXIS));
    mControlPanel.setOpaque(false);
    Border border =
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE),
      "Realtime affect computation", 0, 0, sDefaultTitleFont),
      createEmptyBorder(1, 10, 1, 1));
    mControlPanel.setBorder(border);
    // Continue button
    mResumeButton = new JButton("Resume");
    mResumeButton.setEnabled(AffectManager.sInterface.getCharacterByName(fCharacterName).isAffectComputationPaused());
    mResumeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AffectManager.sInterface.getCharacterByName(fCharacterName).resumeAffectComputation();
        mPauseButton.setEnabled(true);
        mResumeButton.setEnabled(false);
        mStepButton.setEnabled(false);
      }
    });
    // Pause button
    mPauseButton = new JButton("Pause");
    mPauseButton.setEnabled(!AffectManager.sInterface.getCharacterByName(fCharacterName).isAffectComputationPaused());
    mPauseButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AffectManager.sInterface.getCharacterByName(fCharacterName).pauseAffectComputation();
        mPauseButton.setEnabled(false);
        mResumeButton.setEnabled(true);
        mStepButton.setEnabled(true);
      }
    });
    // Step button
    mStepButton = new JButton("Step");
    mStepButton.setEnabled(AffectManager.sInterface.getCharacterByName(fCharacterName).isAffectComputationPaused());
    mStepButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        AffectManager.sInterface.getCharacterByName(fCharacterName).stepwiseAffectComputation();
      }
    });

    mControlPanel.add(Box.createHorizontalGlue());
    mControlPanel.add(mPauseButton);
    mControlPanel.add(mResumeButton);
    mControlPanel.add(mStepButton);
    mControlPanel.add(Box.createRigidArea(new Dimension(5, 0)));
    mResumeButton.setFocusCycleRoot(true);
  }

  /**
   * Listens to the slider.
   */
  class SliderListener implements ChangeListener {

    public void stateChanged(ChangeEvent e) {
      ((JSlider) e.getSource()).setSnapToTicks(true);
      JSlider slider = (JSlider) e.getSource();
      if (slider == fPersonalityOnEmotionInfluenceSlider) {
           AffectConsts ac = fCharacter.getAffectConsts();
           double value = slider.getValue() / 100.0d;
           ac.personalityEmotionInfluence = value;
           fCharacter.setAffectConsts(ac);
           return;
      }
      if (slider == emotionDecaySlider) {
          System.out.println("This is emotionDecaySlider");
        int value = slider.getValue();
        emotionDecayTime = value;
        if (value == 0) {
          emotionDecayPeriodSlider.setEnabled(false);
          emotionDecayPanel.setVisible(false);
        } else {
          emotionDecayPeriodSlider.setEnabled(true);
          emotionDecayPanel.setVisible(true);
          emotionDecayPanel.setDecaySteps(steps());
        }
      }
      if (slider == emotionDecayPeriodSlider) {
        emotionDecayPeriod = slider.getValue();
        emotionDecayPanel.setDecaySteps(steps());
      }
      if (slider == moodReturnSlider) {
        int value = slider.getValue();
        moodReturnTime = value;
        if (value == 0) {
          moodUpdatePeriodSlider.setEnabled(false);
        } else {
          moodUpdatePeriodSlider.setEnabled(true);
        }
      }
      
      if(slider == moodTrajectorySlider){
          int value = slider.getValue();
          sAlmaGUI.characterToMoodDisplay.get(fCharacterName).moodTrajectoryDecayTime = value;
      }
      
      if (slider == moodUpdatePeriodSlider) {
        moodReturnPeriod = slider.getValue();
      }
      if (slider == functionParamSlider) {
        double functionParam = (slider.getValue()) / 100.0d;
        CharacterManager character = affectManager.getCharacterByName(fCharacterName);
        character.getDecayFunction().setConfigParameter(functionParam);
       
      }
    }
  }

  public void actionPerformed(ActionEvent e) {
    DecayFunction df = null;
    if (e.getActionCommand().equals("linear")) {
      decayFctString = "linear";
      df = new LinearDecayFunction(steps());
      emotionDecayPanel.setDecayFunction(df);
    }
    if (e.getActionCommand().equals("exponential")) {
      decayFctString = "exponential";
      df = new ExponentialDecayFunction(steps());
      emotionDecayPanel.setDecayFunction(df);
    }
    if (e.getActionCommand().equals("hyperbolic")) {
      decayFctString = "hyperbolic";
      df = new TangensHyperbolicusDecayFunction(steps());
      emotionDecayPanel.setDecayFunction(df);
    }
    if (df != null) {
      double functionParam = df.getConfigParameter();
      functionParam = (functionParam == -1.0d) ? 0.1d : functionParam;
      if (df.hasConfigParameter()) {
        functionParamSlider.setEnabled(true);
        functionParamSlider.setValue((int) (functionParam * 100));
      } else {
        functionParamSlider.setEnabled(false);
        functionParamSlider.setValue((int) (functionParam * 100));
      }
    }
  }

  public void apply(CharacterAffect characterAffectProfile) {
    CharacterManager character = affectManager.getCharacterByName(fCharacterName);
    AffectConsts ac = character.getAffectConsts();
    DecayFunction decayFct = null;
    decayFct = (decayFctString.equals("linear")) ? new LinearDecayFunction() : decayFct;
    decayFct = (decayFctString.equals("exponential")) ? new ExponentialDecayFunction() : decayFct;
    decayFct = (decayFctString.equals("hyperbolic")) ? new TangensHyperbolicusDecayFunction() : decayFct;
    int emotionDecayTime = emotionDecaySlider.getValue();
    ac.emotionMaxBaseline = doubleValue(characterAffectProfile.getEmotionSpecification().getBaseline());
    if (emotionDecayTime > 0) {
      ac.emotionDecayOverallTime = emotionDecayTime * 1000;
      ac.emotionDecayPeriod = emotionDecayPeriod;
      ac.emotionDecaySteps = steps();
      character.setAffectConsts(ac);
      character.setDecayFunction(decayFct);
      // update the character's part in the definition file
      CharacterAffect.EmotionSpecification emoSpec =
        characterAffectProfile.getEmotionSpecification();
      emoSpec.setDecaytime(emotionDecayTime * 1000);
      emoSpec.setDecayperiod(emotionDecayPeriod);
      emoSpec.setDecayfunction(CharacterAffect.EmotionSpecification.Decayfunction.Enum.forString(decayFctString));
    } else {
      character.disableEmotionDecay();
    }
    if (moodReturnTime > 0) {
      ac.moodReturnOverallTime = moodReturnTime * 1000;
      ac.moodReturnPeriod = moodReturnPeriod;
      ac.moodReturnSteps = (new Long(ac.moodReturnOverallTime / ac.moodReturnPeriod)).intValue();
      ac.moodStabilityControlledByNeurotism = neurotismforMoodStabilityButton.isSelected();
      character.setAffectConsts(ac);
      // update the character's part in the definition file
      CharacterAffect.MoodSpecification moodSpec = characterAffectProfile.getMoodSpecification();
      moodSpec.setDecaytime(moodReturnTime * 1000);
      moodSpec.setDecayperiod(moodReturnPeriod);
      moodSpec.setNeurotismstability(ac.moodStabilityControlledByNeurotism);
    } else {
      character.disableMoodComputation();
    }
  }

  /**
   * Compute the amount of decay steps.
   *
   * @return Amount of decay steps and never zero.
   */
  private int steps() {
    // nice try
    if ((emotionDecayTime == 0) || (emotionDecayPeriod == 0)) {
      return 1;
    }
    return (emotionDecayTime * 1000) / emotionDecayPeriod;
  }
}
