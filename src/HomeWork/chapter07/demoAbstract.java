package HomeWork.chapter07;
abstract class Animal
{
    abstract void shout();
    abstract void eat();

}
class Cat extends Animal{
    void shout()
    {
        System.out.println("Meow");
    }
    void eat()
    {
        System.out.println("Yes!");
    }

}
public class demoAbstract
{
    public static void main(String[] args)
    {
        Cat c = new Cat();
        c.shout();
        c.eat();

    }
}
