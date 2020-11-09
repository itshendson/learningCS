import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridFrame extends JFrame implements ActionListener {

    JButton treasureButton;
    JButton yesNoButton;
    JButton inputButton;

    GridFrame() {

        treasureButton = new JButton("7");
        treasureButton.addActionListener(this);

        yesNoButton = new JButton("1");
        yesNoButton.addActionListener(this);;

        inputButton = new JButton("9");
        inputButton.addActionListener(this);;

        this.add(yesNoButton);
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(treasureButton);
        this.add(new JButton("8"));
        this.add(inputButton);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(3,3, 10, 10)); //rows, columns, horizontal gap, vertical gap,
        this.setSize(900, 900);
        this.setVisible(true); //This line has to come after the button is added

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==treasureButton) {
            JOptionPane.showMessageDialog(null, "You've found the treasure!", "Treasure", JOptionPane.PLAIN_MESSAGE);
        } else if (e.getSource()==yesNoButton){
            int answer = JOptionPane.showConfirmDialog(null, "This is not the treasure, do you understand?", "YES_NO", JOptionPane.YES_NO_OPTION);
            if (answer==0) {
                JOptionPane.showMessageDialog(null, "Good. Now keep looking", "Good", JOptionPane.PLAIN_MESSAGE);
            } else  {
                //Do nothing
            }
        } else if (e.getSource()==inputButton){
            String favNumber = JOptionPane.showInputDialog("What is your favourite number?");
            inputButton.setText(favNumber);
        }
    }
}
