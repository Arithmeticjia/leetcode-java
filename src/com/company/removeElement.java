package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class removeElement {

    public static void main(String[] args){
        removeElement test = new removeElement();
        int[] t = {3,2,2,3};
        System.out.println(test.removeElement(t,2));
    }

    public int removeElement(int[] nums,int val){
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
