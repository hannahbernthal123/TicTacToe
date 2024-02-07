import javax.swing.*;
import java.awt.*;


public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    private final int WINDOW_WIDTH = 700;
    private final int WINDOW_HEIGHT = 500;
    private TicTacToe t;

    public TicTacToeViewer(TicTacToe board) {
        this.t = board;


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public Image getxImage() {
        return new ImageIcon("Resources/X.png").getImage();
    }
    public Image getoImage() {
        return new ImageIcon("Resources/O.png").getImage();
    }
    public void paint(Graphics g) {
        if (t.getBoard()[0][0] != null) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    t.getBoard()[i][j].draw(g);
                }
            }
        }
        if (t.getGameOver() == true) {
            g.setColor(Color.black);
            g.setFont(new Font("font1", Font.ROMAN_BASELINE, 60));
            g.drawString(t.getWinner() + " wins!", 100, 450);
        }
        if (t.checkTie() == true) {
            g.drawString("It's a tie", 100, 450);
        }
    }
}
