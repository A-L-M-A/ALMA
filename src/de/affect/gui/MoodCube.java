package de.affect.gui;

import de.affect.emotion.EmotionType;
import geomerative.RFont;
import geomerative.RG;
import geomerative.RMatrix;
import geomerative.RShape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.Timer;
import peasy.PeasyCam;
import processing.core.PApplet;
import processing.core.PVector;
/**
 *
 * @author Patrick Gebhard,Tengfei Wang
 */
public class MoodCube extends PApplet {

  int mNSize;
  PeasyCam cam;
  RFont f;
  RShape grp;
  RMatrix mat;
 
  
  //for test only
  private String character;
  private JPanel moodCubePanel;
  public int moodTrajectoryDecayTime=1;
  
  //colors
  private  int RED = color(255,0,0);
  private  int GRAY = color(128,128,128);
  private  int WHITE = color(255,255,255);
  private  int BLACK = color(0,0,0);
  private  int GREEN = color(0,128,0);
  private  int YELLOW = color(255,255,0);
  // emotions
  private HashMap<String, PADPoint> m_emotions = new HashMap<String, PADPoint>();
  
 // active emotions
  private HashSet<PADPoint> m_active_emotions = new HashSet<PADPoint>();

   // mood quadrant
  private MoodOctant m_cube;

  // mood point
  //private PADPoint m_mood = new PADPoint(YELLOW);;

  // mood tendency
  //private PADLine m_tendency = new PADLine(WHITE);

  // emotion center
  //private PADPoint[] m_center = new PADPoint[]{new PADPoint(WHITE), new PADPoint(RED)};
  private ArrayDeque<PADPoint> mActiveEmotions = new ArrayDeque<PADPoint>();
  private PADPoint mMoodPoint;
  private PADPoint mEmotionCenter;
  private ArrayList<MoodOctant> mMoodOctantTrack = new ArrayList<MoodOctant>();
  private final ArrayDeque<PADPoint> mMoodTrack = new ArrayDeque<PADPoint>(1000);


  MoodCube(String character,JPanel cubePanel) {
     //System.out.println(mMoodPoint);
     this.character = character;
     this.moodCubePanel = cubePanel;
      //this.init();
  }

  public void addEmotion(PADPoint mp) {
    synchronized (m_active_emotions) {
      m_active_emotions.add(mp);
      //redraw();
    }
    //redraw();
  }

  public void setMood(PADPoint mp) {
    mMoodPoint = mp;
    synchronized (mMoodTrack){
    mMoodTrack.addFirst(mMoodPoint);
    //System.out.println("moodTrajectoryDecayTime   "+character+"  "+moodTrajectoryDecayTime);
    if (mMoodTrack.size() > 100*moodTrajectoryDecayTime) {  
      mMoodTrack.removeLast();
    }
    }
    
    MoodOctant mo = new MoodOctant(this, mMoodPoint.x, mMoodPoint.y, mMoodPoint.z);
    boolean add = true;
    ArrayList<MoodOctant> oldMoodOctants = new ArrayList<MoodOctant>();
    synchronized (mMoodOctantTrack) {
      for (MoodOctant o : mMoodOctantTrack) {
        if (o.equals(mo)) {
          if (o.mDecayVisualizer != null) { // if an octant's decay is highlighted, remember it for removal. 
            oldMoodOctants.add(o);
          } else {
            add = false;
            break;
          }
        }
        if ((o.mDecayVisualizer != null) && (o.mDecayVisualizer.mCurrentStep == 0)) {
          oldMoodOctants.add(o);
        }
      }
      // remove old decay visualisation
      for (MoodOctant o : oldMoodOctants) {
        mMoodOctantTrack.remove(o);
      }
      // add new octant
      if (add) {
        mMoodOctantTrack.add(mo);
      }
    }
    
  }

  @Override
  public void setup() {

    size(0,0,P3D);
    
    mNSize = width / 2;
   
    background(GRAY);

 
    
    //noLoop();
    frameRate(20);

    RG.init(this);
    grp = RG.getText("Center", "FreeSans.ttf", 72, CENTER);

    cam = new PeasyCam(this,700);
    cam.setMinimumDistance(10);
    cam.setMaximumDistance(1000);
    cam.setSuppressRollRotationMode();
    cam.lookAt( 0, 0, 0);
    
    //draw();
  }

