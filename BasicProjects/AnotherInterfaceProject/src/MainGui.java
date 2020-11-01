import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends JFrame implements ActionListener {

    JButton canadaFlagButton;
    JButton firstFrameButton;
    JButton gridButton;

    MainGui() {

        canadaFlagButton = new JButton("Canada Flag");
        canadaFlagButton.setBounds(100, 100, 200, 50);
        canadaFlagButton.setFocusable(false);
        canadaFlagButton.addActionListener(this);

        firstFrameButton = new JButton("ImageIcon + Text");
        firstFrameButton.setBounds(100, 150, 200, 50);
        firstFrameButton.setFocusable(false);
        firstFrameButton.addActionListener(this);

        gridButton = new JButton("GridLayout");
        gridButton.setBounds(100, 200, 200, 50);
        gridButton.setFocusable(false);
        gridButton.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setLayout(null);
        this.add(canadaFlagButton);
        this.add(firstFrameButton);
        this.add(gridButton);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==canadaFlagButton) {
            CanadaFlag window1 = new CanadaFlag();
        } else if (e.getSource()== firstFrameButton){
            FirstFrame window2 = new FirstFrame();
        } else if (e.getSource()==gridButton) {
            GridFrame window3 = new GridFrame();
        }

    }
}
