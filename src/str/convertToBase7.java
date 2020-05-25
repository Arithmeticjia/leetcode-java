package str;

/**
 * 10进制转7进制
 */
public class convertToBase7 {

    public static void main(String[] args) {
        System.out.println(convertToBase7.convertToBase7(0));
    }

    public static String convertToBase7(int num){
        String ans = "";

        if(num < 0){
            num = -num;
            ans += "-";
        }else if (num == 0){
            ans = "0";
        }

        StringBuilder sb = new StringBuilder();
        while (num > 0){
            int mod = num % 7;
            sb.append((char)(mod + 48));
            num = num / 7;
        }
        ans += sb.reverse().toString();
        return ans;
    }
}