  @Override
  public void mouseDragged() {
    //redraw();
  }

  @Override
  public void mouseClicked() {
 
  }

  @Override
  public void keyPressed() {
    if (keyCode == KeyEvent.VK_SPACE) { //space
      //setMood(new PADPoint(random(2.0f) - 1.0f, random(2.0f) - 1.0f, random(2.0f) - 1.0f, 1.0f));
      //redraw();
    }
    if (keyCode == KeyEvent.VK_E) { //e
      //addEmotion(new PADPoint(random(2.0f) - 1.0f, random(2.0f) - 1.0f, random(2.0f) - 1.0f, random(1.0f)));
      //redraw();
    }
  }

  @Override
  public void draw() {
    RG.init(this); 
    int mNSize = width/2;
 
    hint(DISABLE_DEPTH_TEST);

    rotateX(-.5f);
    rotateY(-.5f);

    background(GRAY);
    stroke(0, 50);
    strokeWeight(2.0f);

    // draw axises
    line(-mNSize, 0, 0, 0, 0, 0);
    line(mNSize, 0, 0, 0, 0, 0);
    line(0, 0, -mNSize, 0, 0, 0);
    line(0, 0, mNSize, 0, 0, 0);
    line(0, 0, 0, 0, -mNSize, 0);
    line(0, 0, 0, 0, mNSize, 0);

    // draw mood cube

    fill(235, 221, 68, 20);
    box(width/2);
    
    // always set the cube in the middle
    cam.lookAt( 0, 0, 0);
    // axis legend
      
    fill(127, 40, 40);
    noStroke();
    pushMatrix();
    translate(-mNSize / 2, 0, 0);
    RG.getText("P", "FreeSans.ttf", 36, CENTER).draw();
    popMatrix();
    pushMatrix();
    translate(0, -mNSize / 2, 0);
    RG.getText("A", "FreeSans.ttf", 36, CENTER).draw();
    popMatrix();
    pushMatrix();
    translate(0, 0, -mNSize / 2);
    RG.getText("D", "FreeSans.ttf", 36, CENTER).draw();
    popMatrix();
    
    
    

    // draw mood octants ...
    synchronized (mMoodOctantTrack) {
      for (MoodOctant o : mMoodOctantTrack) {
        if (!o.containsMood(mMoodPoint.x, mMoodPoint.y, mMoodPoint.z)) {
          if (o.mDecayVisualizer == null) {
            o.decayHighlight();
          }
        }
        o.draw();
      }
    }
    
    // draw trajectory of the mood center ...
    synchronized (mMoodTrack){
        if (mMoodTrack.size() > 1) {
          PADPoint[] track = mMoodTrack.toArray(new PADPoint[0]);
          //System.out.println(character+"track length:"+track.length);
         
          for (int i = 0; i < track.length - 1; i++) {
            //System.out.println("transparent " + (200 - (200 / (track.length - 1)) * i));
            strokeWeight(10.0f - (10.0f / (track.length - 1)) * i);
            stroke(235, 0, 68, 200 - (200 / (track.length - 1)) * i);
            line(track[i].x * mNSize / 2, track[i].y * mNSize / 2, track[i].z * mNSize / 2, track[i + 1].x * mNSize / 2, track[i + 1].y * mNSize / 2, track[i + 1].z * mNSize / 2);
          }
        }
    }
    
    //draw line between mood center and emotion ...
    if(m_active_emotions.size() > 0){

        PADPoint[] track = m_active_emotions.toArray(new PADPoint[0]);
        
        if(m_active_emotions.size() ==1){
            strokeWeight(1.0f );
            stroke(WHITE);
            line(track[0].x*mNSize / 2,track[0].y*mNSize / 2,track[0].z*mNSize / 2,mMoodPoint.x*mNSize / 2,mMoodPoint.y*mNSize / 2,mMoodPoint.z*mNSize / 2);
        }
        
        else{
                
            if(mEmotionCenter != null){
              noStroke();
              lights();
              fill(GREEN);
              pushMatrix();
              translate(mEmotionCenter.x * mNSize / 2, mEmotionCenter.y * mNSize / 2,mEmotionCenter.z * mNSize / 2);
              sphere(mEmotionCenter.mIntensity * 10);
              popMatrix();
              strokeWeight(1.0f );
              stroke(WHITE);
              line(mEmotionCenter.x*mNSize / 2,mEmotionCenter.y*mNSize / 2,mEmotionCenter.z*mNSize / 2,mMoodPoint.x*mNSize / 2,mMoodPoint.y*mNSize / 2,mMoodPoint.z*mNSize / 2);
            }
        }
  
    
    }


        
    // draw mood point
    if (mMoodPoint != null) {
      
      noStroke();
      lights();
      fill(235, 221, 68, 200);
      pushMatrix();
      translate(mMoodPoint.x * mNSize / 2, mMoodPoint.y * mNSize / 2, mMoodPoint.z * mNSize / 2);
      sphere(mMoodPoint.mIntensity * 20);
      popMatrix();

      // draw emotions
      synchronized (m_active_emotions) {
        for (PADPoint pad : m_active_emotions) {
          noStroke();
          fill(235, 28, 20, pad.mIntensity * 200);
          //System.out.println("Intensity:  "+pad.mIntensity);
          pushMatrix();
          translate(pad.x * mNSize / 2, pad.y * mNSize / 2, pad.z * mNSize / 2);
          sphere(pad.mIntensity * 20);
          popMatrix();
        }
        
      }
    }


  }
  
