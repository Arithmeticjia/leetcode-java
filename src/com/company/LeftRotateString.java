package com.company;

import java.util.ArrayList;

public class LeftRotateString {

    public static void main(String[] args){
        LeftRotateString test = new LeftRotateString();
        String s = "abcnnbsfsf";
        System.out.print(test.LeftRotateString(s,3));
    }

    public String LeftRotateString(String str,int n){
        if(str.length() < n || str.length() == 0){
            return "";
        }
        char[] arr = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<String> strlist = new ArrayList<>();
        for(int i=0;i < str.length();i++){
            // list.add(arr[i]);
            list.add(str.charAt(i));
        }

        for(int i=0;i < str.length();i++){
            String substr = str.substring(i,i+1);
            strlist.add(substr);
        }

        while(n > 0){
            String s = strlist.remove(0);
            strlist.add(s);
            n--;
        }

        while(n > 0){
            char s = list.remove(0);
            list.add(s);
            n--;
        }

        String res = "";

        for(int i = 0;i < strlist.size();i++){
            res += strlist.get(i);
        }

        StringBuilder strbuf = new StringBuilder();
        for(int i=0;i<list.size();i++){
            strbuf.append(list.get(i));
        }
        // return strbuf.toString();
        return res;
    }
}
