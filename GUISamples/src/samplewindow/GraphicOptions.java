package samplewindow;

import java.awt.*; // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*; // Using Swing's components and containers
import javax.swing.JFrame;

/**
 *
 * @author sebek
 */
public class GraphicOptions extends JFrame {
   // define constraints

   private DrawCanvas canvas;

   // Constructor to set up the GUI components and event handlers
   public GraphicOptions() {

      // Set up a custom drawing JPanel
      canvas = new DrawCanvas();
      canvas.setPreferredSize(new Dimension(canvas.CANVAS_WIDTH, canvas.CANVAS_HEIGHT));

      // Set up a panel for the buttons
      JPanel btnPanel = new JPanel(new FlowLayout());
      JButton btnLeft = new JButton("Move Left ");
      btnPanel.add(btnLeft);
      btnLeft.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            canvas.changeX1(-10);
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });
      JButton btnRight = new JButton("Move Right");
      btnPanel.add(btnRight);
      btnRight.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            canvas.changeX1(10);
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });

      JButton btnUp = new JButton("Move Up");
      btnPanel.add(btnUp);
      btnUp.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            canvas.changeY1(-10);
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });

      JButton btnDown = new JButton("Move Down");
      btnPanel.add(btnDown);
      btnDown.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            canvas.changeY1(10);
            canvas.repaint();
            requestFocus(); // change the focus to JFrame to receive KeyEvent
         }
      });

      // Add both panels to this JFrame's content-pane
      Container cp = getContentPane();
      cp.setLayout(new BorderLayout());
      cp.add(canvas, BorderLayout.CENTER);
      cp.add(btnPanel, BorderLayout.SOUTH);

      // "super" JFrame fires KeyEvent
      addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent evt) {
            if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
               // case KeyEvent.VK_LEFT:
               canvas.changeX1(-10);
               canvas.repaint();
               // break;
            } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
               canvas.changeX1(10);
               canvas.repaint();
            } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
               canvas.changeY1(-10);
               canvas.repaint();
            } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
               canvas.changeY1(10);
               canvas.repaint();
            }
         }
      });

   }
}
