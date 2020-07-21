package constructor;


class Animal{
    public String name;
    public int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

//    Animal(){
//
//    }

    public String getName() {
        return name;
    }

}

class Dog extends Animal{
    String color;

    Dog(String name, int age){
        super("n", age);
    }

    Dog(String name, int age, String color){
        // 不写的话默认调用父类的无参构造器
        super(name, age);
//        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("wc",10,"white");
        Dog littleDog = new Dog("a", 10);
        System.out.println(dog.getName());
        System.out.println(dog.color);
        System.out.println(littleDog.getName());
        System.out.println(littleDog.color);
    }
}
