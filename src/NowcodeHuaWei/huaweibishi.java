package NowcodeHuaWei;

import java.util.ArrayList;
import java.util.Arrays;

public class huaweibishi {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new huaweibishi().findNotBlocked(new int[]{4, 5, 3, 2, 8, 7, 1})));

        System.out.println(Arrays.toString(new huaweibishi().findNotBlocked(new int[]{4, 5, 5, 3, 2, 8, 7})));

        System.out.println(Arrays.toString(new huaweibishi().findNotBlocked(new int[]{1, 1, 1})));

        System.out.println(Arrays.toString(new huaweibishi().findNotBlocked(new int[]{4})));
    }

    public int[] findNotBlocked(int[] speed) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = speed.length-1;i >= 0;i--) {

            if(arrayList.isEmpty()){
                arrayList.add(i);
            }else {
                if(speed[i] <= speed[arrayList.get(arrayList.size()-1)]){
                    arrayList.add(i);
                }
            }
        }

        int[] res = new int[arrayList.size()];

        for(int i = 0; i < res.length;i++) {
            res[i] = arrayList.get(arrayList.size()-1-i);
        }

        return res;

    }
}
