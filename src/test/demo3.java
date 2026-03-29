package test;

class Test1
{
    public Test1()
    {
        System.out.println("无参数构造方法");
    }

    public void show()
    {
        System.out.println("show!");
    }
}

public class demo3
{
    public static void main(String[] args)
    {
        Test1 test = new Test1();
        test.show();
    }

}
