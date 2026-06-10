package HomeWork.chapter10_qizhong;

import java.io.BufferedReader; //高效按行读取文件
import java.io.FileReader;  //基础文件读取

public class IDCardParserFile
{
    //传入文件路径和身份证前四位，返回对应的省市
    public static String getProvinceCityFromCSV(String csvFile, String codePrefix)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                String[] parts = line.split(",");
                if (parts.length >= 2)
                {
                    String code = parts[0].trim();
                    String name = parts[1].trim();
                    if (code.startsWith(codePrefix)) //匹配身份证前四位编码
                    {
                        return name;
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "未知省市";
    }


    public static void parseID(String csvFile, String id)
    {
        if (id.length() != 18)
        {
            System.out.println("身份证号长度不正确");
            return;
        }

        // 省市编码前四位
        String provinceCityCode = id.substring(0, 4);
        String provinceCity = getProvinceCityFromCSV(csvFile, provinceCityCode);

        // 出生日期
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        // 性别
        int seqCode = Integer.parseInt(id.substring(16, 17));
        String gender = (seqCode % 2 == 0) ? "女" : "男";

        // 输出
        System.out.println("省市：" + provinceCity);
        System.out.println("出生日期：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别：" + gender);
    }

    public static void main(String[] args)
    {
        String csvFile = "D:\\7788\\Java\\Study\\Java\\src\\HomeWork\\chapter10_qizhong\\codetable.csv";
        String testID = "420626198406118406";

        parseID(csvFile, testID);
    }
}