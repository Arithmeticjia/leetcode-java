package NowcodeHuaWei;

import java.util.*;

public class xiecheng22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String old = in.nextLine();
        String full = in.nextLine();
        String newStr = in.nextLine();
        f(old,full,newStr);
    }
    public static void f(String a,String b,String c){
        String ans = "";
        int i,j;
        for(i=0,j=0;j<b.length();j++){
            char cur = b.charAt(j);
            if(!(cur >= 'A' && cur <='Z' || cur >='a'&& cur <= 'z')){
                String sub = b.substring(i,j);
                if(isSame(a,sub)){
                    ans += c;
                    ans += cur;
                }else{
                    ans += sub;
                    ans += cur;
                }
                i = j + 1;
            }
        }
        String sub = b.substring(i,j);
        if(isSame(a,sub)){
            ans += c;
        } else {
            ans += sub;
        }
        System.out.println(ans);
    }
    public static boolean isSame(String a ,String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);
        for(int i=0;i<ac.length;i++){
            if(ac[i] != bc[i]){
                return false;
            }
        }
        return true;
    }
}