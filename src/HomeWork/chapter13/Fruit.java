package HomeWork.chapter13;

import java.util.ArrayList;
import java.util.List;


abstract class Fruit
{
    private String name;
    private double price;

    public Fruit(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }
}


class Apple extends Fruit
{
    public Apple()
    {
        super("苹果", 2.00);
    }
}


class Pear extends Fruit
{
    public Pear()
    {
        super("梨", 1.50);
    }
}


class Orange extends Fruit
{
    public Orange()
    {
        super("桔子", 1.00);
    }
}


class Box<T extends Fruit>
{
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit)
    {
        fruits.add(fruit);
    }


    public double getTotalPrice()
    {
        double sum = 0;
        for (T fruit : fruits)
        {
            sum += fruit.getPrice();
        }
        return sum;
    }


    public void showFruits()
    {
        System.out.println("盒子中的水果：");
        for (T fruit : fruits)
        {
            System.out.println(fruit.getName() + "，单价：" + fruit.getPrice() + "元");
        }
    }
}


 class Main
 {
    public static void main(String[] args)
    {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox.showFruits();
        System.out.println("苹果盒子总价：" + appleBox.getTotalPrice() + "元");

        System.out.println("--------------------");

        // 梨盒子
        Box<Pear> pearBox = new Box<>();
        pearBox.addFruit(new Pear());
        pearBox.addFruit(new Pear());
        pearBox.addFruit(new Pear());

        pearBox.showFruits();
        System.out.println("梨盒子总价：" + pearBox.getTotalPrice() + "元");

        System.out.println("--------------------");

        // 桔子盒子
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        orangeBox.showFruits();
        System.out.println("桔子盒子总价：" + orangeBox.getTotalPrice() + "元");
    }
}
