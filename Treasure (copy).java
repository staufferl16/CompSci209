import java.awt.*;
import java.util.Random;

/**
 * Represents a Treasure in the Game
 *
 * @author Chuck C. Liang, modified by Sara Sprenkle and Leigh Stauffer (mostly refactoring; some simplification)
 */
class Treasure extends GamePiece {

	private int newXcoord;
	private int newYcoord;
	private Random newCoord = new Random();
	private int delayInt = 0; //Variable used to delay Treasure movement

	public Treasure(int x, int y, Graphics g) {
		super(x, y, g);
		// change the following to location of file:
		img = Toolkit.getDefaultToolkit().getImage( imgDir + "gem.gif");
		img_width = 30;
		char_width = 26;
	}

	/**
	 * Moves the treasure to a new random location.
	 */
	@Override
	public void move(Game game) { //make treasure appear somewhere else periodically.
		delayInt += 1;
		if (delayInt == 125){
			newXcoord = newCoord.nextInt(Game.XBOUND + 1);  //Change to random x coordinate
			newYcoord = newCoord.nextInt(Game.YBOUND + 1);  //Change to random y coordinate (still in frame)
			if (newYcoord < Game.YMIN_DISPLAY){
				newYcoord = 21;
			}
			xcoord = newXcoord;
			ycoord = newYcoord;
		}
		else if (delayInt > 125){
			delayInt = 0;  //Reset the delay int.
		}
	}
}