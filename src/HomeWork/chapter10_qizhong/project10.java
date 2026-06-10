// 声明当前类所在的包（对应你项目里的 HomeWork/chapter10_qizhong 文件夹）
package HomeWork.chapter10_qizhong;

// 导入需要用到的类
import java.io.BufferedReader;   // 高效读取文本文件的类
import java.io.FileReader;       // 读取文件字符流的类
import java.util.ArrayList;      // 动态数组（用来存地区编码和城市名）
import java.util.Scanner;        // 读取用户控制台输入的类

// 定义主类 project10
public class project10
{
    // 程序入口方法，main 方法
    public static void main(String[] args)
    {
        // 1. 定义 CSV 文件的绝对路径（你电脑上 codetable.csv 的完整路径）
        // 注意：Windows 路径里的 \ 要写成 \\ 转义
        String path = "D:\\7788\\Java\\Study\\Java\\src\\HomeWork\\chapter10_qizhong\\codetable.csv";

        // 2. 创建两个 ArrayList：
        // code：存地区编码（整数，比如 3701 代表山东济南）
        // city：存对应的城市名（字符串，比如 "济南市"）
        ArrayList<Integer> code = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();

        // 3. try-with-resources 写法：自动关闭 BufferedReader，不用手动写 br.close()
        try (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            // 跳过 CSV 文件的第一行表头（比如"地区编码,城市"这种标题行）
            br.readLine();

            // 定义变量 line，用来存每次读取的一行数据
            String line;

            // 循环读取 CSV 文件的每一行，直到文件末尾（line 为 null 时结束）
            while ((line = br.readLine()) != null)
            {
                // 如果这一行是空行，跳过，不处理
                if (line.trim().isEmpty()) continue;

                // 用逗号 , 分割一行数据，比如 "3701,济南市" 会变成 ["3701", "济南市"]
                String[] arr = line.split(",");

                // 把第一个元素（地区编码）转成 int 类型，去掉前后空格
                int areaCode = Integer.parseInt(arr[0].trim());
                // 把第二个元素（城市名）去掉前后空格，存为字符串
                String cityName = arr[1].trim();

                // 把地区编码和城市名分别加入对应的 ArrayList
                code.add(areaCode);
                city.add(cityName);
            }

            // 提示用户输入身份证号
            System.out.print("请输入您的身份证号：");
            // 创建 Scanner 对象，读取用户输入
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();

            // 校验身份证号长度：必须是18位
            if (id.length() != 18) {
                System.out.println("身份证号码应为18位！");
                // 长度不对，直接结束程序
                return;
            }

            // 4. 解析身份证号前4位，匹配地区信息
            // 取身份证号的第 0~4 位（substring(0,4) 含头不含尾），转成 int 类型
            int areaCode = Integer.parseInt(id.substring(0, 4));
            // 默认地区是"未知地区"，如果匹配到就会更新
            String region = "未知地区";

            // 遍历 code 列表，找和身份证前4位匹配的地区编码
            for (int i = 0; i < code.size(); i++) {
                if (code.get(i) == areaCode) {
                    // 匹配成功，取出对应的城市名
                    region = city.get(i);
                    // 找到就退出循环，不用继续找了
                    break;
                }
            }

            // 5. 解析出生日期
            // 身份证号第 6~10 位是年份，10~12 是月份，12~14 是日期
            // 拼接成 "XXXX年XX月XX日" 的格式
            String birthStr = id.substring(6, 10) + "年"
                    + id.substring(10, 12) + "月"
                    + id.substring(12, 14) + "日";

            // 6. 解析性别
            // 身份证号第17位（索引16，因为从0开始）是性别码：奇数男，偶数女
            // id.charAt(16) 取第17位字符，减去 '0' 转成数字，再判断奇偶
            String gender = (id.charAt(16) - '0') % 2 == 0 ? "女" : "男";

            // 7. 输出结果：性别 + 出生日期 + 地区
            System.out.println(gender + " " + birthStr + " " + region);

            // 捕获所有异常（比如文件找不到、读取错误、数字转换错误等）
        } catch (Exception e) {
            // 打印异常信息，方便调试
            e.printStackTrace();
        }
    }
}