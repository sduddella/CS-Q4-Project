//Demi Tudorache 
//04.25.21

import java.util.Random;

/**this is the parent file for all the ghosts and contains default settings*/
public class GhostDriver extends Character
{

   /*****************************************************
   * creates a new file for the MAIN ghost driver file
   * startProcess var will control the start of the ghost behavior
   * @param startX  
   *  intial start x distance 
   * @param startY  
   *  intial start y distance
   ******************************************************/
   public GhostDriver(double startX, double startY)
   {
      super(startX, startY);
      //set startProcess to false (maybe block also)
      
   }
   
   /**method to move the pacman, but if it is eating, restart board*/
   public void move()
   {
      //move ghost
      //if pac man is eaten, restart board and set startProcess to false
   
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
         //turn right  
         //turn up 
         //turn down     
   }
   
  
   /**method for setting values and movement*/
   private void randomMove()
   {
      //set values from turn methods to correct x and y coordinates in game board
      //MAKE SURE TO return values
   }
   
   /**method for timer to stop*/
   public void stopTimer(){}
   
}
  
