package lab3_2_pac;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(
            int in_x, int in_y, int in_xSpeed,
            int in_ySpeed, int in_radius)
    {
        radius = in_radius;
        center = new MovablePoint(in_x, in_y, in_xSpeed, in_ySpeed);
    }

    public String toString()
    {
        return "radius: " + radius + ", " + center.toString();
    }

    public void moveUp()
    {
        center.moveUp();
    }
    public void moveDown()
    {
        center.moveDown();
    }
    public void moveLeft()
    {
        center.moveLeft();
    }
    public void moveRight()
    {
        center.moveRight();
    }
}
