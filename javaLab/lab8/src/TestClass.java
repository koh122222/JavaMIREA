import java.io.*;
import java.util.*;

public class TestClass
{
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        try (FileWriter writer = new FileWriter("writeFile.txt", false))
        {
            writer.write(str);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
