package lab_1_pac;

public class TestClass
{
    public static void main(String arg[])
    {
        //var 5
        int answer = 1;
        //fac_number
        int numberFactorial = 5;
        for (int i = 1; i <= numberFactorial; ++i)
            answer *= i;
        System.out.print(answer);
    }
}
