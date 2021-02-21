import javax.swing.*;
import java.awt.*;

public class CanadaFlag extends JFrame {

    CanadaFlag() {

        //creating label for maple leaf
        JLabel leafLabel = new JLabel();
        ImageIcon leaf = new ImageIcon("C:\\Users\\Hendson-Desktop\\Desktop\\Personal\\Projects\\learningCS\\Projects\\AbominationProject\\src\\resources\\mapleleaf.png");
        leafLabel.setIcon(leaf);
        leafLabel.setVerticalAlignment(JLabel.CENTER); //This line only works because a BorderLayout() was set in whiteMiddlePanel
        leafLabel.setHorizontalAlignment(JLabel.CENTER); //This line only works because a BorderLayout() was set in whiteMiddlePanel

        JPanel redLeftPanel = new JPanel();
        redLeftPanel.setBackground(Color.red);
        redLeftPanel.setBounds(0, 0, 400, 1000); //There are better way to center it so that the code is more robust but for simplicity...

        JPanel redRightPanel = new JPanel();
        redRightPanel.setBackground(Color.red);
        redRightPanel.setBounds(1000, 0, 400, 1000);

        JPanel whiteMiddlePanel = new JPanel();
        whiteMiddlePanel.setBackground(Color.white);
        whiteMiddlePanel.setBounds(400, 0, 600, 1000);
        whiteMiddlePanel.setLayout(new BorderLayout()); //You need this line so that the leaf icon can be moved around

        // All the usual JFrame stuff but this time we'll be using setLayout
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1400, 1000);
        this.setVisible(true);
        this.add(redLeftPanel);
        this.add(redRightPanel);
        this.add(whiteMiddlePanel);
        whiteMiddlePanel.add(leafLabel); //This adds the maple leaf icon to this panel instead of the frame


    }

}
