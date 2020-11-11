package lab9_pac;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class LabClass extends JFrame
{
    protected JTextField addINN_student;
    protected JTextField addNameStudent;
    protected JButton startButton;
    protected JTextField infoAddStudent;
    protected JButton outButton;
    protected JTextArea outText;
    protected JButton outFindStudentButton;
    protected JTextField inFindNameStudent;
    protected JTextField outFindStudentText;

    TreeSet<Student> treeSet;
    LabClass()
    {
        addINN_student = new JTextField();
        addNameStudent = new JTextField();
        startButton = new JButton("add Student");
        infoAddStudent = new JTextField();
        outButton = new JButton("write all student");
        outText = new JTextArea();
        outFindStudentButton = new JButton("find student");
        inFindNameStudent = new JTextField();
        outFindStudentText = new JTextField();
        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(9, 1);
        grid.setLayout(layout);
        grid.add(addINN_student);
        grid.add(addNameStudent);
        grid.add(startButton);
        grid.add(infoAddStudent);
        grid.add(outButton);
        grid.add(outText);
        grid.add(outFindStudentButton);
        grid.add(inFindNameStudent);
        grid.add(outFindStudentText);
        setContentPane(grid);

        setVisible(true);

    }

    public void addStudent()
    {
        try
        {
            if (addNameStudent.getText() == "")
                throw new EmptyStringExeption("empty name");
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(
                    null,
                    String.format("Name Empty"),
                    "problem",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (addINN_student.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(
                    null,
                    String.format("INN Empty"),
                    "problem",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        treeSet.add(new Student(addINN_student.getText(), addNameStudent.getText()));
    }

    public static void main(String arg[])
    {
        new LabClass();
    }
}
