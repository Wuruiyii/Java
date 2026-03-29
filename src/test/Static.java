package test;

public class Static
{
    public static void main(String[] args)
    {
        Student.teacherName = "wuwu";
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("zhangsan");
        s1.setGender("男");
        //s1.teacherName = "wuwu";

        Student s2 = new Student();
        s2.setAge(20);
        s2.setName("lisi");
        s2.setGender("男");

        s1.show();
        s2.show();

    }
}

class Student
{
    private String name;
    private String gender;
    private int age;
    public static String teacherName;

    public Student()
    {

    }

    public Student(String name,String gender,int age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show()
    {
        System.out.println(name+" "+age+" "+gender+" "+teacherName);
    }
}
