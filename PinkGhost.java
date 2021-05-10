//mahiyah muthu
//4.25.21

//pink ghost 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/********************************
* this the file for the pink ghost 
********************************/
public class PinkGhost extends GhostDriver 
{

   /*****************************************************
   * creates a new file for the pink ghost
   * @param startX  
   *  intial start x distance 
   * @param startY  
   *  intial start y distance
   ******************************************************/ 
   
   public PinkGhost(double startX, double startY)
   {
      super(startX, startY);
      
      //retrieve pink ghost right image from file directory
      image = new ImageIcon(getClass().getClassLoader().getResource("img/" + "PacManBlueRight"));

      //set a new timer to enable the ghosts to start 15 seconds after pac man launches
      timer = new Timer(15, new ActionListener()
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