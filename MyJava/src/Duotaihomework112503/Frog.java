package Duotaihomework112503;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/25 11:13 上午
 */
public class Frog {
    private String name = "小绿";
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Frog(double height, double weight){
        this.height=height;
        this.weight=weight;
    }
    public void getMother(){
        System.out.println("我会找妈妈");
    }

    @Override
    public String toString() {
        return "Frog{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
