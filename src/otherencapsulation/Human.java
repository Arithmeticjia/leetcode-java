package otherencapsulation;

public class Human{
    private int age;
    // 可以被本包访问
    String name;

    protected int height;

    void sayAge(){
        System.out.println(age);
    }
}
