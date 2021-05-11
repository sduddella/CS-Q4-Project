//Siri Duddella
//4-26-2021

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**makes board and sets functions for tracking information on board*/
public class Board extends JPanel {
   
   /** creates a serialized object to keep track of users */
   private static final long serialVersionUID = 1L; 
   
   /** creates an object of PacMan pacmanGamed "pacman" */
   private PacMan pacman;
   
   /** instantiates Driver object game */
   Driver game;
   
   /** array of ghosts */
   private GhostDriver[] ghosts;
   
   /** instantiates background and food panels*/
   private JPanel background, foodBoard;
   
   /** instantiates multiboard Layered Pane*/
   private JLayeredPane multiboard;
   
   /** integers that track map height and width **/
   private int mapHeight, mapWidth;
   
   /** doubles that track square height and width for icon scaling */
   private double sqHeight, sqWidth;
   
   /** tracks score */
   int score;
   
   /** status pacmanGame panel */
   JPanel panel;
   
   /** game label */
   JLabel pacmanGame;
   
   /** int that tracks number of lives left */
   int lives;
   
   /** Wall location tracker */
   final int W=1;
   
   /** Food location tracker */
   final int F=2;
   
   /** Empty location tracker */
   final int E=3;
   
   /** array that sets up board */
   private int board[][] = {
			{W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,W,W,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,F,W},
			{W,F,F,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,F,F,W},
			{W,W,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,W,W},
			{E,E,E,E,E,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,F,F,F,F,F,F,F,F,F,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E},
			{W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W},
			{F,F,F,F,F,F,F,F,F,F,W,E,E,E,E,E,E,W,F,F,F,F,F,F,F,F,F,F},
			{W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W},
			{E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,F,F,F,F,F,F,F,F,F,W,W,F,W,E,E,E,E,E},
			{E,E,E,E,E,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,E,E,E,E,E},
			{W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,W,W,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,W,W,W,W,F,W,W,W,W,W,F,W,W,F,W,W,W,W,W,F,W,W,W,W,F,W},
			{W,F,F,F,W,W,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,W,W,F,F,F,W},
			{W,W,W,F,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,F,W,W,W},
			{W,W,W,F,W,W,F,W,W,F,W,W,W,W,W,W,W,W,F,W,W,F,W,W,F,W,W,W},
			{W,F,F,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,W,W,F,F,F,F,F,F,W},
			{W,F,W,W,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,W,W,F,W},
			{W,F,W,W,W,W,W,W,W,W,W,W,F,W,W,F,W,W,W,W,W,W,W,W,W,W,F,W},
			{W,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,F,W},
			{W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W,W}
	};

   
   /** This method creates the Pacman maze
   * @throws IOException
   *  declares exceptioin
   * @param thisGame
   *  creates Driver object called thisGame
   */
   public Board(Driver thisGame) throws IOException{
   
		game = thisGame;
		ghosts = new GhostDriver[4];
		score = 0;
		lives = 3;
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		mapHeight = 416;
		mapWidth = 429;
		this.setBackground(Color.black);
		sqHeight = mapHeight/31;
		sqWidth = mapWidth/28;
      
		// Creates and set-up the layered pane.
		multiboard = new JLayeredPane();
		multiboard.setPreferredSize(new Dimension(mapHeight, mapWidth));
      
		// Creates the background.
		JPanel background = drawBackground();
		background.setBounds(0, 0, mapWidth, mapHeight);
		multiboard.add(background, new Integer(0));
      
		// Creates the items board - Placing food in proper places
		CreateFood();
		foodBoard.setOpaque(false);
		foodBoard.setSize(mapWidth, mapHeight);
		foodBoard.setBackground(null);
		multiboard.add(foodBoard,new Integer (1));
      
		// Places Pacman on the board.
		pacman = position();
		pacman.setOpaque(false);
		pacman.setSize(mapWidth, mapHeight);
		multiboard.add(pacman,new Integer(3));
		pacman.setFocusable(true);
		pacman.setBoard(this);

		
		
		MakeStatusBar();
		add(panel);
		
		ghosts[0]=new RedGhost(12*sqWidth+sqWidth/2,13.5*(sqHeight)+sqHeight/2);
		ghosts[1]=new BlueGhost(13*sqWidth+sqWidth/2,13.5*(sqHeight)+sqHeight/2);
		ghosts[2]=new PinkGhost(14*sqWidth+sqWidth/2,13.5*(sqHeight)+sqHeight/2);
		ghosts[3]=new OrangeGhost(15*sqWidth+sqWidth/2,13.5*(sqHeight)+sqHeight/2);
		
		
		
		for(int i = 0; i<4;i++){
			ghosts[i].setOpaque(false);
			ghosts[i].setSize(mapWidth, mapHeight);
			multiboard.add(ghosts[i],new Integer(4));
			ghosts[i].setBoard(this);
		}
		
	
				
		multiboard.setVisible(true);
		
		this.add(multiboard);

      
   
   }
   
