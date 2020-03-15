package com.company;

import java.util.ArrayList;

public class LeftRotateString {

    public String LeftRotateString(String str,int n){
        if(str.length() < n || str.length() == 0){
            return "";
        }
        char[] arr = str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            list.add(arr[i]);
        }
        while(n > 0){
            char s = list.remove(0);
            list.add(s);
            n--;
        }
        StringBuffer strbuf = new StringBuffer();
        for(int i=0;i<list.size();i++){
            strbuf.append(list.get(i));
        }
        return strbuf.toString();
    }
}
