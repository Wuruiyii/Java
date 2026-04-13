//package HomeWork.chapter07;
//
////2024406002 武芮伊
// interface Shape
// {
//    double area();
//    double perimeter();
//    String getShapeType();
//}
//
////2024406002 武芮伊
// class Circle implements Shape
// {
//    private double radius;
//
//    public Circle(double radius)
//    {
//        this.radius = radius;
//    }
//
//    @Override
//    public double area()
//    {
//        return 3.14 * radius * radius;
//    }
//
//    @Override
//    public double perimeter()
//    {
//        return 2 * 3.14 * radius;
//    }
//
//    @Override
//    public String getShapeType()
//    {
//        return "Type: circle";
//    }
//
//}
//
////2024406002 武芮伊
// class Rectangle implements Shape
// {
//
//    private double width;
//    private double height;
//
//
//    public Rectangle(double width, double height)
//    {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double area()
//    {
//        return width * height;
//    }
//
//    @Override
//    public double perimeter()
//    {
//        return 2 * (width + height);
//    }
//
//    @Override
//    public String getShapeType()
//    {
//        return "Type: rectangle";
//    }
//
//}
//
//public class Test
//{
//
//    public static void printInfo(Shape s)
//    {
//        System.out.println(s.getShapeType());
//        System.out.printf("周长: %.6f\n", s.perimeter());
//        System.out.printf("面积: %.6f\n", s.area());
//        System.out.println("------------------------");
//    }
//
//    public static void main(String[] args)
//    {
//
//        Shape[] shapes = new Shape[5];
//        shapes[0] = new Circle(5.3);
//        shapes[1] = new Rectangle(4.2, 6.5);
//        shapes[2] = new Circle(3.7);
//        shapes[3] = new Rectangle(5.2, 5.8);
//        shapes[4] = new Circle(10.3);
//
//
//        for (Shape shape : shapes)
//        {
//            printInfo(shape);
//        }
//    }
//}
