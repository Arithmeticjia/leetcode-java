package WhatSuper;

public class HiSuper {

    public static void main(String[] args) {
        System.out.println("开始创建一个NewChildClass对象");
        new NewChildClass();
    }
}

class NewFatherClass{
    public NewFatherClass(){
        super();
        System.out.println("创建NewFatherClass");
    }
}

class NewChildClass extends NewFatherClass {
    public NewChildClass(){
        super();
        System.out.println("创建NewChildClass");
    }
}