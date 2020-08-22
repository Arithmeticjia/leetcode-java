package saima;

import java.util.Scanner;

public class meituan1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(isOk(str)){
                System.out.print("Accept");
            }else {
                System.out.print("Wrong");
            }
        }
    }

    public static boolean isOk(String str){
        if(!Character.isLetter(str.charAt(0))){
            return false;
        }
        int numCount = 0;
        int charCount = 0;
        for(int j = 0; j < str.length();j++){
            if(!Character.isLetterOrDigit(str.charAt(j))){
                return false;
            }
            if(Character.isLetter(str.charAt(j))){
                charCount++;
            }
            if(Character.isDigit(str.charAt(j))){
                numCount++;
            }
        }
        return numCount > 0 && charCount > 0;
    }
}
