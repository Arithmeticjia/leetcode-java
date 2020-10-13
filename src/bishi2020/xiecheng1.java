package bishi2020;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class xiecheng1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String old = sc.nextLine();
        String full = sc.nextLine();
        String newStr = sc.nextLine();
        System.out.println(full.replaceAll(old,newStr));
        Lock lock = new ReentrantLock();
    }
}