   /** This method creates a status pacmanGame for the game */
   private void MakeStatusBar(){
   
      try {
		    pacmanGame = new JLabel("User Name", JLabel.LEFT);
		    pacmanGame.setBackground(Color.BLUE);
			 pacmanGame.setText("Your Score is : "+score);
			 Font f = new Font("Broadway", Font.BOLD, 18);
		     
			 pacmanGame.setFont(f);
   
			 panel = new JPanel(){
			 private static final long serialVersionUID = 1L;
			 private Image pac = ImageIO.read(getClass().getClassLoader().getResource("img/"  +"Heart.png"));
			 public void paint (Graphics g){
				 super.paint(g);
					 for(int i = 0;i<lives;i++)
						 g.drawImage(pac, 28*i, 1, null);
					
			 }
				
		    };
			
			 panel.setLayout(new FlowLayout()); 
			 panel.add(pacmanGame);
		   } catch (IOException e) {
			   e.printStackTrace();
		   }
   }
   
   /** This method draws food */
   private void CreateFood(){
   
      try {
   			foodBoard = new JPanel(){
   				private static final long serialVersionUID = 1L;
   				private Image food =  ImageIO.read(getClass().getClassLoader().getResource("img/"+"NormalPoint.png"));
   				public void paint (Graphics g){
   					super.paint(g);
   					for (int i=0; i<board.length; i++)
   						for (int j=0; j<board[i].length; j++) {
   							if(board[i][j]==F)
   								g.drawImage(food, (int)(j*(sqWidth)+sqWidth/2), (int)(i*(sqHeight)+sqHeight/2), null);
   						}
   					
   				}
   				
   			};
   		} catch (IOException e) {
   			e.printStackTrace();
   		}
   
   }
   
   /** This method draws the background of the maze 
   * @return JPanel = background 
   */
   private JPanel drawBackground(){
      try {
			background = new JPanel(){
				private static final long serialVersionUID = 1L;
				private Image map = ImageIO.read(getClass().getClassLoader().getResource("img/"+"Map.bmp"));		
				public void paint( Graphics g ) { 
					super.paint(g);
					g.drawImage(map, 0, 0, null);
				}
			};
		} catch (IOException e) {
			e.printStackTrace();
		}
		background.setVisible(true);
		background.setBackground(Color.black);
		return background;
   }
   
   /** Function that returns a new pacman in position
   * @return Pacman = initial position
   */
   public PacMan position(){
      return new PacMan(13*sqWidth+sqWidth/2,22.5*(sqHeight)+sqHeight/2);
   }

   /** function that ghosts ghosts in position
   * @param pos
   *  provides expected location of Ghosts
   * @return Ghost = inital Ghost position 
   */
   public GhostDriver ghostPos(int pos){
      return new GhostDriver(12*sqWidth+sqWidth/2,13.5*(sqHeight)+sqHeight/2);
   }
   
   /** Constructor - map width
   * @return mapWidth */
   public int getMapWidth(){
      return mapWidth;
   }
   
   /** Constructor - map height
   * @return mapHeight */
   public int getMapHeight(){
      return mapHeight;
   }
   
   /** Constructor - toString */
   public String toString(){
      String s="";
		for (int i=0; i<board.length; i++) {
			for (int j=0; j<board[i].length; j++)
				s=s+","+board[i][j];
			s=s+"\n";
		}
		return s;
   }
   
   /** function that adds food to main board 
   * @param comp
   *   component
   * @param num
   *   position
   */
   public void addFoodToMultiBoard(Component comp, Integer num){
      multiboard.add(comp,num);
   }
   
   /** check if position empty
   * @param i
   *  first index on board position
   * @param j
   *  second index on board position
   * @return board[i][j] is not a wall
   */
   public boolean isClear(int i, int j){
      return !(board[i][j]==1);
   }
   
   /** method to eat food
   * @param i
   *  first index on board position
   * @param j
   *  second index on board position
   */
   public void eat(int i, int j){
   
      if(board[i][j]==2){
		   board[i][j]=3;
		   score++;
		   if(score>1)
			   pacmanGame.setText("Your Score is : " +score);
		}
		
		if (score==300){
			winGameEvent();
		}
   
   }
   
   /** method describes winning */
   private void winGameEvent(){
   
      stopCharacters();
		
		int result = JOptionPane.showConfirmDialog(this, "New game?", "You Won!", JOptionPane.YES_NO_OPTION);
		
		switch (result){
   		case (0):
   			try {
   				this.removeAll();
   				game.createBoard();				
   			} catch (IOException e) {
   				
   				e.printStackTrace();
   			}
   			break;
   		case (1):
   		System.exit(0);
   		break;
		}
   
   }
   
   /** method restarts game */
   public void  restart(){
   
      lives--;
	
		panel.getRootPane().validate();
		panel.getRootPane().repaint();
		pacman.startingPoint(13*sqWidth+sqWidth/2,22.5*(sqHeight)+sqHeight/2);
		for(int i=0; i <4;i++){
			ghosts[i].startingPoint((12+i)*sqWidth+sqWidth/2,13.5*(sqHeight)+sqHeight/2);
			ghosts[i].rounds=0;
			ghosts[i].startProcess=false;
		}
		
		if (lives==0){
			endGame();
		}
   
   }
   
   /** method to end game */
   private void endGame(){
   
   stopCharacters();
		
		int result = JOptionPane.showConfirmDialog(this, "Start a new game?", "Game Over", JOptionPane.YES_NO_OPTION);

		switch (result){
		case (0):
			try {
				this.removeAll();
				game.createBoard();				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;
		case (1):
		System.exit(0);
		break;
		}
   
   }
   
   /** method to stop characters */
   private void stopCharacters(){
   
      pacman.stopTimer();
   		for(int i =0;i<4;i++){
   			ghosts[i].stopTimer();
   		}
   
   }
   
   
}
