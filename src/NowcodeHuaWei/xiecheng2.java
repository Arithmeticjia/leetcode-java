package NowcodeHuaWei;

import java.util.*;

public class xiecheng2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String old = sc.nextLine();
        String full = sc.nextLine();
        String newStr = sc.nextLine();

        List<String> list = new xiecheng2().Permutation(old);

//        for (String s : list) {
//            full = full.replace(s, newStr);
//        }
        f(list,full,newStr);
    }

    public static void f(List<String> a,String b,String c){
        String ans = "";
        int i,j;
        for(i=0,j=0;j<b.length();j++){
            char cur = b.charAt(j);
            if(!(cur >= 'A' && cur <='Z' || cur >='a'&& cur <= 'z')){
                String sub = b.substring(i,j);
                if(a.contains(sub)){
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
        if(a.contains(sub)){
            ans += c;
        } else {
            ans += sub;
        }
        System.out.println(ans);
    }


    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str!=null && str.length()> 0){
            PermutationHelper(str.toCharArray(),0,res);
            Collections.sort(res);
        }
        return res;
    }

    public void PermutationHelper(char[] str,int i,ArrayList<String> list){
        if(i == str.length -1 && !list.contains(String.valueOf(str))){
            list.add(String.valueOf(str));
        }else{
            for (int j = i; j < str.length; j++) {
                swap(str, i, j);
                PermutationHelper(str, i+1, list);
                swap(str, i, j);
            }
        }
    }
    public void swap(char[] c,int i,int j){
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

}





