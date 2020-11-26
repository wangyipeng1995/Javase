package NOte;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/26 9:56 上午
 *
 * 静态内部类只能访问静态
 * 不能在方法外创建对象，方法内部类情况下
 * 内部类属于外部类成员，可以访问
 * 接口匿名子类可访问方法，给他一个具体的子类无法访问 new son(){}.method; 可行，。 inner=new son()
 * inner.method;报错哦
 */
public class Note1126 {
}
