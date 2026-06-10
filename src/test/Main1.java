package test;

import java.util.ArrayList;
import java.util.List;

abstract  class Fruit
{
    private String type;
    private double price;

    Fruit(String t,double p)
    {
        this.type = t;
        this.price = p;
    }
    public String getType()
    {
        return type;
    }

    public double getPrice()
    {
        return price;
    }
}
class Apple extends Fruit
{
    Apple()
    {
        super("Apple", 2.0);
    }
}
class Pear extends Fruit
{
    Pear()
    {
        super("Pear", 1.5);
    }
}
class Orange extends Fruit
{
    Orange()
    {
        super("Orange", 1.0);
    }
}
class Box<T extends  Fruit>
{
    List<T> list = new ArrayList<>();

    void addFruit(T fruit)
    {
        list.add(fruit);
    }
    double Total()
    {
        double sum = 0;
        for(T f:list)
        {
            sum += f.getPrice();
        }
        return sum;
    }

}
public class Main1
{
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println(appleBox.Total());
    }
}
