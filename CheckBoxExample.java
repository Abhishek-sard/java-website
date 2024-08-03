import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample extends JFrame implements ActionListener {
    // Create checkboxes
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;

    public CheckBoxExample() {
        // Set the title of the frame
        setTitle("Checkbox Example");

        // Create checkboxes with labels
        checkBox1 = new JCheckBox("Option 1");
        checkBox2 = new JCheckBox("Option 2");
        checkBox3 = new JCheckBox("Option 3");

        // Add action listeners to the checkboxes
        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        checkBox3.addActionListener(this);

        // Create a panel and add checkboxes to it
        JPanel panel = new JPanel();
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

        // Add the panel to the frame
        add(panel);

        // Set the frame size
        setSize(300, 100);

        // Set the frame's close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        setVisible(true);
    }

    // Implement the actionPerformed method for the ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedOptions = "";
        
        // Check which checkboxes are selected
        if (checkBox1.isSelected()) {
            selectedOptions += checkBox1.getText() + " ";
        }
        if (checkBox2.isSelected()) {
            selectedOptions += checkBox2.getText() + " ";
        }
        if (checkBox3.isSelected()) {
            selectedOptions += checkBox3.getText() + " ";
        }

        // Display the selected options
        JOptionPane.showMessageDialog(this, "Selected Options: " + selectedOptions);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
