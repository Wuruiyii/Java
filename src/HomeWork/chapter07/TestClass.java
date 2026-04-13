package HomeWork.chapter07;

interface Shape
{
    double area();
    double perimeter();
    String getShapeType();
}

class Circle implements Shape
{
    private double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double area()
    {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * 3.14 * radius;
    }

    @Override
    public String getShapeType()
    {
        return "Type: circle";
    }
}

class Rectangle implements  Shape
{
  private  double width;
  private  double height;

  Rectangle(double width,double height)
  {
      this.width = width;
      this.height = height;
  }
    @Override
    public double area()
    {
        return width * height;
    }

    @Override
    public double perimeter()
    {
        return 2 * (width + height);
    }

    @Override
    public String getShapeType()
    {
        return "Type: rectangle";
    }
}

public class TestClass
{
    public static void playinfo(Shape s)
    {
        System.out.println(s.getShapeType());
        System.out.printf("周长： %.6f\n",s.perimeter());
        System.out.printf("面积： %.6f\n",s.area());
        System.out.print("------------------------------\n");

    }
    public static void main(String[] args)
    {
         Circle c1 = new Circle(5.5);
         playinfo(c1);

        Circle c2 = new Circle(4.5);
        playinfo(c2);

        Circle c3 = new Circle(3.5);
        playinfo(c3);

        Rectangle r1 = new Rectangle(2.2,5.8);
        playinfo(r1);

        Rectangle r2 = new Rectangle(5.2,8.8);
        playinfo(r2);

        Rectangle r3 = new Rectangle(2.7,3.8);
        playinfo(r3);

    }
}
