import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame implements ActionListener {

    JButton canadaFlagButton;
    JButton firstFrameButton;
    JButton gridButton;
    JButton dinnerButton;
    JButton clickerButton;

    MainGui() {

        canadaFlagButton = new JButton("Canada Flag");
        canadaFlagButton.setBounds(100, 100, 200, 50);
        canadaFlagButton.setFocusable(false);
        canadaFlagButton.addActionListener(this);

        firstFrameButton = new JButton("ImageIcon + Text");
        firstFrameButton.setBounds(100, 150, 200, 50);
        firstFrameButton.setFocusable(false);
        firstFrameButton.addActionListener(this);

        gridButton = new JButton("Find the Treasure");
        gridButton.setBounds(100, 200, 200, 50);
        gridButton.setFocusable(false);
        gridButton.addActionListener(this);

        dinnerButton = new JButton("Dinner Menu");
        dinnerButton.setBounds(100, 250, 200, 50);
        dinnerButton.setFocusable(false);
        dinnerButton.addActionListener(this);

        clickerButton = new JButton("Clicker");
        clickerButton.setBounds(100, 300, 200, 50);
        clickerButton.setFocusable(false);
        clickerButton.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setLayout(null);
        this.add(canadaFlagButton);
        this.add(firstFrameButton);
        this.add(gridButton);
        this.add(clickerButton);
        this.add(dinnerButton);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==canadaFlagButton) {
            CanadaFlag window1 = new CanadaFlag();
        }
        else if (e.getSource()== firstFrameButton){
            FirstFrame window2 = new FirstFrame();
        }
        else if (e.getSource()==gridButton) {
            GridFrame window3 = new GridFrame();
        }
        else if (e.getSource()==dinnerButton) {
            DinnerMenu window3 = new DinnerMenu();
        }
        else if (e.getSource()==clickerButton) {
            Clicker window4 = new Clicker();
        }

    }
}
