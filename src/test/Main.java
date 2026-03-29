package test;

import java.util.Scanner;
import java.util.Random;
public class Main
{
     public static void main(String[] args)
     {
          int[] arr = creatNumber();
          System.out.println("============================================");
          for (int i = 0; i < arr.length; i++)
          {
               System.out.print(arr[i]+" ");
          }
          System.out.println("\n============================================");
          int[] userinput = UserInputNumber();

          int redcnt  = 0;
          int bluecnt  = 0;
          for (int i = 0; i < userinput.length-1; i++)
          {
               int red = userinput[i];
               for(int j = 0 ;j < arr.length-1;j++)
               {
                    if(red == arr[j])
                    {
                         redcnt++;
                         break;
                    }
               }

          }
          if(arr[6] == userinput[6]) bluecnt++;

          Achieve(redcnt,bluecnt);

     }
     public static int[] UserInputNumber() //用户输入自己买的号码
     {
          int[] arr = new int[7];
          Scanner sc =  new Scanner(System.in);
          for (int i = 0; i < 6; )
          {
               System.out.println("请输入第"+(i+1)+"个红球号码");
               int redNUmber = sc.nextInt();
               if(redNUmber >= 1 && redNUmber <= 33)
               {
                    if(!contains(arr,redNUmber))
                    {
                         arr[i] = redNUmber;
                         i++;
                    }
                    else
                    {
                         System.out.println("出现重复号码！");
                    }
               }
               else
               {
                    System.out.println("红球号码超出范围!");
               }
          }
          System.out.println("请输入蓝球号码:");
          while(true)
          {
               int blueNumber = sc.nextInt();
               if(blueNumber >= 1 && blueNumber <=16)
               {
                    arr[6] = blueNumber;
                    break;
               }
               else
               {
                    System.out.println("当前号码超出范围");
               }
          }
          return arr;
     }
     public static int[] creatNumber() //创建中奖号码
     {
          int[] arr = new int[7];
          Random r = new Random();
          for (int i = 0;i < 6;)
          {
               int rednumber = r.nextInt(33) +1; //本来生成的是0-32，+1范围调整为1-33
               if(!contains(arr,rednumber))
               {
                    arr[i] = rednumber;
                    i++;
               }
          }

          int bluenumber = r.nextInt(16)+1;
          arr[6] = bluenumber;

          return arr;
     }
     public static boolean contains(int[] arr,int x) //判断号码是否在相应的数组里面
     {
          for(int i = 0;i <arr.length;i++)
          {
               if(arr[i] == x) return true;
          }
          return false;
     }
     public static void Achieve(int red,int blue) //判断中奖情况
     {
          if(red == 6 && blue == 1)
               System.out.println("一等奖");
          else if(red == 6 && blue == 0)
               System.out.println("二等奖");
          else if(red == 5 && blue == 1)
               System.out.println("三等奖");
          else if((red == 5 && blue == 0) || (red == 4 && blue == 1))
               System.out.println("四等奖");
          else if((red == 4 && blue == 0) || (red == 3 && blue == 1))
               System.out.println("五等奖");
          else if((red == 2 && blue == 1) || (red == 1 && blue == 1) || (red == 0 && blue == 1))
               System.out.println("六等奖");
          else System.out.println("谢谢参与");
     }


}