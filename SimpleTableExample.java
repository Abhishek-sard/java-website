import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SimpleTableExample extends JFrame {
    
    public SimpleTableExample() {
        // Set the title of the frame
        setTitle("JTable Example");

        // Sample data for the table
        String[][] data = {
            {"1", "Alice", "23"},
            {"2", "Bob", "30"},
            {"3", "Carol", "28"},
            {"4", "David", "35"}
        };

        // Column names for the table
        String[] columnNames = {"ID", "Name", "Age"};

        // Create a table model and set it to the table
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Add the table to a scroll pane (for scrolling if the content exceeds the visible area)
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the scroll pane to the frame
        add(scrollPane, BorderLayout.CENTER);

        // Set the frame size
        setSize(400, 200);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the frame
        SwingUtilities.invokeLater(SimpleTableExample::new);
    }
}

