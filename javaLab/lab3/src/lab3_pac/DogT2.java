package lab3_pac;

public class DogT2 extends Dog
{
    DogT2(String in_name, int in_age)
    {
        super(in_name, in_age);
    }

    public String lol_method()
    {
        return "T2 dog lol";
    }
    public String toString()
    {
        return "dogT2, " + super.toString();
    }
}
