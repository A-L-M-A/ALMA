/*
 * CharacterConfigPanel.java
 *
 * Copyright (c) 2004, 2005, 2006, 2007, 2008, Patrick Gebhard, DFKI GmbH
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in 
 *     the documentation and/or other materials provided with the 
 *     distribution.
 *
 *   - Neither the name of the DFKI GmbH nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE. 
 */

package de.affect.gui;

import de.affect.data.AffectConsts;
import static de.affect.gui.AlmaGUI.sAlmaGUI;
import static de.affect.gui.AlmaGUI.sBORDERLINE;
import static de.affect.gui.AlmaGUI.sDefaultTextFont;
import static de.affect.gui.AlmaGUI.sDefaultTitleFont;
import static de.affect.gui.Helpers.createHelpers;
import static de.affect.gui.Helpers.getFillerBox;
import static de.affect.gui.Helpers.makeJSliderHorizontal;
import static de.affect.gui.Helpers.signumLabels;
import static de.affect.gui.Helpers.smallNumberConfigLabel;
import de.affect.manage.AffectManager;
import de.affect.manage.CharacterManager;
import de.affect.personality.Personality;
import de.affect.personality.PersonalityEmotionsRelations;
import static de.affect.util.Convert.prettyPrint;

import de.affect.xml.AffectDefinitionDocument.AffectDefinition.*;
import de.affect.xml.AffectDefinitionDocument.AffectDefinition.CharacterAffect;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.StringTokenizer;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createCompoundBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createEmptyBorder;
import static javax.swing.BorderFactory.createLineBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import static javax.swing.BorderFactory.createTitledBorder;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class CharacterConfigPanel extends JPanel implements ChangeListener, ActionListener{

  private static AffectManager.InterfaceHolder affectManager = AffectManager.sInterface;
  private CharacterManager fCharacter = null;
  private boolean fShowRuntimeMonitor = false;
  private JCheckBox fShowRuntimeMonitorCheckBox = null;
  private JTextArea fCharacterDescriptionTextArea = null;
  private String fCharacterDescription = "-";
  private Hashtable<JSlider, String> sliderToTrait = new Hashtable<JSlider, String>();
  private JSlider fPersonalityOnEmotionInfluenceSlider = null;
  private JButton deleteButton = null;
  private String characterName = null;
 
  
  public CharacterConfigPanel(String characterName, CharacterAffect characterAffectProfile) {
    createHelpers();
    this.characterName = characterName;
    try {
      fCharacter = affectManager.getCharacterByName(characterName);
    } catch(IllegalArgumentException iae) {
      iae.printStackTrace();
      return;
    }
  
    this.setOpaque(false);
    JPanel personalityPanel = new JPanel();
    personalityPanel.setOpaque(false);
    personalityPanel.setLayout(new BoxLayout(personalityPanel, BoxLayout.Y_AXIS));
    //Personality Trait Stuff
    JPanel personalityTraitPanel = new JPanel();
    personalityTraitPanel.setOpaque(false);
    personalityTraitPanel.setLayout(new BoxLayout(personalityTraitPanel, BoxLayout.Y_AXIS));
    JPanel metaPanel = new JPanel();
    metaPanel.setOpaque(false);
    metaPanel.setLayout(new BoxLayout(metaPanel, BoxLayout.Y_AXIS));
    fShowRuntimeMonitor = characterAffectProfile.getMonitored();
    fCharacterDescription = characterAffectProfile.getDocu();
    CharacterAffect.PersonalitySpecification persSpec = characterAffectProfile.getPersonalitySpecification();
    boolean derived = persSpec.getDerived();
    Hashtable<String, Double> personalityTraits = new Hashtable<String, Double>();
    Hashtable<String, String> traitDescription = new Hashtable<String, String>();
    personalityTraits.put("Openness", new Double(persSpec.getOpenness()));
    traitDescription.put("Openness", 
      "Interest in intellectual issues, unconventional values, aesthetic sensitivity, need for variety");
    personalityTraits.put("Conscientiousness", new Double(persSpec.getConscientiousness()));
    traitDescription.put("Conscientiousness", 
       "Task-oriented characteristics such as being dependable, responsible, and orderly");
    personalityTraits.put("Extraversion", new Double(persSpec.getExtraversion()));
    traitDescription.put("Extraversion", "Tendency to be sociable and experience positive affect");
    personalityTraits.put("Agreeableness", new Double(persSpec.getAgreeableness()));
    traitDescription.put("Agreeableness", "Tendency to be interpersonally pleasant and compliant");
    personalityTraits.put("Neuroticism", new Double(persSpec.getNeurotism()));
    traitDescription.put("Neuroticism", "Tendency to experience anxiety and other negative emotions");
    StringTokenizer traitTokenizer = 
      new StringTokenizer("Openness,Conscientiousness,Extraversion,Agreeableness,Neuroticism", ",");
    while (traitTokenizer.hasMoreTokens()) {
      String personalityTrait = traitTokenizer.nextToken();
      JLabel personalityTraitLabel = new JLabel(personalityTrait, JLabel.RIGHT); 
      personalityTraitLabel.setOpaque(false);
      JLabel traitText = new JLabel(traitDescription.get(personalityTrait));
      traitText.setOpaque(false);
      traitText.setFont(sDefaultTextFont);
      traitText.setMinimumSize(new Dimension (200, 16));//(415,16)
      traitText.setPreferredSize(new Dimension (415, 26));
      JPanel descriptionPanel = new JPanel();
      descriptionPanel.setOpaque(false);
      descriptionPanel.setLayout(new BoxLayout(descriptionPanel, BoxLayout.X_AXIS));
      descriptionPanel.add(traitText);
      Double personalityTraitValue = personalityTraits.get(personalityTrait) * 10.0d;
      JSlider persTraitSlider = makeJSliderHorizontal(-10, 10, personalityTraitValue.intValue(), 
						      10, 1, signumLabels, this);
      persTraitSlider.addChangeListener(this);
      persTraitSlider.setOpaque(false);
      persTraitSlider.setToolTipText(traitDescription.get(personalityTrait));
      sliderToTrait.put(persTraitSlider, personalityTrait);
      JPanel sliderPanel = new JPanel();
      sliderPanel.setOpaque(false);
      sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.X_AXIS));
      sliderPanel.add(persTraitSlider);
      JPanel itemPanel = new JPanel();
      itemPanel.setOpaque(false);
      itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));
      itemPanel.add(descriptionPanel);
      itemPanel.add(sliderPanel);
      Border border = 
	createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
						" " + personalityTrait + " ", 0 , 0, sDefaultTitleFont),
			     createEmptyBorder(1, 1, 1, 1));
      itemPanel.setBorder(border);
      
      personalityTraitPanel.add(itemPanel);
    }
   // Border border = 
      //createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
	//				      " Personality Traits ", 0 , 0, sDefaultTitleFont),
	//		   createEmptyBorder(1, 1, 1, 1));
    //personalityTraitPanel.setBorder(border);
    //Personality Influcene Stuff
   /* JPanel personalityInfluencePanel = new JPanel();//tengfei
    personalityInfluencePanel.setLayout(new BoxLayout(personalityInfluencePanel, BoxLayout.Y_AXIS));
    Double val = new Double(persSpec.getEmotioninfluence()) * 100.0d;
    fPersonalityOnEmotionInfluenceSlider = makeJSliderHorizontal(0, 50, val.intValue(), 
								 10, 5, smallNumberConfigLabel, this);
    fPersonalityOnEmotionInfluenceSlider.addChangeListener(this);
    personalityInfluencePanel.add(fPersonalityOnEmotionInfluenceSlider);
    border = 
      createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
					      " Personality Influence ", 0 , 0, sDefaultTitleFont),
			   createEmptyBorder(1, 1, 1, 1));
    personalityInfluencePanel.setBorder(border);*/
    
    personalityPanel.add(personalityTraitPanel);
    //personalityPanel.add(personalityInfluencePanel);
    JPanel deleteCharacterPanel = new JPanel();
    deleteCharacterPanel.setOpaque(false);
    //border = createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
	//					     " Delete Character ", 0 , 0, sDefaultTitleFont),
	//			  createEmptyBorder(1, 1, 1, 1));
    //deleteCharacterPanel.setBorder(border);
    deleteCharacterPanel.setLayout(new BoxLayout(deleteCharacterPanel, BoxLayout.X_AXIS));
    deleteButton = new JButton("Delete Character");
    deleteButton.setOpaque(false);
    deleteCharacterPanel.add(Box.createHorizontalGlue());
    deleteCharacterPanel.add(deleteButton);
    personalityPanel.add(deleteCharacterPanel);
    deleteButton.addActionListener(this);
            
				
    JPanel blackPanel = new JPanel();
    blackPanel.setOpaque(false);
    personalityPanel.add(blackPanel);
    //deleteCharacterPanel.add(Box.createVerticalGlue());//tengfei

    // Operation Mode Stuff
    /*JPanel checkBoxPanel = new JPanel();//tengfei
    checkBoxPanel.setLayout(new BoxLayout(checkBoxPanel, BoxLayout.X_AXIS));
    fShowRuntimeMonitorCheckBox = 
      new JCheckBox("Show runtime affect monitor", fShowRuntimeMonitor);
    checkBoxPanel.add(fShowRuntimeMonitorCheckBox);
    checkBoxPanel.add(getFillerBox(0, 0, 5000, 5000));
    border = createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
						     " Runtime Config ", 0 , 0, sDefaultTitleFont),
				  createEmptyBorder(1, 1, 1, 1));
    checkBoxPanel.setBorder(border);*/
    
    // Character Description Stuff
    fCharacterDescriptionTextArea =
      new JTextArea(fCharacterDescription, 3, 2);
    fCharacterDescriptionTextArea.setLineWrap(true);
    //fCharacterDescriptionTextArea.setOpaque(false);
    JScrollPane decriptionScrollPane = new JScrollPane(fCharacterDescriptionTextArea);
    decriptionScrollPane.setOpaque(false);
    Border border = createCompoundBorder(createTitledBorder(createLineBorder(sBORDERLINE), 
						     " Character Description ", 0 , 0, sDefaultTitleFont),
				  createEmptyBorder(1, 1, 1, 1));
    
    decriptionScrollPane.setBorder(border);
    decriptionScrollPane.setMinimumSize(new Dimension(100,300));
    decriptionScrollPane.setPreferredSize(new Dimension(200,400));
    metaPanel.add(decriptionScrollPane);
    metaPanel.add(Box.createRigidArea(new Dimension(4, 4)));
    //metaPanel.add(checkBoxPanel);//tengfei

    // Tie all together
    this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
    add(personalityPanel);
    personalityPanel.add(Box.createRigidArea(new Dimension(4, 4)));
    add(metaPanel);
   
    
  }
  
  /**
   * delete button pressed
   */

  
   public void actionPerformed(ActionEvent e) {
        sAlmaGUI.removeCharacter(characterName);
        sAlmaGUI.tabbedPanel.remove(sAlmaGUI.tabbedPanel.getSelectedIndex());

        sAlmaGUI.interaction.removeAll();
        InteractionSimulationInternalFrame interactionFrame= new InteractionSimulationInternalFrame();
        sAlmaGUI.interactionPanel = interactionFrame.m_panel;
        sAlmaGUI.interaction.add(sAlmaGUI.interactionPanel);
    }

  /**
   * Apply changes to character profile.
   * @param characterAffectProfile The profile to modify.
   */
  public void apply (CharacterAffect characterAffectProfile) {
    CharacterAffect.PersonalitySpecification personality = characterAffectProfile.getPersonalitySpecification ();
    for (JSlider slider: sliderToTrait.keySet()) {
      String trait = sliderToTrait.get (slider);
      double value = slider.getValue() / 10.0d;
      if (trait.equals("Openness"))
        personality.setOpenness (value);
      else if (trait.equals("Conscientiousness"))
        personality.setConscientiousness (value);
      else if (trait.equals("Extraversion"))
        personality.setExtraversion (value);
      else if (trait.equals("Agreeableness"))
        personality.setAgreeableness (value);
      else if (trait.equals("Neuroticism"))
        personality.setNeurotism (value);
    }
    double value = fPersonalityOnEmotionInfluenceSlider.getValue() / 100.0d;
    personality.setEmotioninfluence(prettyPrint(value));
    characterAffectProfile.setMonitored(fShowRuntimeMonitorCheckBox.isSelected());
    characterAffectProfile.setDocu(fCharacterDescriptionTextArea.getText());
  }

  /** Listens to the slider. */
  public void stateChanged(ChangeEvent e) {
    JSlider slider = (JSlider)e.getSource();
    slider.setSnapToTicks(true);
    if (slider == fPersonalityOnEmotionInfluenceSlider) {
      AffectConsts ac = fCharacter.getAffectConsts();
      double value = slider.getValue() / 100.0d;
      ac.personalityEmotionInfluence = value;
      fCharacter.setAffectConsts(ac);
      return;
    }
    String personalityTrait = sliderToTrait.get(slider);
    double value = slider.getValue() / 10.0d;
    double openness = fCharacter.getPersonality().getOpenness();
    double conscientiousness = fCharacter.getPersonality().getConscientiousness();
    double extraversion = fCharacter.getPersonality().getExtraversion();
    double agreeableness = fCharacter.getPersonality().getAgreeableness();
    double neurotism = fCharacter.getPersonality().getNeurotism();
    PersonalityEmotionsRelations perEmoRels = 
      fCharacter.getPersonality().getPersonalityEmotionsRelations();
    if (personalityTrait.equals("Openness")) {
      fCharacter.setPersonality(new Personality(value, conscientiousness, 
						extraversion, agreeableness, 
						neurotism, perEmoRels));
    }
    if (personalityTrait.equals("Conscientiousness")) {
      fCharacter.setPersonality(new Personality(openness, value, extraversion, 
						agreeableness, neurotism,
						perEmoRels));
    }
    if (personalityTrait.equals("Extraversion")) {
      fCharacter.setPersonality(new Personality(openness, conscientiousness, 
						value, agreeableness, 
						neurotism, perEmoRels));
    }
    if (personalityTrait.equals("Agreeableness")) {
      fCharacter.setPersonality(new Personality(openness, conscientiousness, 
						extraversion, value, 
						neurotism, perEmoRels));
    }
    if (personalityTrait.equals("Neuroticism")) {
      fCharacter.setPersonality(new Personality(openness, conscientiousness, 
						extraversion, agreeableness, 
						value, perEmoRels));
    }
  }

}
