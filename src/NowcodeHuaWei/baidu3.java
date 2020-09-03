package NowcodeHuaWei;

import java.util.Scanner;

public class baidu3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.print(jump(n));

    }

    public static int jump(int target){
        if(target < 0){
            return -1;
        }else if(target == 1){
            return 1;
        }else {
            return 2*jump(target-1);
        }
    }
}


