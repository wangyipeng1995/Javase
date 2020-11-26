package Duotaihomework112507;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 3:29 下午
 */
public class Test {
    public static void main(String[] args) {
        Role role =new Role("wang","男",18) {
            @Override
            public void play() {

            }
        };
        System.out.println(role.getAge());
        role.setAge(22);
        System.out.println(role.getAge());
        Employee employee=new Employee("king","nv",30,200);
        System.out.println(employee);
    }

    }

