//package HomeWork.chapter12;
//import java.util.TreeSet;
//
//
//class Student implements Comparable<Student>
//{
//    private String sno;
//    private String name;
//    private int age;
//
//    public Student(String sno, String name, int age)
//    {
//        this.sno = sno;
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Student o)
//    {
//        //优先比较年龄
//        if(this.age != o.age)
//        {
//            return o.age - this.age;
//        }
//        //年龄相同比较学号
//        return this.sno.compareTo(o.sno);
//    }
//
//    @Override
//    public String toString()
//    {
//        return "Student{sno='" + sno + "',name='" + name + "',age=" + age + "}";
//    }
//}
//
//public class demo1
//{
//    public static void main(String[] args)
//    {
//        TreeSet<Student> set = new TreeSet<>();
//        set.add(new Student("S003","张三",20));
//        set.add(new Student("S001","李四",19));
//        set.add(new Student("S005","王五",20));
//        set.add(new Student("S002","赵六",18));
//        set.add(new Student("S004","钱七",19));
//        for(Student s : set)
//        {
//            System.out.println(s);
//        }
//    }
//}