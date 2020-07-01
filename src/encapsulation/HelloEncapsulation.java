package encapsulation;

import otherencapsulation.Human;

public class HelloEncapsulation {

    public static void main(String[] args) {
        Human human = new Human();
//        human.age = 13;无法访问非本类的私有属性和方法
//        human.name = "单沙嘉";name是default属性，不能被不同包的类访问
    }
}


class Boy extends Human{
    void sayHello(){
//        System.out.println(age);子类无法使用父类的私有属性和方法
        System.out.println(height);
    }

}