package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// java遍历ArrayList的三种方式
public class forarraylist {
    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list.add("我");
        list.add("是");
        list.add("最");
        list.add("帅");
        list.add("的");

        // For-Each 遍历List
        for(String i:list){
            System.out.print(i);
        }
        System.out.println('\n');

        // ArrayList -> 数组
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (String s : strArray) {
            System.out.print(s);
        }
        System.out.println('\n');

        // 使用迭代器进行相关遍历
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.print(ite.next());
        }
    }
}
