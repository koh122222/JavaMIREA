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
            int writeNumber = Integer.parseInt(input.getText());

            if (writeNumber > rand)
                JOptionPane.showMessageDialog(
                        null,
                        String.format("The number you are looking for is smaller.\n" +
                                "The remaining attempts: %d", --attemps),
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE);

            else if (writeNumber < rand)
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

        setSize(300, 100);

        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(2, 1);
        grid.setLayout(layout);

        grid.add(input);
        grid.add(button);
        setContentPane(grid);
        button.addActionListener(t -> {
            process();
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new GProgram();
    }
}