    /**
   * Update mood.
   * @param p Pleasure value.
   * @param a Arousal value.
   * @param d Dominance value.
   * @param intensity Mood intensity;
   */
  public void updateMood(double p, double a, double d, double intensity) {
    /*Vector3d pos = new Vector3d(p, d, a);
    m_cube.update(pos);
    m_mood.update(pos, intensity);
    m_tendency.update(m_mood, m_center[0]);*/
      
    PADPoint pos = new PADPoint((float) p,(float) a,(float) d,(float) intensity);
    setMood(pos);
    //redraw();
  }

  /**
   * Update emotion center.
   * @param p Pleasure value.
   * @param a Arousal value.
   * @param d Dominance value.
   * @param intensity Emotion intensity;
   */
  public void updateEmotionCenter(double p, double a, double d, double intensity) {
    /*Vector3d pos = new Vector3d(p, d, a);
    m_center[0].update(pos, (intensity > 0.2f) ? 0.2f : intensity);
    m_center[1].update(pos, intensity);
    updateTendency();*/
    mEmotionCenter = new PADPoint((float) p,(float) a,(float) d,(float) intensity);
    updateTendency();
    
  }

  /**
   * Hide emotion center.
   */
  public void hideEmotionCenter() {
    /*m_center[0].hide();
    m_center[1].hide();
    updateTendency();*/
  }

  /**
   * Update emotion.
   * @param name Emotion name.
   * @param p Pleasure value.
   * @param a Arousal value.
   * @param d Dominance value.
   * @param intensity Emotion intensity;
   */
  public void updateEmotion(String name, double p, double a, double d, double intensity) {
    // get point
    PADPoint emotion = m_emotions.get(name);
    if (emotion == null) {
      if (name.equalsIgnoreCase(EmotionType.Physical.toString())) {
        m_emotions.put(name, emotion  = new PADPoint((float)p,(float)a,(float) d,(float)intensity));
      } else {
        m_emotions.put(name,  emotion = new PADPoint((float)p,(float)a,(float) d,(float)intensity));
      }
    }
    // perform update
    //m_active_emotions.add(emotion);
    
    emotion.update( (float)p, (float)a, (float) d,(float) intensity);
    PADPoint pos = new PADPoint((float) p,(float) a,(float) d,(float) intensity);
    addEmotion(pos);
    //redraw();
    
  }

