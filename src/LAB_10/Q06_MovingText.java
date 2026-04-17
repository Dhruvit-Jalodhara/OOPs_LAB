package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q06_MovingText extends JFrame {
    DrawingPanel panel;

    Q06_MovingText() {
        panel = new DrawingPanel();
        add(panel);

        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        panel.setFocusable(true);
        panel.requestFocusInWindow();
    }

    class DrawingPanel extends JPanel implements KeyListener {
        String text = "dhruvit";
        int x = 500;

        DrawingPanel() {
            addKeyListener(this);

            Timer t = new Timer(100, e -> {
                x -= 5;
                if (x < -100) x = getWidth();
                repaint();
            });
            t.start();
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString(text, x, 150);
        }

        public void keyTyped(KeyEvent e) {
            text += e.getKeyChar();
        }

        public void keyPressed(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
    }

    public static void main(String[] args) {
        new Q06_MovingText();
    }
}