package bishi2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class intToInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.nextLine().split("");
        Map<String,String> map = new HashMap();
        String result = "";
        for(int i = num.length - 1;i >= 0;i--){
            if(!map.containsKey(num[i])){
                result += num[i];
                map.put(num[i],num[i]);
            }
        }
        System.out.println(Integer.valueOf(result));
    }
}
