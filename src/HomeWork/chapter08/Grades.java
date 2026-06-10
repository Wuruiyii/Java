package HomeWork.chapter08;

import java.util.Random;

public class Grades
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] grades = new int[10];
        int max_g = Integer.MIN_VALUE;
        int min_g = Integer.MAX_VALUE;
        double sum = 0;
        for(int i = 0; i < 10; i++)
        {
            grades[i] = r.nextInt(101);
            if(grades[i] > max_g) max_g = grades[i];
            if(grades[i] < min_g) min_g = grades[i];
            sum += grades[i];
        }

        System.out.print("10人的成绩为：");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        int[] rank = new int[5]; //0:优秀 1：良好 2：中等 3：及格 4：不及格
        String[] rank_s = new String[]{"优秀","良好","中等","及格","不及格"};
        for(int i = 0; i < 10; i++)
        {
            if(grades[i] >= 90)
            {
                rank[0]++;
            }
            else if(grades[i] >= 80)
            {
                rank[1]++;
            }
            else if(grades[i] >= 70)
            {
                rank[2]++;
            }
            else if(grades[i] >= 60)
            {
                rank[3]++;
            }
            else
            {
               rank[4]++;
            }
        }

        for(int i=0;i < 5;i++)
        {
            System.out.println(rank_s[i]+":"+rank[i]);
        }

        double aver_g = sum / 10;

        System.out.println("最高分：" + max_g);
        System.out.println("最低分：" + min_g);
        System.out.printf("平均分：%.2f\n", aver_g);
    }
}
//最终运行成果
//10人的成绩为：12 38 78 17 0 45 4 3 100 98
//优秀:2
//良好:0
//中等:1
//及格:0
//不及格:7
//最高分：100
//最低分：0
//平均分：39.50