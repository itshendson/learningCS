import javax.swing.*;
import java.awt.*;

public class TheFrame extends JFrame {

    TheFrame() {

        this.setSize(400, 400); //sets the x and y dimensions of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//When you click the x button, it will kill the application not just hide it
        //frame.setResizable(false); //Prevents frame from being resized
        this.setTitle("Another Interface Project"); //Gives the frame window a name
        this.setVisible(true); //Makes frame visible

        ImageIcon image = new ImageIcon("spacex.png"); //Grabs the filename called "spacex" and set it to image
        this.setIconImage(image.getImage());//Change icon of frame
        //frame.getContentPane().setBackground(Color.gray); //change color of background
        this.getContentPane().setBackground(new Color(255,100,150)); //more customizable colors

    }
}
