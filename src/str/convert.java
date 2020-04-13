package str;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BinaryOperator;

public class convert {

    public static void main(String[] args){
//        String s = "LEETCODEISHIRING";
        String s = "LEETCODEISHIRING";
        System.out.println(convert(s,4));
    }

    public static String convert(String s, int numRows) {
        int len = s.length();
        char[] ans = new char[len];
        int k = 0;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int i = 0;i < len;i++){
            if((i % (numRows+1) == 0)){
                ans[k++] = s.charAt(i);
                map.put(i,true);
            }
        }
        for(int i = 1;i < len;i++){
            if((i % (numRows-1) == 1)){
                ans[k++] = s.charAt(i);
                map.put(i,true);
            }
        }
        // LCIR ETOESIIG EDHN
        // LCIR ETOESIIG DHN 
//        for(int m = 0;m < len;m++){
//            if(!map.containsKey(m)){
//                ans[k] = s.charAt(m);
//                k++;
//            }
//        }
        StringBuffer str = new StringBuffer();
        for (char c : ans) {
            str.append(c);
        }
        return ""+str;
    }
}
