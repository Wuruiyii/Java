package HomeWork.chapter06;
import java.lang.Math;
class Circle
{
    private double radius;
    private static int total = 0;
    private int id;

    public Circle(double r)
    {
        radius = r;
        total++;
        id = total;
    }
    public int getID()
    {
        return id;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public void display()
    {
        System.out.println("ID=" + id +
                ", radius=" + radius +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter());
    }
}
public class Main
{
    public static void main(String[] args)
    {
       Circle c1 = new Circle(10);
       Circle c2 = new Circle(20);
       Circle c3 = new Circle(30);
       Circle c4 = new Circle(40);
       Circle c5 = new Circle(50);
       c1.display();
       c2.display();
       c3.display();
       c4.display();
       c5.display();
    }
}