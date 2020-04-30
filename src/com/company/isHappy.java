package com.company;

public class isHappy {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        isHappy xx = new isHappy();
        xx.isHappy(19);

    }
    public boolean isHappy(int n) {

        String s = String.valueOf(n);
        while (true) {
            int sum = 0;
            for(int i = 0;i < s.length(); i++){
                char ch = s.charAt(i);
                int intNum = ch - '0';
                System.out.println(intNum);
                sum += intNum * intNum;
                System.out.println(sum);
            }
            s = String.valueOf(sum);
            if (Integer.parseInt(s) == 1) {
                return true;
            }
            if (Integer.parseInt(s) == 4) {
                return false;
            }
        }
    }
}
