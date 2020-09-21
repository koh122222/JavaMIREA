package lab1;
import java.lang.*;
public class Ball
{
    private int size;

    public Ball(int in_size)
    {
        size = in_size;
    }

    public void setSize(int in_size)
    {
        size = in_size;
    }

    public int getSize()
    {
        return size;
    }

    public String toString()
    {
        return "Ball, size " + size;
    }



}
