//package HomeWork.chapter09;
//
//class InsufficientFundsException extends Exception
//{
//    public InsufficientFundsException(String message)
//    {
//        super(message);
//    }
//}
//
//class Account
//{
//    private double balance;
//
//    public Account(double balance)
//    {
//        this.balance = balance;
//    }
//
//    public void withdraw(double amount) throws InsufficientFundsException
//    {
//        if (amount <= 0)
//        {
//            System.out.println("取款金额必须大于0！");
//            return;
//        }
//
//        if (amount <= balance)
//        {
//            balance -= amount;
//            System.out.println("取款成功，当前余额：" + balance);
//        }
//        else
//        {
//            throw new InsufficientFundsException("取款失败：余额不足！");
//        }
//    }
//
//    public double getBalance()
//    {
//        return balance;
//    }
//}
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Account acc = new Account(1000);
//        try {
//            acc.withdraw(500);
//            acc.withdraw(600);
//        } catch (InsufficientFundsException e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("最终余额：" + acc.getBalance());
//    }
//}
