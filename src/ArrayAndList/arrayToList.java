package ArrayAndList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToList {

    public static void main(String[] args){
        Integer[] array = {1,2,3,4};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);
    }
}
