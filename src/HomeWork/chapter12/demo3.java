package HomeWork.chapter12;

import java.util.HashMap;
import java.util.Map;

//学生实体
class Student
{
    private String sno;
    private String name;
    private int age;
    public Student(String sno, String name, int age)
    {
        this.sno = sno;
        this.name = name;
        this.age = age;
    }

    public String getSno() { return sno; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString()
    {
        return "Student["+sno+","+name+","+age+"]";
    }
}


class StudentRepository
{
    private Map<String,Student> map = new HashMap<>();

    public void add(Student s)
    {
        map.put(s.getSno(),s);
    }

    public void remove(String sno)
    {
        map.remove(sno);
    }

    public void update(String sno,String newName,int newAge)
    {
        Student s = map.get(sno);
        if(s!=null)
        {
            s.setName(newName);
            s.setAge(newAge);
        }
    }

    public Student get(String sno)
    {
        return map.get(sno);
    }

    public void showAll()
    {
        for(Student s:map.values())
        {
            System.out.println(s);
        }
    }
}


class StudentTester{
    public static void main(String[] args)
    {
        StudentRepository repo = new StudentRepository();
        //添加5个学生
        repo.add(new Student("S001","小明",18));
        repo.add(new Student("S002","小红",19));
        repo.add(new Student("S003","小刚",18));
        repo.add(new Student("S004","小丽",20));
        repo.add(new Student("S005","小强",19));
        System.out.println("新增后：");
        repo.showAll();

        //修改S003
        repo.update("S003","大刚",21);
        System.out.println("\n修改S003后：");
        repo.showAll();

        //删除S005
        repo.remove("S005");
        System.out.println("\n删除S005后：");
        repo.showAll();

        //查询S002
        System.out.println("\n查询S002："+repo.get("S002"));
    }
}

public class demo3
{
}
