import java.awt.*;
import javax.swing.*;

public class BackgroundImageJFrame extends JFrame {

    public BackgroundImageJFrame() {
        setTitle("Background Image JFrame");
        setLayout(null);

        JLabel backgroundImageLabel = new JLabel();
        backgroundImageLabel.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\background.jpg"));
        add(backgroundImageLabel);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BackgroundImageJFrame();
    }
}