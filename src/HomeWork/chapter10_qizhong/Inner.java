package HomeWork.chapter10_qizhong;
class Outer
{
    int m = 0;
    class Inner
    {
        int n= 0;
        void dispaly()
        {
            Inner n = new Inner();
            System.out.println("haha");
        }
    }
}
public class Inner
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
    }
}
