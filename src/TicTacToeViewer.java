import javax.swing.*;
import java.awt.*;


public class TicTacToeViewer extends JFrame {
    // TODO: Complete this class
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Image x;
    private Image o;
    private Square[][] board;
    private Image[] xando;
    public TicTacToeViewer(Square[][] board) {
        this.board = board;
        this.xando[0] = new ImageIcon("Resources/X.png").getImage();
        this.xando[1] = new ImageIcon("Resources/O.png").getImage();


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Tic Tac Toe");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }
    public Image[] getImages() {
        return xando;
    }

    public void paint(Graphics g) {
        g.draw();
    }
}
