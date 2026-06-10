package HomeWork.chapter09;

public class Demo
{
    public static void main(String[] args) {
        try {
            System.out.println("1. 进入try");
            int a = 10 / 0; // 这里会抛出 ArithmeticException
            System.out.println("2. 这句永远不会执行");
        } catch (NullPointerException e) { // 只抓空指针，不抓算术异常
            System.out.println("3. 匹配到空指针异常");
        } finally {
            System.out.println("4. 我是finally，不管怎样我都会执行");
        }
        System.out.println("5. 这句也不会执行");
    }
}