package lab9;
import  java.util.*;
import java.util.Scanner;
import java.lang.*;


public class TestClass {
    static Vector<Project> box = new Vector<Project>();
     static void scan(Project findProject)
     {
         boolean found = false;
         for (int i =0; i < box.size(); ++i){
             if (box.get(i).getName().equals(findProject.getName()))
             {
                 System.out.print("Founded Name: ");
                 System.out.println(box.get(i).getName());
                 found = true;
                 try {
                     if (box.get(i).getINN() == findProject.getINN())
                         System.out.println("project founded");
                     else
                         throw new RuntimeException();
                 } catch (RuntimeException e)
                 {
                     System.out.println("not found");
                 }
             }
         }
         if (!found){
             System.out.print("Error! Not founded.");
         }
     }

    public static void main(String[] args) {
        box.add(new Project ("hahf", 1975730127));
        box.add(new Project ("kjdf", 1975164349));
        box.add(new Project ("gbsf", 1975743622));
        box.add(new Project ("gsgb", 1975960042));
        box.add(new Project ("sefg", 1975123713));
        box.add(new Project ("nghf", 1975960042));
        box.add(new Project ("hfgs", 1146363262));
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter INN, Name: ");
        int t1 = myScanner.nextInt();
        String str = myScanner.next();

        Project temp = new Project(str, t1);
        scan(temp);
    }
}
