package neibuneihomework;

import org.w3c.dom.ls.LSOutput;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 4:19 下午
 */

// static class Outer{
//        public static void main(String[] args){
//
//        }
//        private class Inner{
//            Inner() {}
//        }
//    }
//3。
//class Outer {
//    String s1 = "Java";
//    String s2 = "2";
//
//    public static void main(String[] args) {
//        Outer outer = new Outer();
//    }
//    Outer() {
//        Inner inner = new Inner();
//        System.out.println("kkkkkk");
//    }
//    class Inner {
//        String s1 = "Certification";
//        String s2 = "Exam";
//
//        Inner() {
//            System.out.println(Outer.this.s1);
//            System.out.println(s1);
//            System.out.println(s2);
//        }
//    }
//}
//    5
//class OuterInnerStatic {
//    static String s1 = "Java";
//    static String s2 = "2";
//    public static void main(String[] args) {
//        Inner inner = new Inner();
//    }
//
//    static class Inner {
//        String s1 = "Certification";
//        String s2 = "Exam";
//        Inner() {
//            System.out.println(OuterInnerStatic.s1);
//            System.out.println(this.s1);
//            System.out.println(s2);
//        }
//    }
//}
//6
//class ABC
//{
//    int i =100;
//    public static void main(String[] args) {
////       ABC.XYZ  xyz = new ABC().new XYZ();
//       ABC abc=new ABC();
//       XYZ xyz=abc.new XYZ();
//        System.out.println(xyz.i);
//      xyz.method();
//
//    }
//      class XYZ
//    {
//        int i = 111;
//        public void method(){
//            System.out.println(ABC.this.i);
//            System.out.println(i);
//            System.out.println(this.i);
//        }
//
//    }
//
//
//}
//    7
//class A {
//    {
//        new B();
//    }
//
//    static class B {
//        {
//            new A().new C();
//        }
//    }
//
//    class C
//    {
//        {
//            System.out.println("SUCCESS");
//        }
//    }
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        new A();
//    }
//}
//    8
//class A
//{
//    String s = "AAA";
//
//    void methodA()
//    {
//        System.out.println(s);
//    }
//
//    static class B
//    {
//        void methodB()
//        {
//            methodA();
//        }
//    }
//}9
//abstract class A
//{
//    {
//        System.out.println(1);
//    }
//
//    static
//    {
//        System.out.println(2);
//    }
//}
////
//public class MainClass
//{
//    public static void main(String[] args)
//    {
//        A a = new A() { };
//    }
//}
//class A
//{
//    static String s = "AAA";
//
//    class B
//    {
//        String s = "BBB";
//
//        void methodB()
//        {
//            System.out.println(s);
//        }
//    }
//}
//
//public class MainClass
//{
//
//}
//class A
//{
//
//    void methodOne()
//    {
//        class B
//        {
//            void methodTwo()
//            {
//                System.out.println("Method Two");
//            }
//
//        }
//
//    }
//
//    void methodThree()
//    {
//
//    }
//}
//class A
//{
//    class B
//    {
//        {
//            System.out.println(1);
//        }
//
//        static
//        {
//            System.out.println(2);
//        }
//    }
//}
//class A
//{
//    class B extends A
//    {
//        class C extends B
//        {
//            class D extends C
//            {
//
//            }
//        }
//    }
//}
//class OuterClass
//{
//    public static void main(String[] args) {
////        OuterClass outerClass=new OuterClass();
////        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
//        InnerClass innerClass = new InnerClass();
//        System.out.println(innerClass.i);
//
//    }
//   static class InnerClass
//    {
//        int i;
//    }
//}
//class A {
//    void methodA1(int i) {
//        System.out.println(i+++i);
//    }
//
//    void methodA2(int i) {
//        System.out.println(--i-i--);
//    }
//}
//
//class B {
//    A a = new A() {
//        void methodA1(int i) {
//            System.out.println(++i+i++);
//        }
//        void methodA2(int i){
//            System.out.println(i---i);
//        }
//    };
//}
//
//public class MainClass {
//    public static void main(String[] args) {
//        A a = new A();
//        a.methodA1(10);
//        a.methodA2(10);
//        B b = new B();
//        b.a.methodA1(10);
//        b.a.methodA2(10);
//    }
//}
//class A
//{
//    abstract class B
//    {
//        abstract void method();
//    }
//
////    {
//        new B() {
//            @Override
//            void method(){
//                System.out.println("BBB");
//            }
//        }.method();
//    }
//}

//public class MainClass {
//    public static void main(String[] args) {
//        new A();
//    }
//}
//class A
//{
//    void methodA()
//    {
//        class B
//        {
//
//        }
//
//
//    }
//
//
//}
//class C{
//    public static void main(String[] args) {
//        A a = new A();
//        a.methodA();
//    }
//
//}
