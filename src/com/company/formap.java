package com.company;

import java.util.HashMap;
import java.util.Map;

public class formap {

    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("1", "我");
        map.put("2", "是");
        map.put("3", "最");
        map.put("4", "帅");
        map.put("5", "的");

        // 第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

        // 第二种，只遍历值
        for (String v:map.values()){
            System.out.println("value= " + v);
        }

        // 第三种：推荐，尤其是容量大时
        // entrySet是java中键-值对的集合
        // Map.Entry是Map中的一个接口，他的用途是表示一个映射项（里面有Key和Value）
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
}
