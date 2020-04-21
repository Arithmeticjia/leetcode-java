package saima;
import java.util.*;
import java.util.Scanner;

public class juzifanzhuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            for (int i = 0;i < words.length; i++) {
                System.out.println(words[words.length - 1 - i] + " ");
            }
        }
    }
}
