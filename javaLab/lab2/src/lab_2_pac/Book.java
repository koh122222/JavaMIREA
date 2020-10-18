package lab_2_pac;
import java.util.*;

public class Book
{
    private String author;
    private String nameBook;
    private Calendar dateCreate;
    Book(String in_author, String in_nameBook, Calendar in_dateCreate)
    {
        author = in_author;
        nameBook = in_nameBook;
        dateCreate = in_dateCreate;
    }

    void setAuthor(String in_author)
    {
        author = in_author;
    }
    void setNameBook(String in_nameBook)
    {
        nameBook = in_nameBook;
    }
    void setDateCreate(Calendar in_dateCreate) {
        dateCreate = in_dateCreate;
    }
    String getAuthor()
    {
        return author;
    }
    String getNameBook()
    {
        return nameBook;
    }
    Calendar getDateCreate()
    {
        return dateCreate;
    }

    public String toString()
    {
        return "author: " + author + ", name book: " + nameBook + ", date: " + dateCreate.getTime();
    }
}
