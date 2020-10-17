package bishi2020;

/**
 *
 */
public class str2Int {

    public static void main(String[] args) {
        System.out.println(new str2Int().str2Int("-111111111111111"));
    }

    public int str2Int(String str) {

        int len = str.length();
        char[] chars = str.toCharArray();

        int index = 0;

        while (index < len && chars[index] == ' ') {
            index++;
        }

        if(index == len) {
            return 0;
        }

        int sign = 1;
        char first = chars[index];
        if(first == '+') {
            index++;
        }else if(first == '-') {
            index++;
            sign = -1;
        }

        int res = 0;
        while (index < len) {
            char curr = chars[index];
            if(curr > '9' || curr < '0') {
                break;
            }

            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (curr - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }

            if(res < Integer.MAX_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (curr - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MIN_VALUE;
            }

            res = res * 10 + sign * (curr - '0');
            index++;
        }
        return res;
    }
}
