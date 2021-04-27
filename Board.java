//Siri Duddella
//4-26-2021

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Board extends JPanel {

   /** creates a serialized object to keep track of users */
   private static final long serialVersionUID = 1L;
   /** creates an object of PacMan named "pacman" */
   //private PacMan pacman;
   /** instantiates Driver object game */
   Driver game;
   /** array of ghosts */
   private GhostDriver[] ghosts;
   /** instantiates background and items panels*/
   private JPanel background, itemBoard;
   /** instantiates multiboard Layered Pane*/
   private JLayeredPane multiboard;
   /** integers that track map height and width **/
   private int mapHeight, mapWidth;
   /** doubles that track square height and width for icon scaling */
   private double sqHeight, sqWidth;
   /** tracks score */
   int score;
   /** status bar panel */
   JPanel panel;
   /** game label */
   JLabel pacmanGame;
   /** int that tracks number of lives left */
   int lives;
   /* Wall location tracker */
   final int W=1;
   /* Food location tracker */
   final int F=2;
   /* Empty location tracker */
   final int E=3;
   /** array that sets up board */
   private int board[][];
   
   /** This method creates the Pacman maze
   * @throws IOException
   *  declares exceptioin
   * @param thisGame
   *  creates Driver object called thisGame
   */
   public Board(Driver thisGame) throws IOException{}

}