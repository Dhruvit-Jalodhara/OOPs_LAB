package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q03_Draw extends JFrame {
    int x, y;

    Q03_Draw() {
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                g.drawLine(x, y, e.getX(), e.getY());
                x = e.getX();
                y = e.getY();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q03_Draw();
    }
}