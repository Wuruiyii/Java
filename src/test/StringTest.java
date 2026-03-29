package test;

import java.util.Scanner;

public class StringTest
{
    public static void main(String[] args)
    {
        String[] roma={"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0;i < s.length();i++)
        {
            char c = s.charAt(i);
            System.out.print(roma[c-48]+" ");
        }
    }
}
