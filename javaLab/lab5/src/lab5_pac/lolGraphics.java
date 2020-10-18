package lab5_pac;
import javax.swing.*;
import java.awt.*;
import java.lang.Thread;
public class lolGraphics extends  JFrame
{
    protected JLabel gLabel;
    public lolGraphics()
    {
        gLabel = new JLabel();
        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(1, 1);
        grid.add(gLabel);
        setContentPane(grid);
        setSize(500, 500);
        setVisible(true);
        while (true)
        {
            gLabel.setIcon(new ImageIcon("ani1.png"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            gLabel.setIcon(new ImageIcon("ani2.png"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            gLabel.setIcon(new ImageIcon("ani3.png"));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String arg[])
    {
        new lolGraphics();
    }
}
