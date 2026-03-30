package HomeWork.chapter05.LUCKYGAME;

import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->  //调用工具类，把这个任务放到 GUI 线程的任务队列中
        {
            LuckyGameFrame frame = new LuckyGameFrame();
            frame.setVisible(true);
        });
    }
}
