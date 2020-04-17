package Extends;

public class Person {

    public String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void run() {
        System.out.println(name + " is running");
    }
}
