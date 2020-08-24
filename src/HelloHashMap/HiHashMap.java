package HelloHashMap;

import java.util.HashMap;
import java.util.Map;

public class HiHashMap {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Value1");
        map.put("2", "Value2");
        map.put("3", "Value3");

        for(String key:map.keySet()){
            System.out.print(map.get(key));
        }

        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
        }
    }
}
