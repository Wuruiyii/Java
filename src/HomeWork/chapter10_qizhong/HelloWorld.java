package HomeWork.chapter10_qizhong;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");
        Random r = new Random();
        int temp = r.nextInt(100);
        System.out.println(temp);
        Scanner sc = new Scanner(System.in);
        int temp2 = sc.nextInt();
        System.out.println(temp2);
    }
}
