import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException, FontFormatException {

        JFrame frame = new JFrame(); //create frame;

        frame.setSize(420,420); // Set x dimension, y dimension;
        frame.setTitle("testing"); // Sets title of frame;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Actually exit application;

        ImageIcon image = new ImageIcon("Src/Logo.jpg"); // create img icon

        Border border = BorderFactory.createLineBorder(Color.BLACK, 6);
        frame.setIconImage(image.getImage()); //Change icon of frame

        frame.getContentPane().setBackground(Color.white); //Change Background Color

    // JLabel = GUI DISPLAY AREA FOR STRING OF TEXT, IMAGE OR BOTH;

    JLabel label = new JLabel(); // Create Label

    label.setText("Test");

//  label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(Color.white);
    label.setFont(new Font("Sans-Serif", Font.BOLD, 20));
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.TOP); //set vertical position within label
    label.setHorizontalAlignment(JLabel.CENTER); //Set horizontal position text within label

        frame.add(label);



        frame.setVisible(true); //make frame visible






    }
}
