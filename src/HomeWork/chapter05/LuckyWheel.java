package HomeWork.chapter05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * 幸运大转盘游戏 - Java Swing实现
 * 功能：转盘旋转动画、随机中奖、结果弹窗、重置功能
 */
public class LuckyWheel extends JFrame {
    // 奖品区域（6个奖项，颜色区分）
    private final String[] prizes = {"一等奖", "二等奖", "三等奖", "四等奖", "五等奖", "谢谢参与"};
    private final Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.CYAN};

    // 转盘参数
    private int rotateAngle = 0; // 旋转角度
    private Random random = new Random();

    // 界面组件
    private WheelPanel wheelPanel; // 转盘面板
    private JButton startBtn;      // 开始按钮
    private JButton resetBtn;      // 重置按钮

    public LuckyWheel() {
        // 窗口基础设置
        setTitle("🎉 幸运大转盘 🎉");
        setSize(600, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 窗口居中
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.WHITE);

        // 初始化转盘面板
        wheelPanel = new WheelPanel();
        add(wheelPanel, BorderLayout.CENTER);

        // 按钮面板
        JPanel btnPanel = new JPanel();
        startBtn = new JButton("开始抽奖");
        resetBtn = new JButton("重置转盘");
        startBtn.setFont(new Font("微软雅黑", Font.BOLD, 20));
        resetBtn.setFont(new Font("微软雅黑", Font.BOLD, 20));
        startBtn.setPreferredSize(new Dimension(150, 50));
        resetBtn.setPreferredSize(new Dimension(150, 50));
        btnPanel.add(startBtn);
        btnPanel.add(resetBtn);
        add(btnPanel, BorderLayout.SOUTH);

        // 按钮事件
        startBtn.addActionListener(new StartListener());
        resetBtn.addActionListener(new ResetListener());
    }

    // 转盘绘制面板
    private class WheelPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            // 抗锯齿，让画面更流畅
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            int radius = 220; // 转盘半径

            // 绘制转盘背景
            g2d.setColor(Color.BLACK);
            g2d.fillOval(centerX - radius - 5, centerY - radius - 5, radius * 2 + 10, radius * 2 + 10);

            // 旋转画布（核心：实现转盘旋转）
            g2d.rotate(Math.toRadians(rotateAngle), centerX, centerY);

            // 绘制6个奖品扇形区域
            int startAngle = 0;
            int arcAngle = 60; // 每个区域60度
            for (int i = 0; i < 6; i++) {
                g2d.setColor(colors[i]);
                g2d.fillArc(centerX - radius, centerY - radius, radius * 2, radius * 2, startAngle, arcAngle);
                startAngle += arcAngle;
            }

            // 绘制奖品文字
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("微软雅黑", Font.BOLD, 22));
            startAngle = 30; // 文字居中角度
            for (int i = 0; i < 6; i++) {
                double rad = Math.toRadians(startAngle);
                int x = (int) (centerX + (radius - 40) * Math.cos(rad));
                int y = (int) (centerY + (radius - 40) * Math.sin(rad));
                g2d.drawString(prizes[i], x - 40, y + 5);
                startAngle += 60;
            }

            // 绘制转盘中心圆点
            g2d.setColor(Color.BLACK);
            g2d.fillOval(centerX - 20, centerY - 20, 40, 40);
        }
    }

    // 开始抽奖事件
    private class StartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            startBtn.setEnabled(false);
            resetBtn.setEnabled(false);

            // 随机生成旋转总角度（3~10圈 + 随机偏移）
            int totalRotate = 1080 + random.nextInt(2160) + random.nextInt(360);
            final int[] current = {0};

            // 旋转动画定时器
            Timer rotateTimer = new Timer(10, e1 -> {
                current[0] += 15;
                rotateAngle += 15;
                wheelPanel.repaint();

                // 旋转完成
                if (current[0] >= totalRotate) {
                    ((Timer) e1.getSource()).stop();
                    startBtn.setEnabled(true);
                    resetBtn.setEnabled(true);
                    // 计算中奖结果
                    int prizeIndex = (360 - rotateAngle % 360) / 60;
                    JOptionPane.showMessageDialog(null,
                            "🎊 恭喜你！\n中奖结果：" + prizes[prizeIndex],
                            "抽奖结果",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            });
            rotateTimer.start();
        }
    }

    // 重置转盘事件
    private class ResetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            rotateAngle = 0;
            wheelPanel.repaint();
        }
    }

    // 主方法：启动程序
    public static void main(String[] args) {
        // Swing组件必须在事件调度线程中运行
        SwingUtilities.invokeLater(() -> {
            new LuckyWheel().setVisible(true);
        });
    }
}