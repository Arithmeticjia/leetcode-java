package com.company;

public class Fibonacci {
    public  static void main(String[] args){
        Fibonacci test = new Fibonacci();
        long startTime=System.currentTimeMillis();
        System.out.println(test.Fibonacci(44));
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime - startTime)+"ms");
        System.out.println(test.Fibonacci_2(44));
        long NewendTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(NewendTime - endTime)+"ms");
    }

    public int Fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int first = 1;
        int second = 1;
        int num = 0;
        for(int i = 3; i <= n; i++){
            num = first + second;
            first = second;
            second = num;
        }
        return num;
    }

    public int Fibonacci_2(int n){

        if (n == 1 || n == 2){
            return 1;
        }
        return Fibonacci_2(n-1) + Fibonacci_2(n - 2);
    }
}
