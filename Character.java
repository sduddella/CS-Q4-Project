// Mahiyah, Demi and Siri
// 4.27.2021
// character file


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.Timer;


/** this class sets the basic properties of each character, as well as their default states */
public class Character extends JPanel
{
	/**creates a protected double var x*/
   protected double x;
   
   /**creates a protected int var rounds*/
	protected int rounds;
   
	/**creates a protected double var y*/
   protected double y;
   
   /**creates a protected int var startX*/
	protected int startX;
   
   /**creates a protected int var startY*/
	protected int startY;
   
   /**creates a double var xInt and yInt*/
	double xInt, yInt;
   
   /**creates a protected image icon method*/
	protected ImageIcon image;
   
   /**creates a Board*/
	Board board;
   
   /**creates a double var pacX*/
	static double pacX;
   
   /**creates a double var pacY*/
	static double pacY;
   
   /**creates a protected timer method*/
	protected Timer timer;
   
  /** constructor sets the default values of each character including the starting position and image 
  * @param startX
  *   defines the x coordinate of starting point
  * @param startY
  *   defines the y coordinate of starting point
  */
  public Character(double startX, double startY)
  {
      
   	moveX = 0;
   	moveY = 0;
   	this.x = startX;
   	this.y = startY;
   	this.image = leftIcone();
  }

         
  public void paint(Graphics g)
  {
      super.paint(g);
		image.paintIcon(this, g, (int) x, (int) y);  
  }

  
  /**creates null icon if needed*
  * @return ImageIcon = leftIcon*/
  protected ImageIcon leftIcon()
  {
      return null;
  }
		
  
  /**sets up board with characters
  * @param b
  *   takes in board that we are currently working on as an object
  */
  public void setBoard(Board b)
  {
      board = b;
  }
	
  /**sets default move functionality*/ 	
  public void move()
  {
      
  }

  /**identifies if characters are going out of the board range*
  *  @return private boolean = outOfRange*/
  private boolean outOfRange()
  {
      return true;
  }
				
  /**check position of character relative to borders*
  * @return private boolean = warmAll*/
  private boolean warmAll(double Xi, double Yi)
  {
      return true;
  }
  
  /** set default location of pacman */	
  public void setPacLoc(double X, double Y)
  {
      pacX = X;
      pacY = Y;
  }
  
  /** get pacman x coordinate *
  * @return public double = getPacX*/
  public int getPacX()
  {
      return pacX;
  }
  
  /** get pacman y coordinate *
  * @return public double = getPacY*/ 
  public int getPacY()
  {
      return pacX;
  }
  
  /* set starting point
  * @param d
  *   x coordinate value
  * @param e
  *   y coordinate value
  */
  public void startingPoint(double d, double e)
  {
      this.x = d;
		this.y = e;
		this.moveX = 0;
		this.moveY = 0;
  }
  
  /** method stops Timer */ 
  public void stopTimer()
  {
      timer.stop();
  }
  
  /** method starts Timer*/
  public void startTimer()
  {
      timer.restart();
  }
   
}
