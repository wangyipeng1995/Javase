package Duotaihomework112504.Gohome;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 10:36 上午
 */
public class People implements GoHome,Ticket,Vehicle{
    private String name;

    public void show(){
        System.out.print(getName());
    }


    public People(String name) { //构造方法
       this.name=name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void home() {
        System.out.println("到家了");

    }

    @Override
    public void BuyTicket() {
        System.out.print("买了票");

    }

    @Override
    public void bus() {
        System.out.print("坐大巴车");

    }

    @Override
    public void train() {
        System.out.print("坐火车");

    }

    @Override
    public void plane() {
        System.out.print("坐飞机");

    }



    public static void main(String[] args) {
        People people1 = new People("小明");
        people1.show();
        people1.BuyTicket();
        people1.bus();
        people1.home();

        people1 = new People("小红");
        people1.show();
        people1.BuyTicket();
        people1.train();
        people1.home();

        people1 = new People("小李");
        people1.show();
        people1.BuyTicket();
        people1.plane();

        people1.home();


    }
}

