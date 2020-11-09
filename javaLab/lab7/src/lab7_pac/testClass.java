package lab7_pac;
import java.util.*;
public class testClass
{
    public static void main(String arg[])
    {
        //1
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        System.out.println(arrayList.indexOf(5));
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.addFirst(4);
        System.out.println((linkedList.getFirst()));
        ArrayListLol arrayListLol = new ArrayListLol();
        arrayListLol.add(3);
        System.out.println(arrayListLol.get(0));

    }
}
