package offer;

import java.util.Arrays;
import java.util.Comparator;


/**
 * 剑指 Offer 45. 把数组排成最小的数
 */
public class minNumber {

    public static void main(String[] args) {
        System.out.println(new minNumber().minNumber(new int[]{1, 2, 3, 4}));
    }

    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for(int i = 0;i < nums.length;i++){
            strings[i] = String.valueOf(nums[i]);
        }

        //Arrays.sort(strings, new comp());
        // 对谁排序？
        Arrays.sort(strings, (m, n) -> {
            String s1 = m+n;
            String s2 = n+m;
            // 返回值大于0交换
            // x.compareTo(y) x>y 返回1，x<y返回-1，x=y返回0
            return s1.compareTo(s2);
        });

        // 和上面一种方法等价
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String s1 = o1 + o2;
//                String s2 = o2 + o2;
//
//                return s1.compareTo(s2);
//            }
//        });

        StringBuilder sb =  new StringBuilder();
        for(String s: strings){
            sb.append(s);
        }

        return sb.toString();
    }

}

class comp implements Comparator<String> {
    @Override
    public int compare(String m, String n){
        String s1 = m+n;
        String s2 = n+m;
        // 如果m+n > n+m，说明m和n需要调换位置
        // 返回值大于0交换
        return s1.compareTo(s2);
    }
}