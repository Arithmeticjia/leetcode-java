package NowcodeHuaWei;

import java.util.HashMap;
import java.util.Scanner;

public class duxiaoman1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c:s1.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for(char c: s2.toCharArray()){
            if(map.containsKey(c) && map.get(c) != 0){
                count++;
                map.put(c, map.get(c) - 1);
            }
        }

        System.out.println(count);
    }
}
