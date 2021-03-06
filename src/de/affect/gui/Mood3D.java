/**
 * Mood3D.java
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

// utils
import java.util.HashMap;
import java.util.HashSet;

// awt
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;

// swing
import javax.swing.JFrame;

// colors and points
import javax.vecmath.Color3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

// java 3d stuff
import javax.media.j3d.Alpha;
import javax.media.j3d.Font3D;
import javax.media.j3d.Text3D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Material;
import javax.media.j3d.LineArray;
import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Transform3D;
import javax.media.j3d.AmbientLight;
import javax.media.j3d.FontExtrusion;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.PolygonAttributes;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.RotationInterpolator;
import javax.media.j3d.TransparencyAttributes;

// sun stuff
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;

// math statics
import de.affect.emotion.EmotionType;
import static java.lang.Math.PI;

// capabilities
import static javax.media.j3d.Group.ALLOW_CHILDREN_WRITE;
import static javax.media.j3d.Group.ALLOW_CHILDREN_EXTEND;
import static javax.media.j3d.Group.ALLOW_CHILDREN_READ;
import static javax.media.j3d.Shape3D.ALLOW_GEOMETRY_WRITE;
import static javax.media.j3d.TransformGroup.ALLOW_TRANSFORM_WRITE;

// other stuff
import static javax.media.j3d.GeometryArray.COLOR_3;
import static javax.media.j3d.GeometryArray.COORDINATES;
import static javax.media.j3d.PolygonAttributes.CULL_BACK;
import static javax.media.j3d.PolygonAttributes.POLYGON_FILL;
import static javax.media.j3d.TransparencyAttributes.BLENDED;
import static javax.media.j3d.TransparencyAttributes.FASTEST;

// sun statics
import static com.sun.j3d.utils.geometry.Sphere.GENERATE_NORMALS;

/**
 * Extended Canvas3D object for displaying points in the PAD space.
 * @author Gernot Gebhard (based on conceptual work of Patrick Gebhard)
 */
public class Mood3D extends Canvas3D implements MouseListener, MouseWheelListener, MouseMotionListener {
  // universe, where everything starts

  private SimpleUniverse m_universe;

  // position of the camera
  private TransformGroup m_position;

  // rotation of the camera
  private TransformGroup m_rotation;

  // scene rotator
  private RotationInterpolator m_rotator = null;

  // main scene
  private BranchGroup m_scene;

  // mood quadrant
  private MoodOctantCube m_cube = new MoodOctantCube();

  // mood point
  private PADPoint m_mood = new PADPoint(YELLOW);

  // mood tendency
  private PADLine m_tendency = new PADLine(WHITE);

  // emotion center
  private PADPoint[] m_center = new PADPoint[]{new PADPoint(WHITE), new PADPoint(RED, 0.6f)};

  // emotions
  private HashMap<String, PADPoint> m_emotions = new HashMap<String, PADPoint>();

  // active emotions
  private HashSet<PADPoint> m_active_emotions = new HashSet<PADPoint>();

  // mouse listener data
  private Vector3d m_pos = new Vector3d();

  // old mouse x position
  private int m_oldx;

  // old mouse y position
  private int m_oldy;

  // toggles zooming/rotating
  private boolean m_begin;

  // view angle
  private double m_angle;

  // internally used colors
  private static final Color3f RED = new Color3f(1.0f, 0.0f, 0.0f);
  private static final Color3f GRAY = new Color3f(0.5f, 0.5f, 0.5f);
  private static final Color3f WHITE = new Color3f(1.0f, 1.0f, 1.0f);
  private static final Color3f BLACK = new Color3f(0.0f, 0.0f, 0.0f);
  private static final Color3f GREEN = new Color3f(0.0f, 1.0f, 0.0f);
  private static final Color3f YELLOW = new Color3f(0.5f, 0.5f, 0.0f);

  // internally used object apperances
  private static final Appearance CUBE;
  

