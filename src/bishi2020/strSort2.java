package bishi2020;

import java.util.*;

public class strSort2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine();
            ArrayList<Character> letters = new ArrayList<>(str.length());
            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters.add(ch);
                }
            }
            // 将英文字母先排序好
            letters.sort(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1) - Character.toLowerCase(o2);
                }
            });
            // 若是非英文字母则直接添加
            StringBuilder result = new StringBuilder();
            for (int i = 0, j = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    result.append(letters.get(j++));
                }
                else {
                    result.append(str.charAt(i));
                }
            }

            System.out.print(result.toString());
        }
    }
}
