package LAB_10;

import javax.swing.*;
import java.awt.*;

public class Q04_FontAnimation extends JFrame {
    int size = 6;
    boolean increasing = true;

    Q04_FontAnimation() {
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Timer t = new Timer(100, e -> {
            if (increasing) size++;
            else size--;

            if (size >= 96) increasing = false;
            if (size <= 6) increasing = true;

            repaint();
        });
        t.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, size));
        g.drawString("Hello", 150, 150);
    }

    public static void main(String[] args) {
        new Q04_FontAnimation();
    }
}