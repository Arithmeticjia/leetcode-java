package array;

import java.util.ArrayList;
import java.util.List;

public class stringMatching {

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.print(new stringMatching().stringMatching(words));
    }

    public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        if(words.length == 0){
            return res;
        }
        StringBuilder builder = new StringBuilder();
        for (String str : words) {
            builder.append(str).append(",");
        }

        for (String str : words) {
            //每个单词
            //
            if (builder.toString().indexOf(str) != builder.toString().lastIndexOf(str)) {
                res.add(str);
            }
        }

       return res;
    }
}
