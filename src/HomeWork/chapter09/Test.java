package HomeWork.chapter09;

//2024406002 武芮伊
class MoneyException extends Exception
{
    public MoneyException(String message)
    {
        super(message);
    }
}
//2024406002 武芮伊
class Account
{
    private double balance = 0.0;

    Account(double balance)
    {
        this.balance = balance;
    }

    void withdraw(double money) throws MoneyException
    {
        if(money <= 0)
        {
           throw new MoneyException("取款失败！取款金额必须大于0！");
        }
        if(balance >= money)
        {
            balance -= money;
            System.out.println("取款成功，账户余额："+ balance+"元");
        }
        else
        {
            throw new MoneyException("取款失败，余额不足！");
        }
    }

    double getBalance()
    {
        return balance;
    }

}
//2024406002 武芮伊
public class Test
{
    public static void main(String[] args)
    {
        Account account = new Account(10000);
        try
        {
            account.withdraw(500);
            account.withdraw(100000);
        }
        catch (MoneyException m)
        {
            System.out.println(m.getMessage());
        }
        finally
        {
            System.out.println("最终账户金额为："+account.getBalance()+"元");
        }
    }
}
