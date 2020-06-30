package WhatSuper;

public class HelloSuper {

    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass{
    public int value;
    public void f(){
        value = 100;
        System.out.println("FatherClass.value=" + value);
    }
}

class ChildClass extends FatherClass {
     public int value;
     @Override
     public void f(){
         super.f();
         value = 200;
         System.out.println("ChildClass.value=" + value);
         System.out.println(value);
         System.out.println(super.value);
     }
}