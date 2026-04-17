package LAB_10;

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;

public class Q02_ImageAudio extends JFrame {
    Image img;

    Q02_ImageAudio() {
        img = Toolkit.getDefaultToolkit().getImage("/Users/dhruvitjalodhara/Pictures/photos/3B5A2057-7A89-4B86-8E74-5F3D30E0038F.jpg");

        setSize(800, 1600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        playAudio();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img, 50, 50, this);
    }

    void playAudio() {
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("audio.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Q02_ImageAudio();
    }
}