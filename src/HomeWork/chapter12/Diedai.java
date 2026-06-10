//package HomeWork.chapter12;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Scanner;
//
//class Student
//{
//    private String sno;
//    private int age;
//    private String gender;
//    Student(String n,int a,String g)
//    {
//        sno = n;
//        age = a;
//        gender = g;
//    }
//
//
//    public String getSno()
//    {
//        return sno;
//    }
//
//    public int getAge()
//    {
//        return age;
//    }
//
//    public String getGender()
//    {
//        return gender;
//    }
//}
//
//public class Diedai
//{
//    public static void main(String[] args) {
//        ArrayList<Student> stus = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        stus.add(new Student("100",10,"male"));
//        stus.add(new Student("101",11,"male"));
//        stus.add(new Student("102",12,"male"));
//        stus.add(new Student("103",13,"male"));
//        stus.add(new Student("104",14,"male"));
//        stus.add(new Student("105",15,"male"));
//        stus.add(new Student("106",16,"male"));
//        stus.add(new Student("107",17,"male"));
//        stus.add(new Student("108",18,"male"));
//        stus.add(new Student("109",19,"male"));
//
//        for (Student s : stus)
//        {
//            System.out.println(s.getSno() + " " + s.getAge() + " " + s.getGender());
//        }
//
//        Iterator<Student> it = stus.iterator();
//        while(it.hasNext())
//        {
//            Student s = it.next();
//            System.out.println(s.getSno() + " " + s.getAge() + " " + s.getGender());
//        }
//    }
//}
