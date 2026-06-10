package HomeWork.chapter11;

import java.util.Enumeration;
import java.util.Properties;

public class system
{
    public static void main(String[] args)
    {
        Properties properties = System.getProperties();
        Enumeration propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements())
        {
            String key = (String)propertyNames.nextElement();
            String value = System.getProperty(key);
//            System.out.println(key+"--->"+value);
        }
        System.out.println(System.getProperty("java.vm.version"));  //Java 虚拟机版本号
        System.out.println(System.getProperty("java.vm.vendor"));   //Java 虚拟机提供商
        System.out.println(System.getProperty("os.name"));          //操作系统名称
        System.out.println(System.getProperty("user.home"));        //当前用户的主目录路径
    }
}
