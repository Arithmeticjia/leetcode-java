package offer;

/**
 * 696 计数二进制子串
 * 00110011 -> {2,2,2,2}，相邻两个取较小值
 */
public class countBinarySubstrings {

    public int countBinarySubstrings(String s){
        int point = 0;
        int ans = 0;
        //相邻两个的前一个
        int last = 0;
        while(point < s.length()){
            char c = s.charAt(point);
            int count = 0;
            while (point < s.length() && s.charAt(point) == c){
                point++;
                count++;
            }
            ans += Math.min(count, last);
            last = count;
        }

        return ans;
    }

}
