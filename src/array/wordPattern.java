package array;

import java.util.HashMap;

/**
 * 单词匹配
 */
public class wordPattern {

    public boolean wordPattern(String pattern, String str){
        HashMap<Character, String> map = new HashMap<>();
        String[] array = str.split(" ");
        if(pattern.length() != str.length()){
            return false;
        }
        for(int i = 0; i < pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(array[i])){
                    return false;
                }
            }else {
                if(map.containsValue(array[i])){
                    return false;
                }

                map.put(pattern.charAt(i), array[i]);
            }
        }

        return true;
    }
}
