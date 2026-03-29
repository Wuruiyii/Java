package test;

public class demo2
{
    public static void main(String[] args)
    {
         GirlFriend gf1 = new GirlFriend();
         gf1.name = "xiaomei";
         gf1.age = 18;
         gf1.gender = "female";

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.gender);

        gf1.sleep();
        gf1.speech();
    }
}
