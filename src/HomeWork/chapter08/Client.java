package HomeWork.chapter08;
//+ public 权限
//# protected 权限
//- private权限
//下划线表示静态
abstract class DellComputer
{
    protected String model;
    protected String cpu;
    protected String disk;
    protected String os;
    public String getDesc()
    {
        return "型号：" + model +
                "\nCPU：" + cpu +
                "\n硬盘：" + disk +
                "\n操作系统：" + os;
    }
    abstract void assemble();
}
class Vostro extends DellComputer
{
    @Override
     void assemble()
    {
        this.model = "Vostro 成就系列";
        this.cpu = "Intel i3 处理器";
        this.disk = "512GB SSD";
        this.os = "Windows 11 家庭版";
    }
}
class Optplex extends DellComputer
{
    @Override
    void assemble()
    {
        this.model = "OptPlex 商用系列";
        this.cpu = "Intel i5 处理器";
        this.disk = "1TB HDD + 256GB SSD";
        this.os = "Windows 10 专业版";
    }
}
class XPS extends  DellComputer
{
    void assemble()
    {
        this.model = "XPS 高端系列";
        this.cpu = "Intel i7 处理器";
        this.disk = "1TB SSD";
        this.os = "Windows 11 专业版";
    }
}
class DellComputerFactory
{
    DellComputer produce(String ptype)
    {
        if(ptype.equals("v"))
        {
            Vostro v = new Vostro();
            return v;
        }
        if(ptype.equals("o"))
        {
            Optplex o = new Optplex();
            return o;
        }
        if(ptype.equals("x"))
        {
           XPS x = new XPS();
           return x;
        }
       return null;
    }
}

public class Client
{
}
