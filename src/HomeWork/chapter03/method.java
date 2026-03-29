package HomeWork.chapter03;

public class method
{
    public static void main(String[] args)
    {
        int[] x = new int[10];
        for(int i = 0;i < x.length;i++)
        {
            x[i] = i+1;
        }
        System.out.println(print("aaa",x));
    }
    public static int print(String str,int... num)
    {
        System.out.println(str);
        int res = 0;
        for(int i:num)
        {
            res+=i;
        }
        return res;
    }
}
