// Mahiyah, Demi and Siri
// 4.27.2021
// character file


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.Timer;



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
   
	Board board;
   
   /**creates a double var pacX*/
	static double pacX;
   
   /**creates a double var pacY*/
	static double pacY;
   
   /**creates a protected timer method*/
	protected Timer timer;
   
  
  public Character(double startX, double startY){}

  
  public void paint(Graphics g){}


  protected ImageIcon leftIcone(){}
		
	
  public void setBoard(Board b){}
	
   	
  public void move(){}


  private boolean outOfRange(){}
				

  private boolean warmAll(double Xi, double Yi){}
  
		
  public void setHeroLoc(double X, double Y){}
  
  
  public double getPacX(){}
  
   
  public double getPacY(){}
  
  
  public void startingPoint(double d, double e){}
  
   
  public void stopTimer(){}
  
  
  public void startTimer(){}
   

