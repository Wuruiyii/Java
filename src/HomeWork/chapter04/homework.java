package HomeWork.chapter04;

import java.util.Random;
import java.util.Scanner;

public class homework
{

    public static void main(String[] args)
    {
        System.out.println("Welcome to this game!");

        int number = CreateRandomNumber();
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true)
        {
            System.out.print("Guess a number between 1 and 100:");
            int num = sc.nextInt();
            if(num <= 0 || num > 100)
            {
                System.out.println("Aoo~ Out of range!");
                continue;
            }
            if(num > number)
            {
                System.out.println("TAT Sorry,it is too big.Try again!");
                cnt++;
            }
            if(num < number)
            {
                System.out.println("QAQ Sorry,it is too small.Try again!");
                cnt++;
            }
            if(num == number)
            {
                System.out.println("OAO Congratulations! You guessed it!");
                if(cnt == 1) System.out.println("You guess only one time!");
                else System.out.println("You guess "+ cnt +" times!");
                break;
            }
        }
        sc.close();
    }
    public static int CreateRandomNumber()
    {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        return number;
    }
}
