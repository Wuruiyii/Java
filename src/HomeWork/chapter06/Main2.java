package HomeWork.chapter06;
class Connection
{
    //懒惰型的单例
    //private static Connection instance = new Connection(); 积极型的单例，区别在于创建时机的不同
   private  static Connection instance;
   private Connection(){};
   //synchronized 同步关键字，保证多线程下的线性安全
    public static synchronized Connection getInstance()
    {
        if (instance == null)
        {
            instance = new Connection();
        }
        return instance;
    }

    public void visit(String url)
    {
        System.out.println("Visiting: " + url);
    }

}
public class Main2
{
    public static void main(String[] args)
    {
        Connection c1 = Connection.getInstance();
        Connection c2 = Connection.getInstance();

        c1.visit("https://google.com");
        c2.visit("https://openai.com");

        System.out.println(c1 == c2);
    }
}
