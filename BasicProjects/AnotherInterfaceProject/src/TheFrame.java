import javax.swing.*;
import java.awt.*;

public class TheFrame extends JFrame {

    TheFrame() {

        //creating labels
        JLabel label = new JLabel();
        label.setText("The Start of Your Pokemon Journey");
        ImageIcon kobe = new ImageIcon("C:\\Users\\Hendson-Desktop\\Desktop\\Personal\\Projects\\learningCS\\BasicProjects\\AnotherInterfaceProject\\src\\resources\\journey.jpg");
        label.setIcon(kobe);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text left, center or right of imageicon
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text top, bottom of imageicon
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD, 20));

        //creating the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//When you click the x button, it will kill the application not just hide it
        this.setSize(500, 500); //sets the x and y dimensions of frame
        this.setTitle("Another Interface Project"); //Gives the frame window a name
        this.setVisible(true); //Makes frame visible
        this.add(label);

        // Background color of frame
        this.getContentPane().setBackground(Color.white); //change color of background
        //this.getContentPane().setBackground(new Color(255,100,150)); //more customizable colors



    }
}
