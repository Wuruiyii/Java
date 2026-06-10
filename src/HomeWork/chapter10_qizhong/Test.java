package HomeWork.chapter10_qizhong;

import java.util.Scanner;
import  java.util.Arrays;
public class Test
{
    public static void main(String[] args)
    {
        String a = new String("helloword");
        System.out.println(a);
        System.out.println(a.length());
        boolean b = false;
        Scanner sc = new Scanner(System.in);
//
//        String s = switch (new_s)
//        {
//            case "hello" -> "YES";
//            case "world" ->"NO";
//            default -> "NONE";
//        };
//        System.out.println(s);
//        print();
        int[] arr = new int[10];
        for(int i = 0;i < 10;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < 10; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void print()
    {
        System.out.println(123);
    }
}
