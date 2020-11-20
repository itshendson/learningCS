import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Spaceship extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon shuttle;

    Spaceship() {

        shuttle = new ImageIcon("C:\\Users\\Hendson-Desktop\\Desktop\\Personal\\Projects\\learningCS\\Projects\\AbominationProject\\src\\resources\\icons8-space-shuttle-64.png");

        label = new JLabel();
        label.setBounds(310,650,100,100);
        label.setIcon(shuttle);
        label.setText("| | | | |");
        label.setForeground(Color.RED);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setFont(new Font("Times New Roman",Font.BOLD, 15));

        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(700,800);
        this.setResizable(false);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);


    }

    @Override
    public void keyTyped(KeyEvent e) {
        //Invoked when key is typed. Uses keyChar, char output
        switch(e.getKeyChar()) {
            case 'w': label.setLocation(label.getX(), label.getY()-30);
                break;
            case 'a': label.setLocation(label.getX()-30, label.getY());
                break;
            case 's': label.setLocation(label.getX(), label.getY()+30);
                break;
            case 'd': label.setLocation(label.getX()+30, label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Invoked when key is pressed on keyboard. Uses KeyCode, int output

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //Invoked whenever a button is released


    }
}
