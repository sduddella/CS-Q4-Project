//mahiyah muthu
//4.25.21

//blue ghost 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/********************************
* this the file for the blue ghost 
********************************/

public class BlueGhost extends GhostDriver 
{
   
   /*****************************************************
   * creates a new file for the blue ghost
   * @param startX  
   *  intial start x distance 
   * @param startY  
   *  intial start y distance
   ******************************************************/
      
   public BlueGhost(double startX, double startY)
   {  
      super(startX, startY);
      
      //retrieves blue ghost right image from file directory
      image = new ImageIcon(getClass().getClassLoader().getResource("img/" + "BlueRight.png"));
      
      //set a new timer to enable the ghosts to start 25 seconds after pac man launches
      timer = new Timer(25, new ActionListener()
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