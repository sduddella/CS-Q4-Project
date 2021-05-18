//Siri Duddella
//4-26-2021

import java.awt.Dimension;
import java.io.IOException;;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
* This is the driver file that starts the PacMan game
*/

public class Driver extends JFrame{

   /** creates a serialized object to keep track of users */
   private static final long serialVersionUID = 1L;
   
   /** creates an object of the Board class called gameBoard */
   private Board gameBoard;
   
   /**Driver
   * @throws IOException
   *    declares exception
   */
   public Driver() throws IOException{
      super("PacMan");
      createBoard();
   }
   
   /** 
   *This constructor is responsible for creating the board
   *@throws IOException
   *  declares exception
   */
   public void createBoard() throws IOException{
   
      JPanel main = new JPanel();
      main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS));
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      gameBoard = new Board(this);
      gameBoard.setAlignmentX(LEFT_ALIGNMENT);
      main.add(gameBoard);
      main.setSize(450, 420);
      this.add(main,0);
      this.setSize(new Dimension(440,480));
      this.setVisible(true);
         
   }
   
   /**
   *Main function that creates new board
   *@param args
   *  takes array of String arguments
   *@throws Throwable
   *  declares Throwable exception
   */
   public static void main(String args[]) throws Throwable{
   
      new Driver();
   
   }
}