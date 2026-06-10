package HomeWork.chapter11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo
{
    public static void main(String[] args)
    {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("Java/src/Homework/chapter11/config.properties"))
        {
            prop.load(fis);

            // 输出所有属性信息
            System.out.println("配置文件属性信息：");
            prop.forEach((key, value) -> System.out.println(key + " = " + value));

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}