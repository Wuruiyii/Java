package HomeWork.chapter13;

class Demo
{
    private final String currentPath = this.getClass().getResource("").getPath();
    private final String currentPath2 = this.getClass().getClassLoader().getResource("").getPath();

    {
        System.out.println(currentPath);
        System.out.println(currentPath2);
    }

    public static void main(String[] args) {
        Demo df = new Demo();
    }
}
