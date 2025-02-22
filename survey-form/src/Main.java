import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        Font customFont = new Font("Arial", Font.BOLD, 14);
        JFrame frame = new JFrame("Survey form!");
        frame.setFont(customFont);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);


        // Create title label
        JLabel title = new JLabel("Survey Form");
        title.setFont(customFont);
        title.setHorizontalAlignment(JLabel.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Create start button
        JButton startButton = new JButton("Start!");
        startButton.setFont(customFont);
        startButton.setHorizontalAlignment(JButton.CENTER);
        panel.add(startButton, BorderLayout.CENTER);



        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
