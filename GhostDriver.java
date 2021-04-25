//Demi Tudorache 
//04.25.21

import java.util.Random;

public class GhostDriver extends Character
{
   //startProcess variable will control the start of the ghost behavior
   public GhostDriver(double startX, double startY)
   {
      super(startX, startY);
      //set startProcess to false (maybe block also)
      
   }
   
   public void move()
   {
      Random.move();
      //if pac man is eaten, restart board and set startProcess to false
   
   repaint();
   }
   
   private boolean eatPacMan()
   {
      //use math to create a formula for ghosts to eat the pac man
   }
   
   private void setDirection(int aX, int aY, int bX, int bY)
   {
      //based on int values...
         //turn left
         //turn right  
         //turn up 
         //turn down     
         
      super.move();
   }
   
   private void randomMove()
   {
      //set values from turn methods to correct x and y coordinates in game board
      //return values
   }
   
   public void stopTimer()
   {
      super.stopTimer();
   }
}
  