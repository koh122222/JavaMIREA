package lab9_pac;

public class StudentNotFoundExeption extends RuntimeException
{
    public StudentNotFoundExeption(String errorMessage, Throwable err)
    {
        super(errorMessage, err);
    }

}