//Demi Tudorache 
//04.25.21

import java.util.Random;

/**this is the parent file for all the ghosts and contains default settings*/
public class GhostDriver extends Character
{

   /*****************************************************
   * creates a new file for the MAIN ghost driver file
   * startProcess var will control the start of the ghost behavior
   * @param moveX  
   *  intial start x distance 
   * @param moveY  
   *  intial start y distance
   ******************************************************/
   public boolean startProcess; 
   public GhostDriver(double moveX, double moveY)
   {
      super(moveX, moveY);
      //set startProcess to false (maybe block also)
      block=false;
		startProcess=false;
   }
   
   /**method to move the pacman, but if it is eating, restart board*/
   public void move()
   {
      //move ghost
      //if pac man is eaten, restart board and set startProcess to false
      randomMove();	
		if (eatPacMan())
      {
		   this.board.restart();
		   startProcess=false;
	   }
	
	   repaint();
   
   }
   
   /**method for ghosts to eat pacman*
   *  @return private boolean = eatPacMan*/
   private boolean eatPacMan()
   {
      return true;
   }
   
   
   /*****************************************************
   * method for setting the direction for ghosts
   * @param aX x coordinate 1  
   * @param aY y coordinate 1
   * @param bX x coordinate 2
   * @param bY y coordinate 2
   ******************************************************/
   private void setDirection(int aX, int aY, int bX, int bY)
   {
      //based on int values...
         //turn left 
      if (aX<bX)
      {
			moveX=-1; 
         moveY=0;
		}
		//turn right
		if (aX>bX)
      {
			moveX=1; 
         moveY=0;
		}
		//turn down
		if (aY<bY)
      {
			moveX=0; 
         moveY=1;
		}
		//turn up
		if (aY>bY)
      {
			moveX=0; 
         moveY=-1;
		}
			
		super.move();   
   }
   
  
   /**method for setting values and movement*/
   private void randomMove()
  {
      //set values from turn methods to correct x and y coordinates in game board
      //MAKE SURE TO return values
     if (!startProcess)
     {
			if (!startProcess){
			moveX=0; moveY=-1;
			this.x=x+moveX;
			this.y=y+moveY;
			if(this.y==140){
				startProcess=true;
			}
				return;
		}
     }
     if (block)
     {
			block=false;
			Random Rnd1 = new Random();
			Random Rnd2 = new Random();

			int i = Rnd1.nextInt(900);
			int j = Rnd2.nextInt(900);

			i=i*j;
			i=i%4;
			switch(i)
         {
			case 0:
				moveX=0; moveY=-1;
				break;
			case 1:
				moveX=0; moveY=1;
				  break;
			case 2:
				moveX=-1; moveY=0;
				  break;
			case 3:
				moveX=1; moveY=0;
				  break;

			}
		}
			
		super.move();

  }
   
   /**method for timer to stop*/
   public void stopTimer()
   {
      super.stopTimer();
   }
   
}