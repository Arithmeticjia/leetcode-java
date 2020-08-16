package NowcodeHuaWei;

import java.util.Scanner;

public class simplePassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] strs = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: strs){
            // a = 97
            if(c >= 'a' && c <= 'z'){
                if(c == 's' || c == 'v' || c == 'z' || c == 'y'){
                    sb.append((c - 'a') / 3 + 1);
                }else {
                    sb.append((c - 'a') / 3 + 2);
                }
            }else if(c >= 'A' && c <= 'Z'){
                if(c == 'Z'){
                    sb.append('a');
                }else {
                    sb.append((char)(c + 'a' - 'A' + 1));
                }
            }
            else {
                sb.append(c);
            }
        }
        System.out.print(sb.toString());
    }
}
