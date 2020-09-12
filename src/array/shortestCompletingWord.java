package array;


/**
 * 748. 最短完整词
 * 如果单词列表（words）中的一个单词包含牌照（licensePlate）中所有的字母，那么我们称之为完整词。在所有完整词中，最短的单词我们称之为最短完整词。
 *
 * 单词在匹配牌照中的字母时不区分大小写，比如牌照中的 "P" 依然可以匹配单词中的 "p" 字母。
 *
 * 我们保证一定存在一个最短完整词。当有多个单词都符合最短完整词的匹配条件时取单词列表中最靠前的一个。
 *
 * 牌照中可能包含多个相同的字符，比如说：对于牌照 "PP"，单词 "pair" 无法匹配，但是 "supper" 可以匹配。
 *
 */
public class shortestCompletingWord {

    public static void main(String[] args) {

        System.out.println(new shortestCompletingWord().shortestCompletingWord("1s3 PSt",new String[]{"step", "steps", "stripe", "stepple"}));
        System.out.println(new shortestCompletingWord().shortestCompletingWord("1s3 456",new String[]{"looks","pest","stew","show"}));
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = count(licensePlate);
        String ans = "";
        for(String word : words){
            //ans.length() == 0判断第一个出现的合法答案即可
            //判断最短的答案
            if((word.length() < ans.length() || ans.length() == 0) && isValid(count(word.toLowerCase()),target)){
                ans = word;
            }
        }

        return ans;
    }

    public boolean isValid(int[] arr1, int[] arr2){
        for(int i = 0; i < 26;i++){
            if(arr1[i] < arr2[i]){
                return false;
            }
        }

        return true;
    }

    public int[] count(String word){
        int[] letter = new int[26];
        for(char c: word.toCharArray()){
            int index = Character.toLowerCase(c) - 'a';
            if(index >= 0 && index < 26){
                letter[index]++;
            }
        }

        return letter;
    }
}
