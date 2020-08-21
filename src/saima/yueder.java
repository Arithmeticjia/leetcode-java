package saima;
import java.util.Scanner;


public class yueder {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String history = in.nextLine();
        String star = in.nextLine();
        String transHis = "";
        for (int i = 0; i < history.length(); i++) {
            char c = history.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                transHis = transHis + "1";
            } else {
                transHis = transHis + "0";
            }
        }
        int same = 0;
        for (int i = 0; i < transHis.length(); i++) {
            if (star.charAt(i) == transHis.charAt(i)) {
                same++;
            }
        }
        float out = (float) same * 100 / (float) transHis.length();
        System.out.printf("%.2f%%", out);
    }
}