package LinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HelloLinkedHashMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        map.put(1,2);
        map.put(3,4);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey());
        }

        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Map.Entry<Integer, Integer>> entryIterator = map.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer, Integer> entry = entryIterator.next();
            System.out.println(entry.getKey());
        }
    }
}
