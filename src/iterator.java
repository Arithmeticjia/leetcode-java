import java.util.*;

public class iterator {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(Iterator<String> iterator = list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }

        for(String s:list){
            System.out.println(s);
        }

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");

        for(Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator() ;iterator.hasNext();){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
