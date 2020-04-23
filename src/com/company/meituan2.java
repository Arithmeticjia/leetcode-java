package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class meituan2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String num = sc.next();
            String[] nums = num.split("\\.");
            StringBuilder sb = new StringBuilder();
            if(nums.length == 1){
                if(nums[0].charAt(0) != '-'){
                    sb.append("$");
                    if(nums[0].length() % 3 == 1){
                        for(int i = 0;i < nums[0].length();i++){
                            sb.append(nums[0].charAt(i));
                            if(i+1 < nums[0].length() && i == nums[0].length() % 3-1 ){
                                sb.append(",");
                            }
                        }
                    }else {
                        for(int i = 0;i < nums[0].length();i++){
                            sb.append(nums[0].charAt(i));
                            if(i+1 < nums[0].length() && (i+1)%3 == 0 ){
                                sb.append(",");
                            }
                        }
                    }
                    sb.append(".00");
                    System.out.println(sb);
                }else if(nums[0].charAt(0) == '-'){
                    sb.append("(");
                    sb.append("$");
                    for(int i = 1;i < nums[0].length();i++){
                        sb.append(nums[0].charAt(i));
                        if(i+1 < nums[0].length() && (i) % 3 == 0 ){
                            sb.append(",");
                        }
                    }
                    sb.append(".00");
                    sb.append(")");
                    System.out.println(sb);
                }
            }else if(nums[0].charAt(0) != '-'){
                sb.append("$");
                for(int i = 0;i < nums[0].length();i++){
                    sb.append(nums[0].charAt(i));
                    if(i+1 < nums[0].length() && (i+1) % 3 == 0 ){
                        sb.append(",");
                    }
                }
                sb.append(".");
                if(nums[1].length() >= 3){
                    for(int i = 0;i < 2;i++){
                        sb.append(nums[1].charAt(i));
                    }
                }else if(nums[1].length() < 2){
                    sb.append(nums[1]);
                    sb.append('0');
                }else {
                    sb.append(nums[1]);
                }
                System.out.println(sb);
            }else if(nums[0].charAt(0) == '-'){
                sb.append('(');
                sb.append("$");
                for(int i = 1;i < nums[0].length();i++){
                    sb.append(nums[0].charAt(i));
                    if(i+1 < nums[0].length() && (i+1) % 3 == 0 ){
                        sb.append(",");
                    }
                }
                sb.append(".");
                if(nums[1].length() >= 3){
                    for(int i = 0;i < 2;i++){
                        sb.append(nums[1].charAt(i));
                    }
                }else if(nums[1].length() < 2){
                    sb.append(nums[1]);
                    sb.append('0');
                }else {
                    sb.append(nums[1]);
                }
                sb.append(')');
                System.out.println(sb);
            }
        }
    }
}
