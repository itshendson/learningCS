import javax.swing.*;

public class FrameDragNDrop extends JFrame {

    DragNDrop dragNDrop = new DragNDrop();

    FrameDragNDrop() {

        this.add(dragNDrop);
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }

}
