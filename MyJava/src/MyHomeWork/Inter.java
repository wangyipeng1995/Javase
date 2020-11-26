package MyHomeWork;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 4:22 下午
 */ interface Inter {
    void show();
}
class Outer
{

        public   static Inter method(){
            return
            new Inter() {
                @Override
                public void show() {
                    System.out.println("HelloWorld");
                }
            };

        }
        public static void main(String[] args) {
            Outer.method().show();
        }
    }
