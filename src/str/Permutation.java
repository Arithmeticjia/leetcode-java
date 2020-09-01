package str;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 字符串全排列
 */
public class Permutation {

    public static void main(String[] args) {
        String str = "abc";
        System.out.print(Arrays.toString(new Permutation().Permutation(str)));
    }

    public String[] Permutation(String str) {
        Set<String> ans = new HashSet<>();
        if(str == null || str.length() == 0){
            return null;
        }
        permutationHelper(str.toCharArray(), 0 ,ans);

        return ans.toArray(new String[0]);
    }

    private void permutationHelper(char[] c, int i, Set<String> list) {
        if(i == c.length -1 && !list.contains(String.valueOf(c))){
            list.add(String.valueOf(c));
        }else{
            for(int j=i;j < c.length;j++){
                swap(c,i,j);
                permutationHelper(c,i+1,list);
                swap(c,i,j);
            }
        }
    }

    private void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
}
