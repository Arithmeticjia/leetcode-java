import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class xiecheng1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String old = sc.nextLine();
        String full = sc.nextLine();
        String newStr = sc.nextLine();
        System.out.println(full.replaceAll(old,newStr));
    }
}