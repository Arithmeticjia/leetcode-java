package array;

/**
 * 744. 寻找比目标字母大的最小字母
 */
public class nextGreatestLetter {

    public static void main(String[] args) {
        System.out.println(new nextGreatestLetter().nextGreatestLetter(new char[]{'c','f','j'},'j'));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        boolean[] seen = new boolean[26];
        for (char c: letters) {
            seen[c - 'a'] = true;
        }

        while (true) {
            target++;
            if (target > 'z') {
                target = 'a';
            }
            if (seen[target - 'a']) {
                return target;
            }
        }
    }

}
