import java.awt.*;

/**
 * A class written to support the TicTacToe Game.
 *
 * Each Square object is one position of the TicTacToe
 * board. It maintains information on the marker, its
 * location on the board, and whether it is part
 * of the winning set.
 *
 * @author: Nandhini Namasivayam
 * @version: Jan 2023
 */

public class Square {

    private String marker;
    private int row;
    private int col;
    private boolean isWinningSquare;
    private TicTacToeViewer square;
    private Image o;
    private Image x;

    /**
     * Constructor to initialize one Square of the
     * TicTacToe board
     * @param row the row the square is in
     * @param col the column the square is in
     */
    public Square(int row, int col, TicTacToeViewer square) {
        this.row = row;
        this.col = col;
        this.square = square;
        this.marker = TicTacToe.BLANK;
        this.isWinningSquare = false;
        x = square.getxImage();
        o = square.getoImage();
    }

    /******************** Getters and Setters ********************/
    public String getMarker() {
        return this.marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public void setWinningSquare() {
        this.isWinningSquare = true;
    }

    /**
     * Checks if the square has the BLANK marker
     * @return True if the square is empty, False otherwise
     */
    public boolean isEmpty() {
        return this.marker.equals(TicTacToe.BLANK);
    }

    /**
     * @return the marker for the square
     */
    public String toString() {
        return this.marker;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        for (int i = 0; i < 3; i++) {
            g.drawString(String.valueOf(i), 210 + (i * 120), 80);
        }
        for (int i = 0; i < 3; i++) {
            g.drawString(String.valueOf(i), 160, 120 + (i * 120));
        }
        g.drawRect(190 + (100*col), 100+ (100*row), 100, 100);
        if (isWinningSquare == true) {
            g.setColor(Color.GREEN);
            g.fillRect(190 + (100*col), 100+ (100*row), 100, 100);
        }
        if (marker.equals("X")) {

            g.drawImage(x, 190 + (100*col), 100+ (100*row), 100, 100, square);
        }
        if (marker.equals("O")) {
            //TicTacToe.O_MARKER

            g.drawImage(o, 190 + (100*col), 100+ (100*row), 100, 100, square);
        }
    }

}
