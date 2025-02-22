package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        // Create thank you label

        Font customFont = new Font("Arial", Font.BOLD, 14);
        JLabel thankYouLabel = new JLabel("Thank you for your cooperation!");
        thankYouLabel.setFont(customFont);
        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);
        thankYouLabel.setVerticalAlignment(SwingConstants.CENTER);
        thankYouLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        thankYouLabel.setAlignmentY(Component.CENTER_ALIGNMENT);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
