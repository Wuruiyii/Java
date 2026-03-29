package HomeWork.chapter04;

import java.util.Scanner;

public class onclass
{
    public static void main(String[] args)
    {
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);
        for(String x:names)
        {
            x = sc.next();
        }
        for(String name:names)
        {
            System.out.print(name+" ");
        }
    }
}
