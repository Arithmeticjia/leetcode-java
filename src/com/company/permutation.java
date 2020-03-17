package com.company;
import java.util.*;


public class permutation {

    public String[] permutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        Set<String> ans = new HashSet<>();
        if(s.length() == 0 && s == null){
            return null;
        }
        permutationhelper(s.toCharArray(),0,ans);

        return res.toArray(new String[0]);
    }

    public void permutationhelper(char[] c,int i,Set<String> list){
        if(i == c.length -1 && !list.contains(String.valueOf(c))){
            list.add(String.valueOf(c));
        }else{
            for(int j=i;j < c.length;j++){
                swap(c,i,j);
                permutationhelper(c,i+1,list);
                swap(c,i,j);
            }
        }
    }

    public void swap(char[] ch,int i,int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
