package packages;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBackground(Color.YELLOW);
        panel.add(Box.createRigidArea(new Dimension(10, 20)));

        // Question 1

        JLabel question1 = new JLabel("How do you like the user interface of this app?");
        Font customFont = new Font("Arial", Font.BOLD, 18);
        question1.setFont(customFont);
        question1.setHorizontalAlignment(SwingConstants.CENTER);
        question1.setAlignmentX(Component.CENTER_ALIGNMENT);


        JRadioButton radio1_1 = new JRadioButton("۱");
        radio1_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio1_2 = new JRadioButton("۲");
        radio1_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio1_3 = new JRadioButton("۳");
        radio1_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio1_4 = new JRadioButton("۴");
        radio1_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio1_5 = new JRadioButton("۵");
        radio1_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        // Question 2

        JLabel question2 = new JLabel("Is is easy for you to access this app?");
        question2.setFont(customFont);
        question2.setHorizontalAlignment(SwingConstants.CENTER);
        question2.setAlignmentX(Component.CENTER_ALIGNMENT);


        JRadioButton radio2_1 = new JRadioButton("۱");
        radio2_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio2_2 = new JRadioButton("۲");
        radio2_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio2_3 = new JRadioButton("۳");
        radio2_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio2_4 = new JRadioButton("۴");
        radio2_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio2_5 = new JRadioButton("۵");
        radio2_5.setAlignmentX(Component.CENTER_ALIGNMENT);


        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        // Question 3

        JLabel question3 = new JLabel("How easy is it to design the pages?");
        question3.setFont(customFont);
        question3.setHorizontalAlignment(SwingConstants.CENTER);
        question3.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio3_1 = new JRadioButton("1");
        radio3_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio3_2 = new JRadioButton("2");
        radio3_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio3_3 = new JRadioButton("3");
        radio3_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio3_4 = new JRadioButton("4");
        radio3_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio3_5 = new JRadioButton("5");
        radio3_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        // Question 4

        JLabel question4 = new JLabel("Are the colors and the fonts appropriate?");
        question4.setFont(customFont);
        question4.setHorizontalAlignment(SwingConstants.CENTER);
        question4.setAlignmentX(Component.CENTER_ALIGNMENT);

        JRadioButton radio4_1 = new JRadioButton("۱");
        radio4_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio4_2 = new JRadioButton("۲");
        radio4_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio4_3 = new JRadioButton("۳");
        radio4_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio4_4 = new JRadioButton("۴");
        radio4_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        JRadioButton radio4_5 = new JRadioButton("۵");
        radio4_5.setAlignmentX(Component.CENTER_ALIGNMENT);

        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        // Next button to go to Page3

        JButton nextButton = new JButton("next page");
        nextButton.setFont(customFont);
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(question1);
        panel.add(radio1_1);
        panel.add(radio1_2);
        panel.add(radio1_3);
        panel.add(radio1_4);
        panel.add(radio1_5);

        panel.add(question2);
        panel.add(radio2_1);
        panel.add(radio2_2);
        panel.add(radio2_3);
        panel.add(radio2_4);
        panel.add(radio2_5);

        panel.add(question3);
        panel.add(radio3_1);
        panel.add(radio3_2);
        panel.add(radio3_3);
        panel.add(radio3_4);
        panel.add(radio3_5);

        panel.add(question4);
        panel.add(radio4_1);
        panel.add(radio4_2);
        panel.add(radio4_3);
        panel.add(radio4_4);
        panel.add(radio4_5);

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
