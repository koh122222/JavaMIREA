package lab3_pac;

public class DogT1 extends Dog
{
    DogT1(String in_name, int in_age)
    {
        super(in_name, in_age);
    }

    public String toString()
    {
        return "dogT1, " + super.toString();
    }
}
