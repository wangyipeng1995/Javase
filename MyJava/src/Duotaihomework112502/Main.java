package Duotaihomework112502;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 10:50 上午
 */
public class Main {
    public static void main(String[] args) {
        People p=new People();
        p.speak();
        p.think();
        Monkey m=new People();
        m.speak();//当子类方法发生重写时普通法法优先使用子类的
        ((People)m).think();
        //属性隐藏封装
        //子类继承弗雷所有非私有化成员
        //接口也是一种特殊类
        //子类和弗雷同时有非私有化的属性，那么在多态的情况下调用父类
    }
}
