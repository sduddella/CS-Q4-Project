//mahiyah muthu, demi tudorache
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
      setPacLoc(startX,startY);  
		this.setVisible(true);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.requestFocus(true);
		
		timer = new Timer(16, new ActionListener() 
      {
			public void actionPerformed(ActionEvent a) 
         {
				if (a.getSource() == timer)
					move();
			}
		});

		timer.start();
   }   
      
   /** method to move pacman and repaint*/
   public void move()
   {
      super.move();
      setPacLoc(this.x,this.y);
		repaint(); 
   }
   
   
   /**method to move pacman up*/
   public void setMoveUp()
   {
      pacX = 0; 
      pacY = -1;
   }
   
   /**method to move pacman down*/
   public void setMoveDown()
   {
      pacX = 0; 
      pacY = 1;
   }
   
   /**method to move pacman right*/
   public void setMoveRight()
   {
      pacX = 1; 
      pacY = 0;   
   }
   
   /**method to move pacman left*/
   public void setMoveLeft()
   {
      pacX = -1; 
      pacY = 0;   }
   
   /**method to return x*
   * @return public int = getX*/
   public double getXInd()
   {
      return this.x;
   }
   
   
   /**method to return y*
   * @return public int = getX*/
   public double getYInd()
   {
      return this.y;
   }
   
   
   /**method to set x*/      
   public void setX()
   {
      this.x = x;
   }
   
   /**method to set y*/
   public void setY()
   {
      this.y = y;
   }
   
   /**method to set intial x and y directions of pacman at 0*/
   public void zeroMoveXY()
   {
		this.pacX = 0; //(initial direction of pacman) 
		this.pacY = 0; //(inital direction of pacman)
   }
   
   /** method that programs keyboard functionality
   * @param e
   *  identifies a key event
   */
   public void keyPressed(KeyEvent e) 
   {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
      {
			image = leftIcone();
			setMoveLeft();
		}
      
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
      {
			image = rightIcone();
			setMoveRight();
		}
      
		if (e.getKeyCode() == KeyEvent.VK_UP)
      {
			image = upIcone();
			setMoveUp();
		}
      
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
      {
			image = downIcone();
			setMoveDown();
		}	   
      
   }
   
   /**method to get the image of pacman facing left*
   * @return ImageIcon = leftIcon*/
	public ImageIcon leftIcone()
   {
      return new ImageIcon(getClass().getClassLoader().getResource("img/"  +"PacmanLeft.png"));
   } 
   
   
   /**method to get the image of pacman facing right*
   * @return ImageIcon = rightIcon*/
	public ImageIcon rightIcone()
   {
       return new ImageIcon(getClass().getClassLoader().getResource("img/" +"PacmanRight.png"));
   } 
  
   
   /**method to get the image of pacman facing up*
   * @return ImageIcon = upIcon*/
	public ImageIcon upIcone()
   {
       return new ImageIcon(getClass().getClassLoader().getResource("img/" +"PacmanUp.png"));
   } 
   
   
   /**method to get the image of pacman facing down*
   * @return ImageIcon = downIcon*/
	public ImageIcon downIcone()
   {
       return new  ImageIcon(getClass().getClassLoader().getResource("img/" +"PacmanDown.png"));
   }
   
   
   /**method to make pacman facing the starting point
   * @param d
   *  position identifier
   * @param e
   *  position identifier
   */
	public void startingPoint(double x, double y) 
   {
      image = leftIcone();
		super.startingPoint(x, y); //(it's the starting point)
   }
   
   /** keyReleased function of KeyListener is overriden */
   @Override
   public void keyReleased(KeyEvent arg0){}
   
   /** keyReleased function of KeyListener is overriden */
   @Override
   public void keyTyped(KeyEvent arg0){}
   
} 	