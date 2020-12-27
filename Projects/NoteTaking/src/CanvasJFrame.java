import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.management.ClassLoadingMXBean;

public class CanvasJFrame extends JFrame {

    private static int WIDTH = 1000;
    private static int HEIGHT = 1000;

    Point mousePoint;
    TextArea textArea;
    JLabel label;

    public CanvasJFrame() {

        ClickListener clickListener = new ClickListener();

        //Basic JFrame
        this.setTitle("Canvas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(null);
        this.addMouseListener(clickListener);
        this.setVisible(true);

    }

    //When you click on Canvas, get the Points
    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            mousePoint = e.getPoint();

            String noteInput = JOptionPane.showInputDialog("Note");

            label.setText(noteInput);
            label.setForeground(Color.BLACK);
            label.setFont(new Font("Comic Sans", Font.BOLD, 13));
            label.setBounds((int) mousePoint.getX(), (int) mousePoint.getY(), 150, 150);

//            textArea = new TextArea();
//            textArea.setText(note);
//            textArea.setFont(new Font("Comic Sans", Font.BOLD, 15));
//            textArea.setBounds((int) mousePoint.getX(), (int) mousePoint.getY(), 50, 50);
//            textArea.setBackground(Color.WHITE);
//            textArea.setForeground(Color.BLACK);
//            textArea.setEditable(true);

        }

    }



}
