package str;

/**
 * 917. 仅仅反转字母
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 */
public class reverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for(int i = 0; i < S.length();i++){
            if(Character.isLetter(S.charAt(i))){
                while(!Character.isLetter(S.charAt(j))){
                    j--;
                }
                ans.append(S.charAt(j));
            }else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }
}
