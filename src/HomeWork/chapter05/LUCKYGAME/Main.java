package HomeWork.chapter05.LUCKYGAME;

import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            LuckyGameFrame frame = new LuckyGameFrame();
            frame.setVisible(true);
        });
    }
}
