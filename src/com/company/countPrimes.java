package com.company;

public class countPrimes {

    public static void main(String[] args){
        countPrimes test = new countPrimes();
        System.out.println(test.countPrimes(10));
    }

    public int countPrimes(int n){

        // n个数，都是1
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = 1;
        }

        // 对于
        for(int i = 2;i < n; i++){
            if(nums[i] == 1){
                for(int j = 2; i * j < n;j++){
                    nums[i*j] = 0;
                }
            }
        }
        int ans = 0;
        for(int i = 2; i < n;i++){
            if(nums[i] == 1)
                ans++;
        }
        return ans;

    }
}
