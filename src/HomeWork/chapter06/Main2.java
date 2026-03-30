package HomeWork.chapter06;
class Connection
{
   private  static Connection instance;
   private Connection(){};
    public static Connection getInstance()
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
