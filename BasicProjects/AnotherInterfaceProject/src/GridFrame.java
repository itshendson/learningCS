import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame{

    GridFrame() {

        this.add(new JButton("1"));
        this.add(new JButton("2"));
        this.add(new JButton("3"));
        this.add(new JButton("4"));
        this.add(new JButton("5"));
        this.add(new JButton("6"));
        this.add(new JButton("7"));
        this.add(new JButton("8"));
        this.add(new JButton("9"));

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(3,3, 10, 10)); //rows, columns, horizontal gap, vertical gap,
        this.setSize(900, 900);
        this.setVisible(true); //This line has to come after the button is added

    }


}
