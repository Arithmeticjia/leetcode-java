package ArrayAndList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listToArray {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Object[] array = list.toArray();
        Integer[] arrays = list.toArray(new Integer[4]);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrays));
        System.out.println(-1 % 2);
    }
}
