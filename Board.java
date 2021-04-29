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

/**makes board and sets functions for tracking information on board*/
public class Board extends JPanel {
   
   /** creates a serialized object to keep track of users */
   private static final long serialVersionUID = 1L; 
   
   /** creates an object of PacMan named "pacman" */
   private PacMan pacman;
   
   /** instantiates Driver object game */
   Driver game;
   
   /** array of ghosts */
   private GhostDriver[] ghosts;
   
   /** instantiates background and food panels*/
   private JPanel background, foodBoard;
   
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
   
   /** Wall location tracker */
   final int W=1;
   
   /** Food location tracker */
   final int F=2;
   
   /** Empty location tracker */
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
   
   /** This method creates a status bar for the game */
   private void MakeStatusBar(){}
   
   /** This method draws food */
   private void CreateFood(){}
   
   /** This method draws the background of the maze 
   * @return JPanel = background 
   */
   private JPanel drawBackground(){
      return null;
   }
   
   /** Function that returns a new pacman in position
   * @return Pacman = initial position
   */
   public PacMan position(){
      return null;
   }

   /** function that ghosts ghosts in position
   * @param pos
   *  provides expected location of Ghosts
   * @return Ghost = inital Ghost position 
   */
   public GhostDriver ghostPos(int pos){
      return null;
   }
   
   /** Constructor - map width
   * @return mapWidth */
   public int getMapWidth(){
      return 1;
   }
   
   /** Constructor - map height
   * @return mapHeight */
   public int getMapHeight(){
      return 1;
   }
   
   /** Constructor - toString */
   public String toString(){
      return "";
   }
   
   /** function that adds food to main board 
   * @param comp
   *   component
   * @param num
   *   position
   */
   public void addFoodToMultiBoard(Component comp, Integer num){}
   
   /** check if position empty
   * @param i
   *  first index on board position
   * @param j
   *  second index on board position
   * @return board[i][j] is not a wall
   */
   public boolean isClear(int i, int j){
      return true;
   }
   
   /** method to eat food
   * @param i
   *  first index on board position
   * @param j
   *  second index on board position
   */
   public void eat(int i, int j){}
   
   /** method describes winning */
   private void winGameEvent(){}
   
   /** method restarts game */
   private void  restart(){}
   
   /** method to end game */
   private void endGame(){}
   
   /** method to stop characters */
   private void stopCharacters(){}
   
   
}