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
	protected int moveX;
   
   /**creates a protected int var startY*/
	protected int moveY;
   
   /**creates a double var xInt and yInt*/
	double xInt, yInt;
   
   /**creates a protected image icon method*/
	protected ImageIcon image;
   
   /**creates a Board*/
	Board board;
   
   boolean flag;
   
   /**creates a double var pacX*/
	static double pacX;
   
   /**creates a double var pacY*/
	static double pacY;

   /**checks if blocked*/
   public boolean block;
   
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
      
   	flag = false;
      pacX = 0;
   	pacY = 0;

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
  * @return ImageIcon = null*/
  protected ImageIcon leftIcone()
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
      flag = true;
  }
	
  /**sets default move functionality*/ 	
  public void move()
  {
    if (!flag)
			return;

		int mapHeight = 416;
		int mapWidth = 429;
		double squareHeight = mapHeight / 31;
		double squareWidth = mapWidth / 28;
		xInt = (this.x + moveX - squareWidth / 2) / squareWidth;
		yInt = (this.y + moveY - squareHeight / 2) / squareHeight;

		if (outOfRange()) 
      {
			return;
		}

		if (warmAll(xInt, yInt))
			return;

		if (board.isClear((int) yInt + 1, (int) xInt + 1)) 
      {
			this.x = x + moveX;
			this.y = y + moveY;
			if (this instanceof PacMan)
				board.eat((int) yInt + 1, (int) xInt + 1);
		} 
      else if (this instanceof GhostDriver) 
      {
			block = true;
		}  
  }

  /**identifies if characters are going out of the board range*
  *  @return private boolean = outOfRange*/
  private boolean outOfRange()
  {
      if (this.x + moveX < 0 && yInt + 1 != 14 && this instanceof GhostDriver) 
      {
			moveX = 1;
		}
		if (this.y + moveY < 11&& this instanceof GhostDriver) 
      {
			Random rnd = new Random();
			int i = rnd.nextInt(87);
			i = i % 3;
			switch (i) 
         {
   			case 0:
   				moveX = 0;
   				moveY = 1;
   				break;
   			case 1:
   				moveX = 1;
   				moveY = 0;
   				break;
   			case 2:
   				moveX = -1;
   				moveY = 0;
   				break;
		   }
		}
		return false;
  }
				
  /**check position of character relative to borders*
  * @return private boolean = warmAll*/
  private boolean warmAll(double xInt, double yInt)
  {
      boolean ans = false;
		if ((int) yInt + 1 == 14 && ((int) xInt + 2 == 0 || xInt + 1 == 28)) 
      {
			if (xInt + 1 == 28)
				this.x = -9;
			else
				this.x = 411.5;
			ans = true;
		}
		return ans;
  }

  
  /** set default location of pacman */	
  public void setPacLoc(double X, double Y)
  {
      pacX = X;
      pacY = Y;
  }
  
  /** get pacman x coordinate *
  * @return public double = getPacX*/
  public double getPacXCoord()
  {
      return pacX;
  }
  
  /** get pacman y coordinate *
  * @return public double = getPacY*/ 
  public double getPacYCoord()
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
		this.pacX = 0;
		this.pacY = 0;
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