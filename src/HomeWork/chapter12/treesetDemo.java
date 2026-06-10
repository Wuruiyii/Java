//package HomeWork.chapter12;
//
//import java.util.Comparator;
//import java.util.Set;
//import java.util.TreeSet;
//
//class Student
//{
//    int sno;
//    String name;
//    int age;
//    String getName()
//    {
//        return name;
//    }
//    int getAge()
//    {
//        return age;
//    }
//    int getSno()
//    {
//        return sno;
//    }
//    Student(String name,int age,int id)
//    {
//        this.name = name;
//        this.age = age;
//        this.sno = id;
//    }
//
//}
//
//public class treesetDemo{
//
//    static Comparator<Student> ageComparator = new Comparator<Student>() {
//        @Override
//        public int compare(Student o1, Student o2) {
//            return Integer.compare(o1.getAge(), o2.getAge());  // 按年龄排序
//        }
//    };
//
//    static Comparator<Student> nameComparator = new Comparator<Student>() {
//        @Override
//        public int compare(Student o1, Student o2) {
//            return o1.getName().compareTo(o2.getName());  // 按姓名排序
//        }
//    };
//    static Comparator<Student> snoComparator = new Comparator<Student>() {
//        @Override
//        public int compare(Student o1, Student o2) {
//            // 按学号排序
//            return Integer.compare(o1.getSno(), o2.getSno());  // 按学号排序
//        }
//    };
//    public static void main(String[] args)
//    {
//        Set<Student> set = new TreeSet<>(ageComparator);
//
//        set.add(new Student("张三", 18, 1001));
//        set.add(new Student("李四", 20, 1002));
//        set.add(new Student("王五", 21, 1003));
//        set.add(new Student("赵六", 19, 1004));
//        set.add(new Student("钱七", 23, 1005));
//        set.add(new Student("孙八", 17, 1006));
//
//        for (Student student : set) { // 按年龄排序
//            System.out.println(student.getName()+" "+student.getAge()+" "+" "+student.getSno());
//        }
//    }
//}