  static {
    // highlighting
    CUBE = new Appearance();
    CUBE.setColoringAttributes(new ColoringAttributes(YELLOW, ColoringAttributes.FASTEST));
    CUBE.setTransparencyAttributes(new TransparencyAttributes(FASTEST, 0.5f));
  }

  /**
   * Main function. For testing purposes only.
   * @param args Command line arguments.
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Mood3D");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 350);
    frame.add(new Mood3D(0.0, 0.0, -6.0, 0.0, true, 64000));
    frame.setVisible(true);
  }

  /**
   * Mood3D Constructor.
   * @param x Camera x position.
   * @param y Camera y position.
   * @param z Camera z position.
   * @param angle Camera angle.
   * @param rotating Scene is rotating?
   * @param speed Scene rotation speed (the more the slower). Ignored if not rotating.
   */
  public Mood3D(double x, double y, double z, double angle, boolean rotating, long speed) {
    // create canvas
    super(SimpleUniverse.getPreferredConfiguration());

    // init world
    m_universe = new SimpleUniverse(this);
    BranchGroup top = new BranchGroup();
    BoundingSphere bounds = new BoundingSphere(new Point3d(0.0, 0.0, 0.0), 100.0);
    m_scene = createScene(bounds);

    // init camera
    m_position = new TransformGroup();
    m_rotation = new TransformGroup();
    m_position.setCapability(ALLOW_TRANSFORM_WRITE);
    m_rotation.setCapability(ALLOW_TRANSFORM_WRITE);

    // set inital camera
    setViewPosition(x, y, z);
    setViewAngle(angle);

    // add rotator (or not)
    if (rotating) {
      Alpha alpha = new Alpha(-1, speed);
      Transform3D axis = new Transform3D();
      TransformGroup rotation = new TransformGroup();
      rotation.setCapability(ALLOW_TRANSFORM_WRITE);
      m_rotator = new RotationInterpolator(alpha, rotation, axis, 0.0f, (float) PI * 2.0f);
      m_rotator.setSchedulingBounds(bounds);
      top.addChild(m_rotator);
      rotation.addChild(m_scene);
      m_rotation.addChild(rotation);
    } else {
      m_rotation.addChild(m_scene);
    }

    // compose rest
    m_position.addChild(m_rotation);
    top.addChild(m_position);
    top.compile();

    // finish stuff
    m_universe.addBranchGraph(top);

    // mouse listener
    addMouseListener(this);
    addMouseWheelListener(this);
    addMouseMotionListener(this);
  }

  /**
   * Overrriden paint method.
   * @param g Graphics context.
   */
  public void paint(Graphics g) {
    super.paint(g);
    Toolkit.getDefaultToolkit().sync();
  }

  /**
   * Any mouse button is down.
   * @param e Event.
   */
  public void mousePressed(MouseEvent e) {
    m_begin = true;
    if (m_rotator != null) {
      m_rotator.getAlpha().pause();
    }
  }

  /**
   * All mouse buttons are up.
   * @param e Event.
   */
  public void mouseReleased(MouseEvent e) {
    if (m_rotator != null) {
      m_rotator.getAlpha().resume();
    }
  }

  /**
   * Mouse wheel has been scrolled.
   * @param e Event.
   */
  public void mouseWheelMoved(MouseWheelEvent e) {
    m_pos.z -= ((double) e.getWheelRotation()) / 2.0;
    setViewPosition(m_pos.x, m_pos.y, m_pos.z);
  }

  /**
   * Mouse has been moved.
   * @param e Event.
   */
  public void mouseDragged(MouseEvent e) {
    // dont update yet
    if (!m_begin) // move around
    {
      if (e.isControlDown()) {
        m_pos.z -= ((double) (m_oldy - e.getY())) / 4.0;
        setViewPosition(m_pos.x, m_pos.y, m_pos.z);
      } // rotate around
      else {
        m_angle += (double) (e.getX() - m_oldx);
        setViewAngle(m_angle);
      }
    } // dragging has started
    else {
      m_begin = false;
    }

    // update old pos
    m_oldx = e.getX();
    m_oldy = e.getY();
  }

