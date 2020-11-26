package NOte;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 4:48 下午
 */


/**
 * static 不能修饰外部类
 * 成员内部类:
 * Outer outer=new Outer();
 * Inner inner=outer.new Inner();
 * 两者等价
 * Outer.Inner inner=new.Outer().new.Inner();
 *  访问内部类成员，采取 Inner inner=new Outer().new INNer();访问注：当主方法在外部类时可以
 *  省略外部类名
 *  内部类方法中想访问外部成员 采用 Outer.this.成员  访问内部成员 this.成员 注 一般重名情况下
 *        A a = new A() { };匿名内部类写法
 *        static修饰的内部类不再依附于外部类的实例
 *        相当于独立的类
 */
public class Note1125 {
}
