package com.company;

import java.util.*;

public class huawei1 {

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String str = sc.nextLine();
//        Set<Character> set = new TreeSet<>();
//        for(int i = 0;i <s.length();i++){
//            set.add(s.charAt(i));
//        }
//        StringBuilder sb = new StringBuilder();
//        for (char c : set) {
//            sb.append(c);
//        }
//        System.out.print(sb);
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] name = s.split(",");
        HashMap<String,Integer> map = new HashMap<>();
        int max = 0;
        map.put(name[0],1);
        for(int i = 1;i < name.length;i++){
            if(name[i].charAt(0) < 'A' || name[i].charAt(0) > 'Z'){
                System.out.print("error.0001");
//                return;
            }
            for(int j = 1;j < name[i].length();j++){
                if(name[i].charAt(j) < 'a' || name[i].charAt(j) > 'z' || name[i].charAt(j) == ' '){
                    System.out.print("error.0001");
                }
            }
            if(!map.containsKey(name[i])){
                map.put(name[i],1);
            }else{
                map.put(name[i],map.get(name[i])+1);
            }
            if(map.get(name[max]) < map.get(name[i])){
                max = i;
            }else if(map.get(name[max]).equals(map.get(name[i]))){
//                if(name[max].charAt(0) > name[i].charAt(0)) {
//                    max = i;
//                }else if(name[max].charAt(0) == name[i].charAt(0)){
//                    if(name[max].length() > name[i].length()){
//                        max = i;
//                    }
//                }
                int k = Math.min(name[max].length(),name[i].length());
                int m;
                System.out.print(k);
                for(m = 0;m < k;m++){
                    if(name[max].charAt(m) > name[i].charAt(m)){
                        max = i;
                        break;
                    }
                }
                System.out.print(m);
                if(m == k-1){
                    max = name[max].length() > name[i].length() ? i : max;
                }
            }
        }
        System.out.print(name[max]);
    }
}
