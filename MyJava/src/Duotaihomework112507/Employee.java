package Duotaihomework112507;

import java.net.IDN;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 3:09 下午
 */
public class Employee extends Role{//抽象类被非抽象类继承
    private double salary;
    private static int ID;
    public Employee(String name, String sex, int age ,double salary){
        super(name,sex,age);
        this.salary=salary;
    }
    public Employee(String name, String sex, int age ,double salary ,int ID){
        super(name,sex,age);
        this.salary=salary;
        this.ID=ID;
    }

    @Override
    public void play() {
        System.out.println("打王者么，我压缩贼6");

    }
    public final void sing(){//被final修饰的方法不能被重写
        System.out.println("这是一个sing方法");
    }
    @Override
    public String toString() {
        return "employee{" +
                "name='" + getName() + '\'' +
                ", sex='" + getSex() + '\'' +
                ", age=" + getAge() +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "salary=" + salary +
//                '}';
//    }
}
