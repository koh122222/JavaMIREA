package lab6_pac;
import java.awt.*;
import javax.swing.*;

class GProgram extends JFrame {
    int rand = (int) (Math.random() * 10);
    int attemps = 4;

    JTextField input = new JTextField(20);
    JButton button = new JButton("OK");

    void process()
    {
        try {
            int t = Integer.parseInt(input.getText());

            if (t > rand)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("The number you are looking for is smaller.\n" +
                                "The remaining attempts: %d", --attemps),
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);

            else if (t < rand)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("The number you are looking for is larger.\n" +
                                "The remaining attempts: %d", --attemps),
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);

            else {
                JOptionPane.showMessageDialog(
                        null,
                        String.format("win", --attemps),
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);

                System.exit(0);
            }

            if (attemps < 0) { System.exit(0); }
        } catch (Exception ignored) { }
    }

    public GProgram() {
        super("lab 6");
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setSize(300, 100);
        setLayout(new FlowLayout());

        add(input);
        add(button);

        button.addActionListener(t -> {
            process();
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new GProgram();
    }
}