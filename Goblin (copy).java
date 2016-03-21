import java.awt.*;

/**
 * Represents a Goblin in the Game
 *
 * @author Chuck C. Liang, modified by Sara Sprenkle and Leigh Stauffer (mostly refactoring; some simplification)
 */
class Goblin extends GamePiece {

	private int dx;
	private int dy;
	private static final int STEP = 6; //make Goblin faster than Professor

	public Goblin(int x, int y, Graphics g) {
		super(x, y, g);
		// change the following to location of file:
		img = Toolkit.getDefaultToolkit().getImage( imgDir + "head1.gif");
		img_width = 30;
		char_width = 26;
	}

	/**
	 * Moves the Goblin based on the direction specified
	 */
	@Override
	public void move(Game game) { //make Goblin chase professor
		int profX = game.getHuman().getXPos();
		int profY = game.getHuman().getYPos();
		if (profX > xcoord) {  //If professor is to the right of goblin, move right.
			this.setDirection(1,0);
			xcoord = xcoord + dx;
		}
		if (profX < xcoord) {  //If professor is to the left of goblin, move left.
			this.setDirection(-1,0);
			xcoord = xcoord + dx;
		}
		if (profY > ycoord) {  //If professor is below goblin, move down.
			this.setDirection(0,1);
			ycoord = ycoord + dy;
		}
		if (profY < ycoord) {  //If professor is above goblin, move up.
			this.setDirection(0,-1);
			ycoord = ycoord + dy;
		}
	}

	/**
	 * Sets which direction Goblin should go
	 * 
	 * @param horizontalDirection
	 *            : -1 means left, 1 means right, 0 means no horizontal movement
	 * @param verticalDirection
	 *            : -1 means up, 1 means down, 0 means no vertical movement
	 */
	public void setDirection(int horizontalDirection, int verticalDirection) {
		dx = horizontalDirection * STEP;
		dy = verticalDirection * STEP;
	}

}
