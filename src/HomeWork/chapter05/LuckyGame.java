package HomeWork.chapter05;

import java.util.Random;

public class LuckyGame
{
    public static void CheckThePrize(int[] freq,int number)
    {
        if(number == 1)  freq[0]++;
        if(number >=2 && number <= 4) freq[1]++;
        if(number >=5 && number <= 10) freq[2]++;
        if(number >=11 && number <= 20) freq[3]++;
        if(number >=21 && number <= 35) freq[4]++;
        if(number >=36 && number <= 60) freq[5]++;
        if(number >=61 && number <= 100) freq[6]++;
    }
    public static void main(String[] args)
    {
        System.out.println("欢迎来到幸运大转盘！");
        System.out.println("" +
                "一等奖：1%\n" +
                "二等奖：3%\n" +
                "三等奖：6%\n" +
                "四等奖：10%\n" +
                "五等奖：15%\n" +
                "幸运奖：25%\n" +
                "谢谢惠顾：40%");
        Random r = new Random();
        int[] freq = new int[7];
        int times = 10000000;
        for(int i = 1;i <= times;i++)
        {
           int temp = r.nextInt(100)+1;
            CheckThePrize(freq,temp);
        }
        double[] probability = new double[7];
        for(int i = 0;i < 7;i++)
        {
            probability[i] = ((freq[i]*1.0 )/ times) * 100.0;
        }

        String[] names = {"一等奖","二等奖","三等奖","四等奖","五等奖","幸运奖","谢谢惠顾"};
        System.out.println("本次幸运大抽奖活动中，共计抽奖"+times+"次");
        for(int i = 0; i < 7; i++)
        {
            System.out.printf("%s共计%d次 概率为%.2f%%\n", names[i], freq[i], probability[i]);
        }
    }
}
