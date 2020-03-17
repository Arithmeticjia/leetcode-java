package com.company;

public class change {
    public static void main(String[] args){
        change test = new change();
        String s = "12346";
        System.out.println(test.change(s));
    }

    public String change (String number) {
        int left = 0;
        int right = number.length()-1;
        char[] numbers = number.toCharArray();
        while(left < right){
            //从左边找到第一个偶数
            while(left<right&&numbers[left]%2!=0) {
                left++;
            }
            //从右边找到第一个偶数
            while(left<right&&numbers[right]%2!=0) {
                right--;
            }
            char temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(numbers);
    }
}
