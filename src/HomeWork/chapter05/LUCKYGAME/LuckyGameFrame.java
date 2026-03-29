package HomeWork.chapter05.LUCKYGAME;

import javax.swing.*;
import java.awt.*;

public class LuckyGameFrame extends JFrame {
    private LotteryMachine machine;

    private JLabel titleLabel;
    private JLabel inputLabel;
    private JTextField inputField;
    private JButton simulateButton;
    private JButton resetButton;
    private JTextArea resultArea;

    public LuckyGameFrame() {
        machine = new LotteryMachine();

        initFrame();
        initComponents();
        initLayout();
        initEvents();
    }

    private void initFrame() {
        setTitle("幸运大转盘统计系统");
        setSize(700, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void initComponents() {
        titleLabel = new JLabel("幸运大转盘统计系统", SwingConstants.CENTER);
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 28));

        inputLabel = new JLabel("请输入模拟抽奖次数：");
        inputLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));

        inputField = new JTextField();
        inputField.setFont(new Font("微软雅黑", Font.PLAIN, 18));

        simulateButton = new JButton("开始统计");
        simulateButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));

        resetButton = new JButton("重置");
        resetButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));

        resultArea = new JTextArea();
        resultArea.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);

        resultArea.setText(
                "奖项概率设定如下：\n" +
                        "一等奖：1%\n" +
                        "二等奖：3%\n" +
                        "三等奖：6%\n" +
                        "四等奖：10%\n" +
                        "五等奖：15%\n" +
                        "幸运奖：25%\n" +
                        "谢谢惠顾：40%\n\n" +
                        "请输入模拟次数后，点击“开始统计”。"
        );
    }

    private void initLayout() {
        setLayout(new BorderLayout());

        add(titleLabel, BorderLayout.NORTH);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        topPanel.add(inputLabel);
        inputField.setPreferredSize(new Dimension(180, 35));
        topPanel.add(inputField);
        topPanel.add(simulateButton);
        topPanel.add(resetButton);

        add(topPanel, BorderLayout.CENTER);

        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.SOUTH);
        scrollPane.setPreferredSize(new Dimension(650, 380));
    }

    private void initEvents() {
        simulateButton.addActionListener(e -> startSimulation());

        resetButton.addActionListener(e -> {
            inputField.setText("");
            machine.reset();
            resultArea.setText(
                    "奖项概率设定如下：\n" +
                            "一等奖：1%\n" +
                            "二等奖：3%\n" +
                            "三等奖：6%\n" +
                            "四等奖：10%\n" +
                            "五等奖：15%\n" +
                            "幸运奖：25%\n" +
                            "谢谢惠顾：40%\n\n" +
                            "请输入模拟次数后，点击“开始统计”。"
            );
        });
    }

    private void startSimulation() {
        String text = inputField.getText().trim();

        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "请输入模拟次数！");
            return;
        }

        long times;
        try {
            times = Long.parseLong(text);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "请输入合法的整数！");
            return;
        }

        if (times <= 0) {
            JOptionPane.showMessageDialog(this, "模拟次数必须大于 0！");
            return;
        }

        if (times > 100000000L) {
            JOptionPane.showMessageDialog(this, "次数过大，建议不要超过 1 亿，否则运行会比较慢。");
            return;
        }

        machine.simulate(times);
        updateResult();
    }

    private void updateResult() {
        StringBuilder sb = new StringBuilder();

        sb.append("本次幸运大抽奖活动中，共计抽奖 ")
                .append(machine.getTotalCount())
                .append(" 次\n\n");

        Prize[] prizes = machine.getPrizes();

        for (Prize prize : prizes) {
            sb.append(String.format(
                    "%s：%d次，概率为 %.2f%%\n",
                    prize.getName(),
                    prize.getCount(),
                    prize.getProbability(machine.getTotalCount())
            ));
        }

        resultArea.setText(sb.toString());
    }
}