package bishi2020;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class strSort {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer();

            String strLetter = "";

            for(int i = 0; i < str.length();i++){
                if(Character.isLetter(str.charAt(i))){
                    strLetter += str.charAt(i);
                }
            }

            Character[] charObjectArray =
                    strLetter.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

            Arrays.sort(charObjectArray, new Comparator<Character>(){
                @Override
                public int compare(Character c1,Character c2){
                    return Character.toLowerCase(c1) - Character.toLowerCase(c2);
                }
            });

            int j = 0;

            for(int i = 0; i < str.length();i++){
                if(Character.isLetter(str.charAt(i))){
                    sb.append(charObjectArray[j]);
                    j++;
                }else {
                    sb.append(str.charAt(i));
                }
            }

            System.out.println(sb.toString());
        }
    }
}
