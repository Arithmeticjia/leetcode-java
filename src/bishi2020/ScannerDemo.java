package bishi2020;


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        while(scan.hasNextLine()){
            System.out.print("1");
        }
        scan.close();
    }
}

