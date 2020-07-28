package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 剑指 Offer 48. 最长不含重复字符的子字符串
 * temp表示之前以最后一个字符结尾的最大子串长度
 * 如果temp<两个重复字符之间的距离就+1
 */
public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res=0,temp=0;
        for(int j = 0; j < s.length();j++){
            int i = map.getOrDefault(s.charAt(j),-1);
            map.put(s.charAt(j),j);
            temp = temp >= j-i ? j-i : temp + 1;
            res = Math.max(res, temp);
        }
        return res;
    }
}
