import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragNDrop extends JPanel {

    ImageIcon folderIcon = new ImageIcon("C:\\Users\\Hendson-Desktop\\Desktop\\Personal\\Projects\\learningCS\\Projects\\AbominationProject\\src\\resources\\folder.png");
    final int WIDTH = folderIcon.getIconWidth();
    final int HEIGHT = folderIcon.getIconHeight();
    Point imageCorner;
    Point prevPoint;

    //Constructor
    DragNDrop() {

        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        folderIcon.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {

        public void mousePressed(MouseEvent e) {
            prevPoint = e.getPoint();
        }

    }

    private class DragListener extends MouseMotionAdapter {

        public void mouseDragged(MouseEvent e) {
            Point currPoint = e.getPoint();
            imageCorner.translate (
                    (int) (currPoint.getX() - prevPoint.getX()),
                    (int) (currPoint.getY() - prevPoint.getY())
            );
            prevPoint = currPoint;
            repaint();
        }

    }

}






