package offer;

/**
 * 剑指 Offer 67. 把字符串转换成整数
 */
public class strToInt {

    public int strToInt(String str){
        char[] chars = str.trim().toCharArray();
        if(chars.length == 0){
            return 0;
        }

        int res = 0;
        int sign = 1;
        int bndry = Integer.MAX_VALUE / 10;
        int i = 1;
        if(chars[0] == '-'){
            sign = -1;
        }else if(chars[0] != '+'){
            i = 0;
        }
        for(int j = i;j < chars.length;j++){
            if(chars[j] > '9' || chars[j] < '0'){
                break;
            }
            if(res > bndry || res == bndry && chars[j] > '7'){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = res * 10 + chars[j];
        }

        return sign * res;
    }
}
