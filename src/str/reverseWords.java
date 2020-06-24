package str;

/**
 * 557. 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class reverseWords {

    public String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word:words){
            res.append(new StringBuffer(word).reverse().toString() + " ");
        }

        return res.toString().trim();
    }

    public static void main(String[] args) {
        reverseWords test = new reverseWords();
        System.out.println(test.reverseWords("Let's take LeetCode contest"));
    }
}
