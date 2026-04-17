package LAB_10;

import javax.swing.*;
import java.awt.*;

public class Q05_FontStyles extends JFrame {

    public void paint(Graphics g) {
        super.paint(g);

        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Dhruvit", 50, 100);

        g.setFont(new Font("SansSerif", Font.BOLD, 30));
        g.drawString("Dhruvit", 50, 150);

        g.setFont(new Font("Monospaced", Font.ITALIC, 40));
        g.drawString("Dhruvit", 50, 200);
    }

    Q05_FontStyles() {
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Q05_FontStyles();
    }
}