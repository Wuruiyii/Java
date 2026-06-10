package HomeWork.chapter12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RetriveUrl {
    private final String content = ""
            + "<div class=\"nav\">\n"
            + "    <ul>\n"
            + "        <li><a class=\"fff\" href=\"/\">全景视觉</a></li>\n"
            + "        <li><a href=\"https://www.focustock.com/\" target=\"_blank\">焦点创意</a></li>\n"
            + "        <li><a href=\"https://music.quanjing.com/\">音乐</a></li>\n"
            + "        <li><a href=\"https://vr.quanjing.com/\">VR</a></li>\n"
            + "        <li><a href=\"http://vs.quanjing.com/\">整合营销</a></li>\n"
            + "        <li style=\"display:none\"><a href=\"/tag\">素材类别</a></li>\n"
            + "    </ul>\n"
            + "</div>";

    public static void main(String[] args) {
        RetriveUrl instance = new RetriveUrl();
        instance.printUrls();
    }

    void printUrls() {
        Pattern p = Pattern.compile("(http://|https://){1}([\\w.]+)");
        Matcher m = p.matcher(content);
        while (m.find()) {
            System.out.println(m.group(2));
        }
    }
}