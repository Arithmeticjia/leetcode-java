package strings;

public class validPalindrome {

    public static boolean validPalindrome(String s) {
        int length = s.length();
        for(int i = 0; i < length;){
            if(s.charAt(i) == s.charAt(length-i-1)){
                i++;
            }else{
                return isPalindrome(s.substring(i,length-i-1)) || isPalindrome(s.substring(i+1, length-i));
            }
        }

        return true;
    }

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            if(s.charAt(start++) == s.charAt(end)){
                end--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome.isPalindrome(s));
        System.out.println(validPalindrome.validPalindrome(s));
    }
}
