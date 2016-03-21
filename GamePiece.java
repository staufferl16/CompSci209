import java.awt.*;

/**
 * The base class for GamePieces that are displayed on the game panel.
 *
 * @author Chuck C. Liang, modified by Sara Sprenkle and Leigh Stauffer (mostly refactoring; some simplification)
 */
abstract class GamePiece implements Cloneable {  //Made GamePiece class abstract by declaring abstract.
	protected Image img; // animated gif
	protected int xcoord, ycoord; // coordinates of top-left corner

	/** size of the image */
	protected int img_width; // may need to fine tune

	/** size of the character inside the image */
	protected int char_width; // may need to fine tune

	private Graphics brush;

        /**
	 * Location of the image files. When using Eclipse, use bin/. Without
	 * Eclipse structure, use ./
	 */
	protected static String imgDir = "./";

	public GamePiece(int x, int y, Graphics g) {
		xcoord = x;
		ycoord = y;
		brush = g;
	}

	// ------------------- accessor methods -------------------
	public int getXPos() {
		return xcoord;
	}

	public int getYPos() {
		return ycoord;
	}

	public int getImageWidth() {
		return img_width;
	}

	public int getCharacterWidth() {
		return char_width;
	}

	/**
	 * Draws the GamePiece on the canvas
	 */
	public final void draw() {
		brush.drawImage(img, xcoord, ycoord, null);
	}

	/**
	 * Moves the object to the next spot (nothing for this class)
	 * 
	 * @param game
	 *            - provides access to information about the other 'pieces' in
	 *            the game
	 */
	public abstract void move(Game game); //Made empty method abstract by declaring abstract.

	@Override
	public GamePiece clone() throws CloneNotSupportedException {
		return (GamePiece) super.clone();
	}

}

/**
* For this class, it is more efficient that it be abstract. As of now, there are
* only three child classes of Gamepiece, each exhibit different behavior and
* serve different purposes.  Therefore, not all methods included in the
* GamePiece class are implemented by each of the child classes.  An example of
* this would be the Treasure class; since it is inaccessible by nature, there
* is no need for it to use the getXPos() or getYPos() methods.  And, it moves
* differently than the Goblin or the Human.  Unlike them, its position is
* occasionally, randomly generated.  However, should the game designer decide to
* change the nature of any GamePiece, it is still possible for the game designer
* to access x and y coordinates.  For example, if it were to become necessary
* for the Treasure child class to have coordinates relative to another GamePiece
* (maybe a different type of Goblin whose skin magically attracts the lucrative 
* Treasure GamePiece), the game designer could still access the Treasure
* object's x and y coordinates by using the parent class's, GamePiece's,
* getXPos() and getYPos() methods.
*
* In regards to making the draw method final, there exists no need for any
* GamePiece child class or object to override this method.  And, overriding it 
* could result in unwanted side-effects.  Therefore, it is best that it be 
* declared as final.
*/
