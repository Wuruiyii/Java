package HomeWork.chapter05.LUCKYGAME;

import java.util.Random;

public class LotteryMachine
{
    private Prize[] prizes;
    private Random random;
    private long totalCount;

    public LotteryMachine()
    {
        random = new Random();
        totalCount = 0;

        prizes = new Prize[]
        {
                new Prize("一等奖", 1, 1),
                new Prize("二等奖", 2, 4),
                new Prize("三等奖", 5, 10),
                new Prize("四等奖", 11, 20),
                new Prize("五等奖", 21, 35),
                new Prize("幸运奖", 36, 60),
                new Prize("谢谢惠顾", 61, 100)
        };
    }

    public Prize[] getPrizes() {
        return prizes;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void reset()
    {
        totalCount = 0;
        for (Prize prize : prizes)
        {
            prize.resetCount();
        }
    }

    public int getPrizeIndex(int number)
    {
        for (int i = 0; i < prizes.length; i++)
        {
            if (prizes[i].matches(number))
            {
                return i;
            }
        }
        return -1;
    }

    public void simulate(long times)
    {
        reset();
        for (long i = 0; i < times; i++)
        {
            int number = random.nextInt(100) + 1;
            int index = getPrizeIndex(number);
            if (index != -1)
            {
                prizes[index].addCount();
                totalCount++;
            }
        }
    }
}