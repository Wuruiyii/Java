//package HomeWork.chapter12;
//import java.util.Comparator;
//import java.util.TreeSet;
//
//class Student
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
//    public String getSno()
//    {
//        return sno;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "Student{sno='" + sno + "',name='" + name + "',age=" + age + "}";
//    }
//}
//
//
//class StudentSnoDescComparator implements Comparator<Student>
//{
//    @Override
//    public int compare(Student o1, Student o2)
//    {
//        return o2.getSno().compareTo(o1.getSno());
//    }
//}
//
//public class demo2
//{
//    public static void main(String[] args)
//    {
//        TreeSet<Student> set = new TreeSet<>(new StudentSnoDescComparator());
//
//        set.add(new Student("S003","张三",20));
//        set.add(new Student("S001","李四",19));
//        set.add(new Student("S005","王五",20));
//        set.add(new Student("S002","赵六",18));
//        set.add(new Student("S004","钱七",19));
//
//        for(Student s : set)
//        {
//            System.out.println(s);
//        }
//    }
//}
