package HomeWork.chapter03;

import java.util.Scanner;

public class onclass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个1-12的月份数字：");
        int month = sc.nextInt();
        String season = switch (month)
        {
            case 1, 2, 12 -> "冬季";
            case 3, 4, 5 -> "春季";
            case 6, 7, 8 -> "夏季";
            case 9, 10, 11 -> "秋季";
            default -> "当前月份为无效月份!";
        };
        System.out.println(season);
        if("当前月份为无效月份!".equals(season))
        {
            System.out.println("请输入一个1-12的月份数字");
        }
        else
        {
            System.out.println("当前月份为：" + season);
        }
        sc.close();
    }
}
