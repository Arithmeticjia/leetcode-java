package proxy;

/**
 * 具体接口实现
 */
public class Student implements Person {
    private String name;
    // 构造函数
    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费50元");
    }
}
