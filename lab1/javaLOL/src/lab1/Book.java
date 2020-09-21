package lab1;
import java.lang.*;
public class Book
{
    private int countPaper;
    private String name;

    public Book(int in_countPaper, String in_name)
    {
        countPaper = in_countPaper;
        name = in_name;
    }

    public String toString()
    {
        return "Book, " + countPaper + " paper and name " + name;
    }
}
