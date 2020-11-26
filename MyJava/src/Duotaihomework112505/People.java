package Duotaihomework112505;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 2:24 下午
 */
public class People implements Vehicle,Ticket,GoHome{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(String name) {
        this.name=name;
    }

    @Override
    public void ticket() {
        System.out.print("买票");
    }

    @Override
    public void bus() {
        System.out.print("坐大巴");
    }

    @Override
    public void train() {
        System.out.println("坐火车");
    }

    @Override
    public void aircraft() {
        System.out.println("坐飞机");
    }

    @Override
    public void goHome() {
        System.out.println("回家");
    }

    public static void main(String[] args) {
        People p=new People("小王");
        System.out.print(p.getName());
        p.ticket();
        p.bus();
        p.goHome();
        p=new People("小明");
        System.out.print(p.getName());
        p.ticket();
        p.train();
        p.goHome();



    }
}
