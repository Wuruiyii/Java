package HomeWork.chapter11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileUtil
{
    public static File getProjectRoot(Class<?> clazz)
    {
        // 获取项目根目录
        File projectDir = new File(System.getProperty("user.dir"));

        // 自动拼接 src 路径 → 这就是你存放文件的真实位置
        return new File(projectDir, "Java/src");
    }
}

class Main {
    static void read()
    {
        // 工具类获取src路径 + 自动拼接包路径 + 配置文件
        File pro = new File(
                FileUtil.getProjectRoot(null),
                "HomeWork/chapter11/test.properties"
        );

        System.out.println("正确读取路径：" + pro.getAbsolutePath());

        Properties props = new Properties();
        try
        {
            props.load(new FileReader(pro));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        String bgcolor = props.getProperty("Background-color");
        System.out.println("读取成功！颜色：" + bgcolor);
    }

    public static void main(String[] args)
    {
        read();
    }
}