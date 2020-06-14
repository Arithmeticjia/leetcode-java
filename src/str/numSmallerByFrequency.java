package str;

import java.util.Arrays;

/**
 * 1170. 比较字符串最小字母出现频次
 * 我们来定义一个函数 f(s)，其中传入参数 s 是一个非空字符串；该函数的功能是统计 s  中（按字典序比较）最小字母的出现频次。
 *
 * 例如，若 s = "dcce"，那么 f(s) = 2，因为最小的字母是 "c"，它出现了 2 次。
 *
 * 现在，给你两个字符串数组待查表 queries 和词汇表 words，请你返回一个整数数组 answer 作为答案，
 * 其中每个 answer[i] 是满足 f(queries[i]) < f(W) 的词的数目，W 是词汇表 words 中的词。
 *
 * 输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
 * 输出：[1,2]
 * 解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。
 *
 */
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
