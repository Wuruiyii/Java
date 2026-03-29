package HomeWork.chapter01;
import java.util.Random;
public class max_min_num
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] nums = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++)
        {
            nums[i] = r.nextInt(100)+1;
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        for(int i = 0;i < nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.print("max:"+max+"\n");
        System.out.print("min:"+min);
    }
}
