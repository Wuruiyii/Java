package HomeWork.chapter05.LUCKYGAME;

public class Prize
{
    private String name;
    private int min;
    private int max;
    private long count;

    public Prize(String name, int min, int max)
    {
        this.name = name;
        this.min = min;
        this.max = max;
        this.count = 0;
    }

    public boolean matches(int number) {
        return number >= min && number <= max;
    }

    public void addCount() {
        count++;
    }

    public void resetCount() {
        count = 0;
    }

    public double getProbability(long totalCount)
    {
        if (totalCount == 0)
        {
            return 0.0;
        }
        return count * 100.0 / totalCount; //实际模拟后的百分比
    }

    public String getName() {
        return name;
    }

    public long getCount() {
        return count;
    }
}