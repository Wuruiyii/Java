package HomeWork.chapter12;

import java.util.regex.*;

public class ExtractUrl
{
    public static void main(String[] args)
    {
        // 题目中的文本内容
        String content = "<div class=\"nav\">\n" +
                "    <ul>\n" +
                "        <li><a class=\"fff\" href=\"/\">全景视觉</a></li>\n" +
                "        <li><a href=\"https://www.focusstock.com/\" target=\"_blank\">焦点创意</a></li>\n" +
                "        <li><a href=\"https://music.quanjing.com/\">音乐</a></li>\n" +
                "        <li><a href=\"https://vr.quanjing.com/\">VR</a></li>\n" +
                "        <li><a href=\"http://vs.quanjing.com/\">整合营销</a></li>\n" +
                "        <li style=\"display:none\"><a href=\"/tag\">素材类别</a></li>\n" +
                "    </ul>\n" +
                "</div>";

        // 修正后的正则表达式，匹配href属性中的所有URL
        Pattern p = Pattern.compile("href=\"([^\"]+)\"");
        Matcher m = p.matcher(content);

        while (m.find())
        {
            System.out.println(m.group(1));
        }
    }
}