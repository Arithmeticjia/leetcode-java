package bishi2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tengxun11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = Arrays.asList(arr);
        List<Integer> array = new ArrayList<>(list);
        array.remove(arr[m-1]);
        for(Integer i:array){
            System.out.print(i + " ");
        }
    }
}
