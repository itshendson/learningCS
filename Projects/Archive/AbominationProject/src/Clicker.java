import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clicker extends JFrame implements ActionListener {

    int count = 0;
    JLabel myLabel; // This has to be outside of the GUI() constructor so that main can see this label
    JPanel myPanel;

    //Constructor for GUI
    public Clicker() {

        JButton clickerButton = new JButton("Click Me!");
        myLabel = new JLabel(("Number of clicks: 0    "));
        clickerButton.addActionListener(this);
        clickerButton.setFocusable(false); //Removes dotted line around the text of the button

        myPanel = new JPanel(); //This is the layout within the window
        myPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); //Sets the border
        myPanel.setLayout(new GridLayout(0, 1));
        myPanel.add(clickerButton);
        myPanel.add(myLabel);

        //These are all regular GUI setup stuff, don't need to memorize
        this.add(myPanel, BorderLayout.CENTER); //Adds a panel to the frame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Sets what happens if you close the frame
        this.setTitle("My Test GUI"); //Set the title of the frame
        this.pack(); //Set the window to match size
        this.setVisible(true); //Sets window to be visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        myLabel.setText("Number of Clicks: " + count + "");
    }
}
