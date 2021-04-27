//mahiyah muthu and demi tudorache
//4.25.21

/****************************************
* this crates the pac man character class
*****************************************/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class PacMan extends Character implements KeyListener
{
   /*****************************************************
    * creates a new file for the pac man character
    * @param 
    *   startX  intial start x distanc 
    * @param 
    *   startY  intial start y distance
    ******************************************************/
    
   public PacMan(double startX, double startY)
   {     
      super(startX, startY);
      
      //set the pac man to visible
      //add a key listener
      //set the pacman object to focus (maybe focusable and requestfocus)
      
      timer = new timer(10, ActionListener);
      
      //(method used will allow ghost to sync with timer)
      
      
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
      
      /**method to return x*/
      public double getX(){}
      
      
      /**method to return y*/
      public double getY(){}
      
      
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
      
      /**method to get the image of pacman facing left*/
   	public ImageIcon leftIcone(){} 
      
      
      /**method to get the image of pacman facing right*/
   	public ImageIcon rightIcone(){} 
     
      
      /**method to get the image of pacman facing up*/
   	public ImageIcon upIcone(){} 
      
      
      /**method to get the image of pacman facing down*/
   	public ImageIcon downIcone(){}
      
      
      /**method to make pacman facing the starting point
      * @param
      *   d
      * @param
      *   e
      */
   	public void startingPoint(double d, double e) 
      {
         //set the pac man to facing left (it's the starting point)
      }
      
   } 
   
}  		