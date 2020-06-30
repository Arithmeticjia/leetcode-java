package WhatObject;

public class HelloObject {

    public static void main(String[] args) {
        HelloObject helloObject = new HelloObject();
        System.out.println(helloObject.toString());
    }

    @Override
    public String toString(){
        return "重写toString()方法";
    }

}
