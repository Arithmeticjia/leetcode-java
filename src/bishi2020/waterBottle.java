package bishi2020;

import java.util.*;

/**
 * 三个空的汽水瓶换一瓶
 */
public class waterBottle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            System.out.println(softdrink(sc.nextInt()));
        }
    }

    public static int softdrink(int bottle){
        int sum = 0;
        int yu = 0;
        if(bottle == 0){
            return 0;
        }
        while(bottle >= 3){
            yu = bottle % 3;
            sum += bottle / 3;
            bottle = bottle / 3 + yu;
        }
        if(bottle == 2){
            sum++;
        }
        return sum;
    }
}
