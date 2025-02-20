package packages;
import java.awt.*;
import javax.swing.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(10, 20)));


        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField nameField = new JTextField(15);
        nameField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        ageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField ageField = new JTextField(15);
        ageField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField emailField = new JTextField(15);
        emailField.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        levelLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton level1 = new JRadioButton("مبتدی");
        level1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton level2 = new JRadioButton("متوسط");
        level2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton level3 = new JRadioButton("پیشرفته");
        level3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton level4 = new JRadioButton("بدون آشنایی");
        level4.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
