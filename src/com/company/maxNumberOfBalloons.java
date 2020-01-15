package com.company;

import java.util.Arrays;
import java.util.Collections;

public class maxNumberOfBalloons {

    public static void main(String[] args){
        maxNumberOfBalloons test = new maxNumberOfBalloons();
        System.out.println(test.maxNumberOfBalloons("balloonballoon"));
    }

    public int maxNumberOfBalloons(String text) {
        int b,a,l,o,n;
        b = a = l = o = n = 0;
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == 'b') b++;
            if(c == 'a') a++;
            if(c == 'l') l++;
            if(c == 'o') o++;
            if(c == 'n') n++;
        }
        // l = l / 2;
        // o = o / 2;
        Integer[] t = {b,a,l/2,o/2,n};

        return (int) Collections.min(Arrays.asList(t));
    }
}
