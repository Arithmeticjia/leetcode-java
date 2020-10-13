package bishi2020;

import java.util.Scanner;

public class tengxun3 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
            System.out.print(new tengxun3().maxSum(sc.nextInt()));
        }

    }


    public int maxSum(int n){
        int max = 0;
        for(int i = 0; i <= n / 2; i++){
            int leave = n - i;
            if(max < getSum(i) + getSum(n-i)){
                max = getSum(i) + getSum(n-i);
            }
        }

        return max;
    }


    public int getSum(int num) {
        int result = 0;
        while(num != 0){
            result = result + num % 10;
            num = num/10;
        }

        return result;
    }
}




