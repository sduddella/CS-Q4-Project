//mahiyah muthu and demi tudorache
//4.25.21

//pac man character class

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class PacMan extends Character implements KeyListener
{
   public PacMan(double startX, double startY)
   {
      super(startX, startY);
      
      //set the pac man to visible
      //add a key listener
      //set the pacman object to focus (maybe focusable and requestfocus)
      
      timer = new timer(10, ActionListener);
      //(method used will allow ghost to sync with timer)
      
      public void move()
      {
         //move the pacman and repaint 
      }
      
      public void setMoveUp()
      {
         //move x = 0
         //move y = -1
      }
      
      public void setMoveDown()
      {
         //move x = 0
         //move y = 1
      }
      
      public void setMoveRight()
      {
         //move x = 1
         //move y = 0
      }
      
      public void setMoveLeft()
      {
         //move x = -1
         //move y = 0
      }
      
      public double getX()
      {
         //return x
      }
      
      public double getY()
      {
         //return y
      }
      
      public void setX()
      {
         // x = x
      }
      
      public void setY()
      {
         // y = y
      }
      
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

   	public ImageIcon leftIcone() 
      {
   		//return pacman facing left
   	}
      
   	public ImageIcon rightIcone() 
      {
   		//return pacman facing right
   	}
      
   	public ImageIcon upIcone() 
      {
   		//return pacman facing up
      }
      
   	public ImageIcon downIcone() 
      {
   		//return pacman facing down
   	}
   
   	public void startingPoint(double d, double e) 
      {
         //set the pac man to facing left (it's the starting point)
      }
      
   } 
   
}  		