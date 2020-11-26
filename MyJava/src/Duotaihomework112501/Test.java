package Duotaihomework112501;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 10:33 上午
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Sparrow();//访问父类再访问子类无参
        bird.setLeg("小短腿");//Sparrow给它双腿赋值
        System.out.println(bird.getLeg());
        Bird bird1 = new Ostrich();//bird1为父类引用名，把子类类型提升
        Ostrich ostrich=(Ostrich) bird1;//如果想访问子类中特有的方法，需要进行强制转换'
        System.out.println(ostrich.height+"++++++++");




    }
}
