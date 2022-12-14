import java.awt.*;
import javax.swing.*;

public class SwingL {
    JFrame frame;

    public static void main(String[] args) {
        SwingL example = new SwingL();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event ->
                System.out.println("Come on, do it!")
        );
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}