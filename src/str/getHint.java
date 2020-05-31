package str;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 299. 猜数字游戏
 * A表示位置相同，数字相同
 * B表示位置不同，数字相同
 */
public class getHint {

    public String getHint(String secret, String guess){
        int aCount = 0;
        int bCount = 0;
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < secret.length();i++){
            char temp = secret.charAt(i);
            if(temp == guess.charAt(i)){
                aCount++;
            }else {
                list.add(guess.charAt(i));
                hashMap.put(temp,hashMap.getOrDefault(temp,1)+1);
            }
        }
        for(Character c:list){
            if(hashMap.containsKey(c)){
                bCount++;
                hashMap.put(c,hashMap.get(c)-1);
                if(hashMap.get(c) == 0){
                    hashMap.remove(c);
                }
            }
        }
        return aCount+"A"+bCount+"B";
    }
}
