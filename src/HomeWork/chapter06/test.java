package HomeWork.chapter06;
class Student
{
    String name ="zhangsan";
    int age=18;


    Student changeinfo(Student stu,String name,int age)
    {
        stu.name = name;
        stu.age = age;
        return stu;
    }
    void display()
    {
        System.out.println(this.name+" "+this.age);
    }


}
public class test
{
    public static void main(String[] args)
    {
        Student stu1 = new Student();
        stu1.changeinfo(stu1,"lisi",20);
        stu1.display();
    }
}
