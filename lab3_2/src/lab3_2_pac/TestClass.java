package lab3_2_pac;

public class TestClass {
    public static void main(String[] arg)
    {
        MovableCircle circle1 = new MovableCircle(0,
                0,3, 4,10);
        circle1.moveDown();
        Movable testMovable = circle1;
        testMovable.moveRight();
        System.out.println(testMovable.toString());
        Movable testMovable2 = new MovableCircle(100,
                100, 10, 20, 50);
        testMovable2.moveDown();
        System.out.println(testMovable2.toString());
    }
}
