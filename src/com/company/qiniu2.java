package com.company;

import java.util.Scanner;
public class qiniu2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        for(int i = 0;i < time;i++){
            StringBuffer buffer = new StringBuffer(scan.next());
            int min = buffer.length();
            for(int j = 0;j < buffer.length();j++){
                for(char ch = 'A';ch <= 'Z';ch++){
                    StringBuffer temp = new StringBuffer(buffer);
                    temp = temp.insert(j, ch);
                    int count = handle(temp);
                    min = Math.min(min, count);
                }
            }
            if(buffer.length() - min == buffer.length()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
//            System.out.println(buffer.length() + 1- min);
        }
    }
    public static int handle(StringBuffer buffer){
        int count=0;
        while(true){
            StringBuffer temp = new StringBuffer();
            int i = 0,j = 2;
            for(;j < buffer.length();j++){
                if(buffer.charAt(i) != buffer.charAt(j)){
                    temp.append(buffer.charAt(i));
                }else{
                    while(j < buffer.length()&& buffer.charAt(i) == buffer.charAt(j)) {
                        j++;
                    }
                }
                i = j;
            }
            if(j == buffer.length()){
                temp.append(buffer.charAt(i));
            }
            if(buffer.length() == temp.length()){
                count = temp.length();
                break;
            }
            buffer = temp;
        }
        return count;
    }
}