  /**
   * Hide emotion from display.
   * @param name Emotion name.
   */
  public void hideEmotion(String name) {
    PADPoint emotion = m_emotions.get(name);
    //System.out.println(emotion);
    if (emotion != null) {
         //System.out.println("hahahahahahhaahhhhhahahahahahahahaha");
         Iterator<PADPoint> iterator = m_active_emotions.iterator();
         while (iterator.hasNext()) {
              PADPoint element = iterator.next();
              if (element.x ==emotion.x && element.y ==emotion.y && element.z ==emotion.z) {
                  //System.out.println("this is a test to see if the hideEmotion works@#$&&*&&&&&&&&&&");
                  iterator.remove();
              }
         }
      //m_active_emotions.remove(emotion);
      //test
      //System.out.println("this is a test to see if the hideEmotion works@#$&&*&&&&&&&&&&");
      //emotion.hide();
      redraw();
    }
  }

  /**
   * Update mood tendency.
   */
  public void updateTendency() {
    // draw line to emotion center
   /* if (m_center[0].visible()) {
      m_tendency.update(m_mood, m_center[0]);
    } // draw line to single active emotion
    else if (m_active_emotions.size() == 1) {
      m_tendency.update(m_mood, m_active_emotions.iterator().next());
    } // simply hide it
    else {
      m_tendency.hide();
    }*/
  }

  private class PADPoint extends PVector {//this one should be modified
      

    // intensity

    float mIntensity;


    PADPoint(float x, float y, float z) {
      super(x, y, z);
      mIntensity = 0;
    }

    public PADPoint(float x, float y, float z, float i) {
      super(x, y, z);
      mIntensity = i;
    }
    
     public void update(float p, float a, float d, float intensity) {
          for (PADPoint pad : m_active_emotions) {
              if(pad.x == p && pad.y == a && pad.z == d){
                  pad.mIntensity = intensity;
                  redraw();
              }
          }

         System.out.println("this is intensity in emotion"+intensity);
    }
  }
  
  
  private class MoodOctant extends PVector implements Comparator {

     public Visualisation mDecayVisualizer;
     private MoodCube mMc;

     MoodOctant(MoodCube mc, float x, float y, float z) {
       super(Math.signum(x) * mc.width / 8, Math.signum(y) * mc.width / 8, Math.signum(z) * mc.width / 8);
       mMc = mc;
     }

     public void decayHighlight() {
       mDecayVisualizer = new Visualisation(mMc);
     }

     public void draw() {
       if (mDecayVisualizer == null) {
         mMc.strokeWeight(1.0f);
         mMc.stroke(0, 50);
         mMc.fill(235, 221, 68, 20);
       } else {
         mMc.noStroke();
         mMc.fill(160, 160, 160, mDecayVisualizer.mCurrentStep);
       }


       mMc.pushMatrix();
       mMc.translate(x, y, z);
       mMc.box(mMc.width / 4);
       mMc.popMatrix();
  }

     public boolean containsMood(float p, float a, float d) {
       if ((x == Math.signum(p) * mMc.width / 8) && (y == Math.signum(a) * mMc.width / 8) && (z == Math.signum(d) * mMc.width / 8)) {
          return true;
       } else {
         return false;
       }
     }

     @Override
     public int compare(Object o, Object p) {
        MoodOctant mo = (MoodOctant) o;
        MoodOctant mp = (MoodOctant) p;

       if ((mo.x == mp.x) && (mo.y == mp.y) && (mo.z == mp.z)) {
          return 0;
       } else {
         return -1;
       }
     }
   }
  

  
  private class Visualisation implements ActionListener {

     public int mCurrentStep = 20;
     public Timer mTimer;
     private MoodCube mMc;

      public Visualisation(MoodCube mc) {
       mMc = mc;
       mTimer = new Timer(20, this);
       mTimer.start();
     }

     public Visualisation(MoodCube ws, int intervall) {
       mMc = ws;
       mTimer = new Timer(intervall, this);
       mTimer.start();
     }
  
     @Override
     public void actionPerformed(ActionEvent e) {
       mCurrentStep -= 1;
       mMc.redraw();
       if (mCurrentStep <= 0) {
         mCurrentStep = 0;
         mTimer.stop();
       }
  }
}

}
