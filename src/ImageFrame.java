import javax.swing.*;
import java.awt.*;

public class ImageFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("path/to/your/image.jpg"); // Change this to the path of your image file

        // Create a JLabel with the image
        JLabel imageLabel = new JLabel(imageIcon);

        // Add the JLabel to the frame
        frame.add(imageLabel);

        frame.setVisible(true);
    }
}
