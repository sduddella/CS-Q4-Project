//mahiyah muthu, demi tudorache, and siri duddella
//4.25.21

/****************************************
* this creates the pac man character class
*****************************************/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


/**this is the pacman file and contains all the settings required for the main character*/
public class PacMan extends Character implements KeyListener
{
   /*****************************************************
    * creates a new file for the pac man character
    * @param startX  
    *    intial start x distance 
    * @param startY  
    *    intial start y distance
    ******************************************************/
    
   public PacMan(double startX, double startY)
   {  
      super(startX, startY);   
      //set super to the parameters startX, startY
      //set the pac man to visible
      //add a key listener
      //set the pacman object to focus (maybe focusable and requestfocus)
      //set timer
      //(method used will allow ghost to sync with timer)
   }   
      
   /** method to move pacman and repaint*/
   public void move(){}
   
   
   /**method to move pacman up*/
   public void setMoveUp()
   {
      //move x = 0
      //move y = -1
   }
   
   /**method to move pacman down*/
   public void setMoveDown()
   {
      //move x = 0
      //move y = 1
   }
   
   /**method to move pacman right*/
   public void setMoveRight()
   {
      //move x = 1
      //move y = 0
   }
   
   /**method to move pacman left*/
   public void setMoveLeft()
   {
      //move x = -1
      //move y = 0
   }
   
   /**method to return x*
   * @return public int = getX*/
   public int getX()
   {
      return 1;
   }
   
   
   /**method to return y*
   * @return public int = getX*/
   public int getY()
   {
      return 1;
   }
   
   
   /**method to set x*/      
   public void setX()
   {
      // x = x
   }
   
   /**method to set y*/
   public void setY()
   {
      // y = y
   }
   
   /**method to set intial x and y directions of pacman at 0*/
   public void zeroMoveXY()
   {
		//set move x = 0 (initial direction of pacman 
		//set move y = 0 (inital direction of pacman)
   }
   
   /** method that programs keyboard functionality
   * @param e
   *  identifies a key event
   */
   public void keyPressed(KeyEvent e) 
   {
		// if code == left
      // move left
	  
		//if code == right
      // move right
      
		//if code == up
      // move up 
		
		//if code == down
      //move down	   
      
   }
   
   /**method to get the image of pacman facing left*
   * @return ImageIcon = leftIcon*/
	public ImageIcon leftIcone()
   {
      return null;
   } 
   
   
   /**method to get the image of pacman facing right*
   * @return ImageIcon = rightIcon*/
	public ImageIcon rightIcone()
   {
      return null; 
   } 
  
   
   /**method to get the image of pacman facing up*
   * @return ImageIcon = upIcon*/
	public ImageIcon upIcone()
   {
      return null;   
   } 
   
   
   /**method to get the image of pacman facing down*
   * @return ImageIcon = downIcon*/
	public ImageIcon downIcone()
   {
      return null;
   }
   
   
   /**method to make pacman facing the starting point
   * @param d
   *  position identifier
   * @param e
   *  position identifier
   */
	public void startingPoint(double d, double e) 
   {
      //set the pac man to facing left (it's the starting point)
   }
   
   /** keyReleased function of KeyListener is overriden */
   @Override
   public void keyReleased(KeyEvent arg0){}
   
   /** keyReleased function of KeyListener is overriden */
   @Override
   public void keyTyped(KeyEvent arg0){}
   
} 		


