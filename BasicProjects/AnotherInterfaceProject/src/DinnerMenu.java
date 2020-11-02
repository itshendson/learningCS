import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DinnerMenu extends JFrame implements ActionListener {

    JComboBox comboBox;
    JButton foodButton;
    JProgressBar cookingBar;
    int counter;

    DinnerMenu() {

        String[] menu = {"Hamburger", "Pizza", "Bento Box"};
        comboBox = new JComboBox(menu);
        comboBox.addActionListener(this);

        foodButton = new JButton("Order");
        foodButton.addActionListener(this);
        foodButton.setFocusable(false);

        cookingBar = new JProgressBar();
        cookingBar.setValue(0);
        cookingBar.setStringPainted(true);
        cookingBar.setForeground(Color.red);
        cookingBar.setBackground(Color.GRAY);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(comboBox);
        this.add(foodButton);
        this.add(cookingBar);
        this.setLayout(new FlowLayout(150,20,20));
        this.setSize(300, 300);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==foodButton) {
            fill();
            System.out.println(comboBox.getSelectedItem());
            counter = 0;
        }
    }

    public void fill() {
        counter = 0;

        while (counter <= 100) {
            cookingBar.setValue(counter);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 10;
        }
        cookingBar.setString("Food is ready!");
    }
}
