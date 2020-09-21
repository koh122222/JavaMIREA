package lab1;
import java.lang.*;

public class firstClass {
    public static void main(String[] arg)
    {
        Dog dog1 = new Dog("DOG1", 10);
        Ball ball1 = new Ball(5);
        Book book1 = new Book(120, "JAVA LOL");
        System.out.println(dog1.toString());
        System.out.println(ball1.toString());
        System.out.println(book1.toString());
        return;
    }
}
