package lab3_pac;

public class TestDog
{
    static public void main(String arg[])
    {
        DogT1 dogT1 = new DogT1("dogT1_name__", 1);
        DogT2 dogT2 = new DogT2("dogT2_name__", 2);
        System.out.println(dogT2.lol_method());
        System.out.println(dogT1.toString());
        System.out.println(dogT2.toString());
    }
}
