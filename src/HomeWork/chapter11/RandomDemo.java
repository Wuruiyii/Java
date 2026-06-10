package HomeWork.chapter11;

import java.util.Random;

public class RandomDemo
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        Random random = new Random();
        System.out.println("生成10个[0,100]的整数：");
        for (int i = 0; i < 10; i++)
        {
            int num = random.nextInt(101);
            System.out.print(num + " ");
        }

        long end = System.currentTimeMillis();
        System.out.println("\n耗时：" + (end - start) + " 毫秒");
    }
}
