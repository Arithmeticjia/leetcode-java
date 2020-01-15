package com.company;

public class replaceElements {

    public static void main(String[] args){
        replaceElements test = new replaceElements();
        int [] a = {17,18,5,4,6,1};
        int [] res = test.replaceElements(a);
        for(int i = 0; i<a.length;i++){
            System.out.print(res[i]);
        }
    }

    public int[] replaceElements(int[] arr) {
        // int l = arr.length;
        // int[] ans = new int[l];
        // for(int i=0;i<l-1;i++){
        //     int [] t = new int[l-i-1];
        //     System.arraycopy(arr, i+1,t,0,l-i-1);
        //     Arrays.sort(t);
        //     ans[i] = (int)t[t.length-1];
        // }
        // ans[l-1] = -1;
        // return ans;
//        int[] res = new int[arr.length];
//        int max = -1;
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            res[i] = max;
//            max = Math.max(arr[i], max);
//        }
//
//        return res;
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int t = arr[i];
            arr[i] = max;
            max = Math.max(t, max);
        }

        return arr;
    }
}
