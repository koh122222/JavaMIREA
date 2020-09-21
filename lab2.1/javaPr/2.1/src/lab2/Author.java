package lab2;

public class Author
{
    private String name;
    private String email;
    private char gender;

    public Author(String in_name,
                  String in_email, char in_gender)
    {
        name = in_name;
        email = in_email;
        gender = in_gender;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String in_email)
    {
        email = in_email;
    }
    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        return "name: " + name + ", Email: " + email +
                " gender: " + gender;
    }
}
