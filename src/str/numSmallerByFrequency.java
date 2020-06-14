package str;

import java.util.Arrays;

public class numSmallerByFrequency {

    public static void main(String[] args) {
        String[] queries = {"bbb", "cc"};
        String[] words = {"a","aa","aaa","aaaa"};
        System.out.println(Arrays.toString(numSmallerByFrequency.numSmallerByFrequency(queries, words)));
    }

    public static int[] numSmallerByFrequency(String[] queries, String[] words){
        int[] res = new int[queries.length];
        int[] target = new int[words.length];
        for(int i = 0;i < target.length;i++){
            target[i] = f(words[i]);
        }

        Arrays.sort(target);
        for(int i = 0; i < res.length;i++){
            int queryCount = f(queries[i]);
            int queryRes = 0;
            for(int j = 0; j < target.length;j++){
                if(target[j] > queryCount){
                    queryRes = target.length - j;
                    break;
                }
            }
            res[i] = queryRes;
        }

        return res;

    }

    public static int f(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int res = 1;
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] != arr[i+1]){
                break;
            }
            res++;
        }
        System.out.println(res);
        return res;
    }
}
