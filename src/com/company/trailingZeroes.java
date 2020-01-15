package com.company;

public class trailingZeroes {
    public static void main(String[] args){
        trailingZeroes test = new trailingZeroes();
        System.out.println(test.trailingZeroes(15));
    }

    public int trailingZeroes(int n) {
//        int num = 1;
//        int count = 0;
//        for(int i = n; i >= 1; i--){
//            num = i * num;
//        }
//        String i_num = String.valueOf(num);
//        char[] arry = i_num.toCharArray();
//        System.out.println(arry);
//        for (int j = 0; j < arry.length; j++) {
//            if( arry[j] == '0'){
//                count = count + 1;
//            };
//        }
//        System.out.println(num);
        int count = 0;
        while(n > 0){
            count += n/5;
            n = n/5;
        }
        return count;
    }

}
