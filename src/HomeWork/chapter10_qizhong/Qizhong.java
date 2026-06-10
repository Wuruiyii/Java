package HomeWork.chapter10_qizhong;
interface Animal
{
    void shout();
    void eat();
}
class dog implements  Animal
{
    public void shout()
    {
        System.out.println("wang");
    }
    public void eat()
    {
        System.out.println("eat");
    }
}
public class Qizhong
{
    public static void main(String[] args) {
        dog an = new dog();
        an.shout();
        an.eat();
    }
}
