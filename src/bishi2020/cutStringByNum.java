package bishi2020;

import java.util.*;

public class cutStringByNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.next();
            int num = sc.nextInt();
            char[] chars = str.toCharArray();
            int count = 0;
            int i = 0;
            for(int j = 0; j < chars.length;j++){
                if(chars[i] > 128){
                    count = count + 2;
                    if(count < num){
                        i++;
                    }
                }else {
                    count++;
                    if(count <= num){
                        i++;
                    }
                }
            }
            System.out.print(str.substring(0, i));
        }
    }

}
