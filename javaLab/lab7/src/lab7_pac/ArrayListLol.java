package lab7_pac;

import java.util.ArrayList;

public class ArrayListLol
{
    private ArrayList<Integer> arrayList;
    public ArrayListLol()
    {
        arrayList = new ArrayList<Integer>();
    }
    public void add(int in_element)
    {
        arrayList.add(in_element);
    }
    public void add(int index, int in_element)
    {
        arrayList.add(index ,in_element);
    }
    public void clear()
    {
        arrayList.clear();
    }
    public int get(int index)
    {
        return arrayList.get(index);
    }


}
