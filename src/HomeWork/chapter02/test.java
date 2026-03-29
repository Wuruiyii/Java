package HomeWork.chapter02;
import java.util.Arrays;
import java.util.Random;

public class test
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] nums = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++)
        {   
            nums[i] = r.nextInt(100)+ 1;
//            if(nums[i] > max ) max = nums[i];
//            if(nums[i]<min)  min = nums[i];
        }

        //method 1
//        for(int i = 0;i < nums.length;i++)
//        {
//            System.out.print(nums[i]+" ");
//        }
//        System.out.println();
//        System.out.println("max:"+max);
//        System.out.println("min:"+min);

        //method 2
        Arrays.stream(nums).forEach(num -> System.out.print(num + " "));
        int max_num = Arrays.stream(nums).max().getAsInt();
        int min_num = Arrays.stream(nums).min().getAsInt();
        System.out.println();
        System.out.println("max:"+max_num);
        System.out.println("min:"+min_num);
    }
}
