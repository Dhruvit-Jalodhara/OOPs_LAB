package LAB_10;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q01_Clock extends JFrame {
    JLabel label;

    Q01_Clock() {
        label = new JLabel("", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));
        add(label);

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        Timer t = new Timer(1000, e -> {
            String time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
            label.setText(time);
        });
        t.start();
    }

    public static void main(String[] args) {
        new Q01_Clock();
    }
}