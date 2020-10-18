package lab4_pac;

public class Table implements Priceable
{
    int price;
    Table(int in_price)
    {
        price = in_price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
