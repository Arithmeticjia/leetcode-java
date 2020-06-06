package str;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1003. 检查替换后的词是否有效
 * 给定有效字符串 "abc"。
 *
 * 对于任何有效的字符串 V，我们可以将 V 分成两个部分 X 和 Y，使得 X + Y（X 与 Y 连接）等于 V。（X 或 Y 可以为空。）那么，X + "abc" + Y 也同样是有效的。
 *
 * 例如，如果 S = "abc"，则有效字符串的示例是："abc"，"aabcbc"，"abcabc"，"abcabcababcc"。无效字符串的示例是："abccba"，"ab"，"cababc"，"bac"。
 *
 *
 * 如果给定字符串 S 有效，则返回 true；否则，返回 false。
 *
 * **思路:因为有效字符串"abc"的结尾是字符'c',
 *
 * 所以,每遍历到一个字符'c'时,则先判断当前栈中包含的字符是否可以构成"ab",
 *
 * 若当前栈中靠近栈顶的前两个字符可以构成"ab"则继续,
 *
 * 若当前栈为空或者当前栈中靠近栈顶的前两个字符构不成"ab",则直接返回false;
 *
 * 在遍历完字符串S后,再判断栈是否为空,若栈为空则返回true,若栈非空则返回false;**
 */

public class isValid {
    public boolean isValid(String S) {
        // 模拟栈
        Deque<Character> stack= new LinkedList<>();
        for(int i = 0;i < S.length();i++) {
            // 返回队列的头，且不移除
            if(stack.peek() == null || S.charAt(i)!='c') {
                stack.push(S.charAt(i));
            }else {
                // 如果||左边为true，右边不再执行
                // Queue(队列)的一个方法，获取并移除此队列的头，如果此队列为空，则返回null
                if(stack.peek()==null || stack.poll()!='b') {
                    return false;
                }
                if(stack.peek()==null || stack.poll()!='a') {
                    return false;
                }
            }
        }
        return stack.peek()==null;
    }
}
