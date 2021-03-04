
/*
 * the assignment is about learning how to use the (for-loop) to create the squares by 
 * GRects and row and column by GLabels.
 */
import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

/**
 * 
 * creates a chessboard.
 *
 */

public class Chessboard extends GraphicsProgram {
	public void run() {
		// a variable for calculating the squares.
		double sqSize = (double) getHeight() / 8;
		// for-loop helps us to draw thhe squares.
		for (int i = 0; i < 8; i++) {
			// a for-loop inside a for-loop so we can draw the squares in both directions.
			for (int j = 0; j < 8; j++) {
				double x = j * sqSize + 100;
				double y = i * sqSize + 100;
				GRect sq = new GRect(x, y, sqSize, sqSize);
				sq.setFilled((i + j) % 2 != 0);
				add(sq);
			}
		}
		// a variable that help us to place the rows and columns.
		double d = (double) getWidth() / 11.5;
		// for-loop for the rows.
		for (int i = 0; i < 8; i++) {
			double x = i * d;
			GLabel label = new GLabel("" + (char) (i + 65));
			GLabel label1 = new GLabel("" + (char) (i + 65));
			label.setLocation(x + 122, 90);
			label1.setLocation(x + 122, 650);
			add(label);
			add(label1);
		}
		// for-loop for the columns.
		for (int i = 0; i < 8; i++) {
			double y = i * d;
			// (8-i) due to the assignment.
			GLabel label = new GLabel("" + (int) (8 - i));
			GLabel label1 = new GLabel("" + (int) (8 - i));
			label.setLocation(80, y + 135);
			label1.setLocation(635, y + 135);
			add(label);
			add(label1);

		}

	}

	public static void main(String[] args) {
		new Chessboard().start();

	}

}
