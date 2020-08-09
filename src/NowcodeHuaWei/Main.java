package NowcodeHuaWei;

import java.util.*;
public class Main{
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(getResult(input));
    }

    public static int getResult(String input){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(0<c &&c<127){
                map.put(c, map.getOrDefault(c,0)+1);
            }
        }
        return map.size();
    }
}