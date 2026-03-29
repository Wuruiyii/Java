package test;

public class TestDemo
{
    public static void main(String[] args)
    {
        int[] arr1 ={1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {1.5,3.7,4.9,5.8,6.6};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }

}
