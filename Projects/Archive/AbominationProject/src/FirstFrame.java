import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FirstFrame extends JFrame {

    FirstFrame() {

        //creating labels
        JLabel label = new JLabel();
        label.setText("The Start of Your Pokemon Journey");
        ImageIcon pkmn = new ImageIcon("C:\\Users\\Hendson-Desktop\\Desktop\\Personal\\Projects\\learningCS\\Projects\\AbominationProject\\src\\resources\\journey.jpg");

        Border border = BorderFactory.createLineBorder(Color.white, 3);

        //Everything label related
        label.setIcon(pkmn);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text left, center or right of imageicon
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text top, bottom of imageicon
        label.setForeground(Color.WHITE); //sets font color
        label.setFont(new Font("Sans Serif", Font.BOLD, 20)); //sets the font's format
        label.setIconTextGap(-50); //sets the gap between icon and text

        //Sets the alignment of the label
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //sets the label to the center
        label.setHorizontalAlignment(JLabel.CENTER); //sets label to the center
        //label.setBounds(100, 100, 1000, 1000); //sets x and y position within frame regardless of resizing

        //Sets the background
        label.setBackground(Color.GRAY); //sets background color
        label.setOpaque(true); //makes the background opaque so that your background color can be seen

        //creating the frame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//When you click the x button, it will kill the application not just hide it
        //this.setSize(500, 500); //sets the x and y dimensions of frame
        //this.setLayout(null);
        this.setTitle("Another Interface Project"); //Gives the frame window a name
        this.setVisible(true); //Makes frame visible
        this.add(label);
        this.pack(); //this adjusts the size of the frame according to what fits the label

        // Background color of frame
        this.getContentPane().setBackground(Color.white); //change color of background
        //this.getContentPane().setBackground(new Color(255,100,150)); //more customizable colors



    }
}
