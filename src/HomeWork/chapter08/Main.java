package HomeWork.chapter08;

 class Outer
{
    int m = 0;
    void OuterM()
    {
        System.out.println("Outer.test()");
    }
    void accessInner()
    {
        Inner inner = new Inner();
        inner.innerM();
        System.out.println(inner.n++);
    }
    class Inner
    {
        int n = 1;
        void innerM()
        {
            System.out.println("Inner.test()");
        }
        void accessOuter()
        {
            OuterM();
            System.out.println(m++);
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.accessInner();
        Outer.Inner inner = outer.new Inner(); //调用的时候，调用outer对象的new
        inner.accessOuter();
    }
}
