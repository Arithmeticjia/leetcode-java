package com.company;

public class isOneBitCharacter {

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length - 1){
            i += bits[i] + 1;
        }
        return i == bits.length - 1;
    }

    public static void main(String[] args){
        isOneBitCharacter test = new isOneBitCharacter();
        int[] t = {1,0,0};
        System.out.println(test.isOneBitCharacter(t));
    }
}
