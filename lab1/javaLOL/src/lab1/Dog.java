package lab1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public Dog(String in_name, int in_age)
    {
        name = in_name;
        age = in_age;
    }

    public Dog(String in_name)
    {
        name = in_name;
        age = -1;
    }

    public Dog(int in_age)
    {
        name = "_error_";
        age = in_age;
    }

    public Dog()
    {
        name = "_error_";
        age = -1;
    }

    public void setAge(int in_age)
    {
        age = in_age;
    }

    public void setName(String in_name)
    {
        name = in_name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public String toString(){
        return name + ", age " + age;
    }
    public void intoHumanAge(){
        System.out.println(name +
                "'s age in human years is "+ age * 7 + " years");
    }


    public String sound()
    {
        return "Gav";
    }
}


