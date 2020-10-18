package lab_2_pac;
import java.util.*;

public class TestBook
{
    public static void main(String arg[])
    {
        Book book = new Book("__author__", "__nameBook__",
                new GregorianCalendar(2020, 9, 18));
        System.out.println(book.toString());
        book.setAuthor("author2__");
        System.out.println(book.toString());
    }

}