  // ignored mouse events
  public void mouseMoved(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }

  public void mouseClicked(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  /**
   * Set view position.
   * @param x Camera x position.
   * @param y Camera y position.
   * @param z Camera z position.
   */
  public void setViewPosition(double x, double y, double z) {
    // create translation matrix
    Transform3D translate = new Transform3D();
    translate.set(new Vector3d(x, y, z));

    // translate scene
    m_position.setTransform(translate);
    m_pos.x = x;
    m_pos.y = y;
    m_pos.z = z;
  }

  /**
   * Set view angle.
   * @param angle Camera angle.
   */
  public void setViewAngle(double angle) {
    // create transformation matrix
    Transform3D view = new Transform3D(), rotate = new Transform3D();
    view.rotX(Math.PI / 8.0);
    rotate.rotY(Math.PI * angle / 180.0);
    view.mul(rotate);

    // rotate scene
    m_rotation.setTransform(view);
    m_angle = angle;
  }

  /**
   * Update mood.
   * @param p Pleasure value.
   * @param a Arousal value.
   * @param d Dominance value.
   * @param intensity Mood intensity;
   */
  public void updateMood(double p, double a, double d, double intensity) {
    Vector3d pos = new Vector3d(p, d, a);
    m_cube.update(pos);
    m_mood.update(pos, intensity);
    m_tendency.update(m_mood, m_center[0]);
  }

  /**
   * Update emotion center.
   * @param p Pleasure value.
   * @param a Arousal value.
   * @param d Dominance value.
   * @param intensity Emotion intensity;
   */
  public void updateEmotionCenter(double p, double a, double d, double intensity) {
    Vector3d pos = new Vector3d(p, d, a);
    m_center[0].update(pos, (intensity > 0.2f) ? 0.2f : intensity);
    m_center[1].update(pos, intensity);
    updateTendency();
  }

  /**
   * Hide emotion center.
   */
  public void hideEmotionCenter() {
    m_center[0].hide();
    m_center[1].hide();
    updateTendency();
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
        m_emotions.put(name, emotion = new PADPoint(GREEN));
      } else {
        m_emotions.put(name, emotion = new PADPoint(RED));
      }
    }
    // perform update
    m_active_emotions.add(emotion);
    emotion.update(new Vector3d(p, d, a), intensity);
    updateTendency();
  }

  /**
   * Hide emotion from display.
   * @param name Emotion name.
   */
  public void hideEmotion(String name) {
    PADPoint emotion = m_emotions.get(name);
    if (emotion != null) {
      m_active_emotions.remove(emotion);
      emotion.hide();
    }
  }

  /**
   * Update mood tendency.
   */
  public void updateTendency() {
    // draw line to emotion center
    if (m_center[0].visible()) {
      m_tendency.update(m_mood, m_center[0]);
    } // draw line to single active emotion
    else if (m_active_emotions.size() == 1) {
      m_tendency.update(m_mood, m_active_emotions.iterator().next());
    } // simply hide it
    else {
      m_tendency.hide();
    }
  }

  /**
   * Creates scene with axes with "PAD" description and box.
   * @param bounds Effect boundaries.
   */
  private BranchGroup createScene(BoundingSphere bounds) {
    // this is where everything else is placed in
    BranchGroup scene = new BranchGroup();
    scene.setCapability(ALLOW_CHILDREN_READ);
    scene.setCapability(ALLOW_CHILDREN_WRITE);
    scene.setCapability(ALLOW_CHILDREN_EXTEND);

    // ambient light
    AmbientLight ambientLightNode = new AmbientLight(GRAY);
    ambientLightNode.setInfluencingBounds(bounds);
    scene.addChild(ambientLightNode);

    // directional light
    DirectionalLight light = new DirectionalLight(GRAY, new Vector3f(-1.0f, -1.0f, -1.0f));
    light.setInfluencingBounds(bounds);
    scene.addChild(light);

    // global cube
    Appearance appearance = new Appearance();
    appearance.setColoringAttributes(new ColoringAttributes(WHITE, ColoringAttributes.FASTEST));
    appearance.setTransparencyAttributes(new TransparencyAttributes(FASTEST, 0.75f));
    appearance.setPolygonAttributes(new PolygonAttributes(POLYGON_FILL, CULL_BACK, 0.2f));
    Box cube = new Box(1.0f, 1.0f, 1.0f, appearance);
    scene.addChild(cube);

    // global cube border
    scene.addChild(createAxes(1.25f, 1.25f, 1.25f, GRAY));
    scene.addChild(createBorder(1.0f, 1.0f, 1.0f, GRAY));

    // add description
    Material material = new Material(RED, BLACK, RED, WHITE, 30.0f);
    material.setLightingEnable(true);
    appearance = new Appearance();
    appearance.setMaterial(material);
    Font3D font = new Font3D(new Font("Arial", Font.PLAIN, 1), new FontExtrusion());
    Transform3D scale = new Transform3D();
    TransformGroup text;

    // P
    scale.set(0.20, new Vector3d(1.25, -0.075, 0.0));
    text = new TransformGroup(scale);
    text.addChild(new Shape3D(new Text3D(font, "P"), appearance));
    scene.addChild(text);

    // A
    scale.set(0.20, new Vector3d(0.0, -0.075, 1.25));
    text = new TransformGroup(scale);
    text.addChild(new Shape3D(new Text3D(font, "A"), appearance));
    scene.addChild(text);

    // D
    scale.set(0.20, new Vector3d(0.0, 1.175, 0.0));
    text = new TransformGroup(scale);
    text.addChild(new Shape3D(new Text3D(font, "D"), appearance));
    scene.addChild(text);

    // done
    return scene;
  }

  /**
   * Create axes.
   * @param xdim Width "radius".
   * @param ydim Height "radius".
   * @param zdim Depht "radius".
   * @param color Axes color.
   */
  private Shape3D createAxes(float xdim, float ydim, float zdim, Color3f color) {
    // compose lines
    Point3f pos = new Point3f();
    LineArray lines = new LineArray(6, COORDINATES | COLOR_3);
    for (int index = 0; index < 6; ++index) {
      pos.x = (index == 0) ? -xdim : (index == 1) ? xdim : 0.0f;
      pos.y = (index == 2) ? -ydim : (index == 3) ? ydim : 0.0f;
      pos.z = (index == 4) ? -zdim : (index == 5) ? zdim : 0.0f;
      lines.setCoordinate(index, pos);
      lines.setColor(index, color);
    }

    // build axes shape
    Shape3D axes = new Shape3D(lines);
    return axes;
  }

  /**
   * Creates a cube border.
   * @param xdim Width "radius".
   * @param ydim Height "radius".
   * @param zdim Depht "radius".
   * @param color Border color.
   */
  private Shape3D createBorder(float xdim, float ydim, float zdim, Color3f color) {
    // compose border
    Point3f pos = new Point3f();
    LineArray lines = new LineArray(24, COORDINATES | COLOR_3);
    for (int index = 0; index < 24; ++index) {
      if (index < 16) {
        pos.x = ((index & 8) == 8) ? -xdim : xdim;
        pos.y = ((index & 4) == 4) ? (((index & 1) == 1) ? -ydim : ydim) : (((index & 2) == 2) ? -ydim : ydim);
        pos.z = ((index & 4) == 4) ? (((index & 2) == 2) ? -zdim : zdim) : (((index & 1) == 1) ? -zdim : zdim);
      } else {
        pos.x = ((index & 1) == 1) ? -xdim : xdim;
        pos.y = ((index & 2) == 2) ? -ydim : ydim;
        pos.z = ((index & 4) == 4) ? -zdim : zdim;
      }
      lines.setCoordinate(index, pos);
      lines.setColor(index, color);
    }

    // create shape
    Shape3D border = new Shape3D(lines);
    return border;
  }

  /**
   * Class for displaying a Pleasure-, Arousal-, Dominance-Point.
   */
  private class PADPoint extends BranchGroup {
    // point position

    private Vector3d m_pos = new Vector3d();

    // point intensity
    private double m_intensity;

    // the point represented as sphere
    private Sphere m_sphere = new Sphere(0.1f, GENERATE_NORMALS, 15);

    // transformation matrix
    private TransformGroup m_transform = new TransformGroup();

    // indicates whether the point is visible or not
    private boolean m_visible = false;

    /**
     * Create an invisible PAD point.
     * @param color Color of the PAD point.
     */
    public PADPoint(Color3f color) {
      // just for convenience
      super();

      // allow us to remove this object from the scene
      setCapability(ALLOW_DETACH);

      // adjust material
      Appearance appearance = new Appearance();
      Material material = new Material(color, BLACK, color, WHITE, 30.0f);
      material.setLightingEnable(true);
      appearance.setMaterial(material);
      m_sphere.setAppearance(appearance);

      // init stuff
      m_transform.setCapability(ALLOW_TRANSFORM_WRITE);
      m_transform.addChild(m_sphere);
      addChild(m_transform);
    }

    /**
     * Creates an invisible PAD point with the given alpha value.
     * @param color Color of the PAD point.
     * @param alpha Point transparency.
     */
    public PADPoint(Color3f color, float alpha) {
      // just for convenience
      super();

      // allow us to remove this object from the scene
      setCapability(ALLOW_DETACH);

      // adjust material
      Appearance appearance = new Appearance();
      Material material = new Material(color, BLACK, color, WHITE, 30.0f);
      material.setLightingEnable(true);
      appearance.setMaterial(material);
      appearance.setTransparencyAttributes(new TransparencyAttributes(BLENDED, alpha));
      m_sphere.setAppearance(appearance);

      // init stuff
      m_transform.setCapability(ALLOW_TRANSFORM_WRITE);
      m_transform.addChild(m_sphere);
      addChild(m_transform);
    }

    /**
     * Update PAD point.
     * @param pos PAD position.
     * @param intensity PAD intensity.
     */
    public void update(Vector3d pos, double intensity) {
      // adjust position and scale
      Transform3D translate = new Transform3D();
      translate.set(m_intensity = intensity, m_pos = pos);
      m_transform.setTransform(translate);

      // add to scene
      if (!m_visible) {
        m_visible = true;
        m_scene.addChild(this);
      }
    }

    /**
     * Hide the PAD point.
     */
    public void hide() {
      if (m_visible) {
        m_visible = false;
        detach();
      }
    }

    /**
     * Access current position.
     * @return Position of the PAD point.
     */
    public Vector3d position() {
      return m_pos;
    }

    /**
     * Access current intensity.
     * @return Intensity of the PAD point.
     */
    public double intensity() {
      return m_intensity;
    }

    /**
     * Access visibility.
     * @return True if PAD point is visible.
     */
    public boolean visible() {
      return m_visible;
    }
  }

  /**
   * A line between two PAD points.
   */
  private class PADLine extends BranchGroup {
    /// the line color

    private Color3f m_color;

    // the line
    private Shape3D m_line = new Shape3D();

    // source position
    private Vector3d m_start = null;

    // target position
    private Vector3d m_end = null;

    // visible or not
    private boolean m_visible = false;

    /**
     * Create new PAD line.
     * @param color Arrow color.
     */
    public PADLine(Color3f color) {
      // convenience call
      super();

      // allow us to do some stuff
      setCapability(ALLOW_DETACH);
      m_line.setCapability(ALLOW_GEOMETRY_WRITE);
      m_color = color;

      // add line to branch group
      addChild(m_line);
    }

    /**
     * Update line.
     * @param source The source PAD point.
     * @param target The target PAD point.
     */
    public void update(PADPoint source, PADPoint target) {
      // do nothing if any of the two points is invisible
      if (!source.visible() || !target.visible()) {
        return;
      }

      // access PAD positions
      Vector3d start = source.position(), end = target.position();

      // only need to update if any of the points has changed
      // although this is a comparison of objects it is still valid
      // since only a different object means a new position in this situation
      if ((m_start != start) || (m_end != end)) {
        LineArray line = new LineArray(2, COORDINATES | COLOR_3);
        line.setCoordinate(0, new Point3d(start.x, start.y, start.z));
        line.setCoordinate(1, new Point3d(end.x, end.y, end.z));
        line.setColor(0, m_color);
        line.setColor(1, m_color);
        m_line.setGeometry(line);
        m_start = start;
        m_end = end;
      }

      // add to scene
      if (!m_visible) {
        m_visible = true;
        m_scene.addChild(this);
      }
    }

    /**
     * Hide the PAD line.
     */
    public void hide() {
      if (m_visible) {
        m_visible = false;
        detach();
      }
    }
  }

  /**
   * Class for active mood quadrant.
   */
  private class MoodOctantCube extends BranchGroup {
    // the box

    private Box m_box;

    // its border
    private Shape3D m_border;

    // transformation matrix
    private TransformGroup m_transform;

    // current active mood quadrant
    private int m_current = -1;

    /**
     * Default constructor.
     * Creates invisible mood quadrant and adds it to the scene.
     */
    public MoodOctantCube() {
      // just for convenience
      super();

      // allow us to remove this object from the scene
      setCapability(ALLOW_DETACH);

      // the quadrant
      m_transform = new TransformGroup();
      m_transform.setCapability(ALLOW_TRANSFORM_WRITE);
      m_box = new Box(0.5f, 0.5f, 0.5f, CUBE);
      m_border = createBorder(0.5f, 0.5f, 0.5f, GRAY);

      // put everything together
      m_transform.addChild(m_box);
      m_transform.addChild(m_border);
      addChild(m_transform);
    }

    /**
     * Update mood quadrant.
     * Highlights the current active mood quadrant or hides it.
     * @param pos Mood position.
     */
    public void update(final Vector3d pos) {
      // get active quadrant
      int active = -1;
      if (pos.x > 0.0) {
        if (pos.y > 0.0) {
          if (pos.z > 0.0) {
            active = 0;
          } else if (pos.z < 0.0) {
            active = 4;
          }
        } else {
          if (pos.z > 0.0) {
            active = 2;
          } else if (pos.z < 0.0) {
            active = 6;
          }
        }
      } else if (pos.y > 0.0) {
        if (pos.z > 0.0) {
          active = 1;
        } else if (pos.z < 0.0) {
          active = 5;
        }
      } else {
        if (pos.z > 0.0) {
          active = 3;
        } else if (pos.z < 0.0) {
          active = 7;
        }
      }

      // something has changed
      if (active != m_current) {
        // inactive quadrant
        if (active == -1) {
          detach();
        } // active quadrant
        else {
          // translate cube
          Transform3D translate = new Transform3D();
          translate.set(new Vector3d(((active & 1) == 1) ? -0.5f : 0.5f, ((active & 2) == 2) ? -0.5f : 0.5f, ((active & 4) == 4) ? -0.5f : 0.5f));
          m_transform.setTransform(translate);

          // make visible if not already
          if (m_current == -1) {
            m_scene.addChild(this);
          }
        }

        // remember state
        m_current = active;
      }
    }
  }
}
