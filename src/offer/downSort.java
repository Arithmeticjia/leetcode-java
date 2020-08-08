package offer;

import java.util.*;

public class downSort {
    public static void main(String[] args){
        Integer[] arr = {5,4,7,9,2,12,54,21,1};
        //降序
        // 重写compare方法，最好加注解，不加也没事
        Arrays.sort(arr, (a, b) -> {
            //返回值>0交换
            return b-a;
        });

        //Arrays.sort(arr, new compa());
        System.out.println(Arrays.toString(arr));
    }
}

class compa implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}