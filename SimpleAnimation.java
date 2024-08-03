import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation extends JPanel implements ActionListener {
    private int x = 0; // Initial x position of the ball
    private int y = 100; // y position of the ball
    private int ballDiameter = 30; // Diameter of the ball
    private int xSpeed = 2; // Speed of the ball

    public SimpleAnimation() {
        Timer timer = new Timer(10, this); // Timer calls actionPerformed every 10 ms
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black); // Set the color of the ball
        g.fillOval(x, y, ballDiameter, ballDiameter); // Draw the ball
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += xSpeed; // Update the x position of the ball
        if (x + ballDiameter > getWidth() || x < 0) {
            xSpeed = -xSpeed; // Reverse direction if the ball hits the window edges
        }
        repaint(); // Repaint the panel
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Animation");
        SimpleAnimation animation = new SimpleAnimation();
        frame.add(animation);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
