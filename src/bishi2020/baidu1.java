package bishi2020;

import java.util.Scanner;

public class baidu1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n;i++){
            nums[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n;i++){
            if(nums[i] == 5){
                count++;
            }
        }

        if(count - (count % 9)==0){
           System.out.print(-1);
        }else {
            for(int i = 0;i < count - (count % 9);i++){
                System.out.print("5");
            }
            for(int i = 0; i < n-count;i++){
                System.out.print("0");
            }
        }

    }
}
