import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel myLabel; // This has to be outside of the GUI() constructor so that main can see this label
    private JFrame myFrame; //This is the window
    private JPanel myPanel;



    //Constructor for GUI
    public GUI() {

        myFrame = new JFrame();

        JButton myButton = new JButton("Click Me!");
        myLabel = new JLabel(("Number of clicks: 0"));
        myButton.addActionListener(this);

        myPanel = new JPanel(); //This is the layout within the window
        myPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); //Sets the border
        myPanel.setLayout(new GridLayout(0, 1));
        myPanel.add(myButton);
        myPanel.add(myLabel);

        //These are all regular GUI setup stuff, don't need to memorize
        myFrame.add(myPanel, BorderLayout.CENTER); //Adds a panel to the frame
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Sets what happens if you close the frame
        myFrame.setTitle("My Test GUI"); //Set the title of the frame
        myFrame.pack(); //Set the window to match size
        myFrame.setVisible(true); //Sets window to be visible

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        myLabel.setText("Number of Clicks: " + count + "");
    }
}
