//mahiyah muthu
//4.25.21

//red ghost 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/********************************
* this the file for the red ghost 
********************************/

public class RedGhost extends GhostDriver 
{
   
   /*****************************************************
   * creates a new file for the red ghost
   * @param startX  
   *  intial start x distance 
   * @param startY  
   *  intial start y distance
   ******************************************************/

   public RedGhost(double startX, double startY)
   {      
      super(startX, startY);
      
      //retrieve red ghost image from file directory
      image = new ImageIcon(getClass().getClassLoader().getResource("img/" + "PacManBlueRight"));
      
      //sets a new timer to enable the ghosts to start 10 seconds after pac man launches
      timer = new Timer(10, new ActionListener()
      {
         public void actionPerformed(ActionEvent a)
         {
            
            if (a.getSource() == timer)
            {
					move();
            }
         }
      });
      
      //parameters for timer is action event (method used will allow ghost to sync with timer)
      timer.start(); //starts the timer 
        
   }
      
}
   
