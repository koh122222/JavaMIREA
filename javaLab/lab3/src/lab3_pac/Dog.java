package lab3_pac;

public abstract class Dog
{
    protected String name;
    protected int age;
    Dog(String in_name, int in_age)
    {
        name = in_name;
        age = in_age;
    }
    public String toString()
    {
        return "name: " + name + ", age: " + age;
    }
}
