package bishi2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class tengxun2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.print(new tengxun2().lastSubstring(str));
    }

    public String lastSubstring(String input) {
        if(input == null){
            return input;
        }
        int length = input.length();
        if(length < 2){
            return input;
        }
        char[] result = new char[length];
        int count  = 0;
        LinkedList<Integer> queue  = new LinkedList<>();
        ArrayList<Integer>  list  = new ArrayList<>();
        char ch = 0;
        for(int i = 0,same = 0; i < length; i++){
            char tempCh = input.charAt(i);
            if(tempCh == ch){
                same++;
            }else{
                ch = tempCh;
                if(same > 2){
                    queue.add(i - (same + 1)/2);
                }
                queue.add(i);
                same = 0;
            }
        }

        int pos = 0;
        while(!queue.isEmpty()){
            int step = queue.size();
            if(step == 1){
                pos = queue.pollFirst();
                for(;pos < length; pos++,count++){
                    result[count] = input.charAt(pos);
                }
                break;
            }
            ch = 0;
            for(int i = 0; i < step; i++){
                pos = queue.pollFirst();
                if(pos >= length){
                    continue;
                }
                char tempCh = input.charAt(pos);
                if(tempCh > ch){
                    ch = tempCh;
                    list.clear();
                    list.add(pos + 1);
                }else if(tempCh == ch){
                    list.add(pos + 1);
                }
            }
            result[count] = ch;
            count++;
            queue.addAll(list);
            System.out.print(queue);
        }


        return new String(result,0,count);
    }
}


