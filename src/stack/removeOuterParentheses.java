package stack;


import java.util.Stack;

/**
 * 1021. 删除最外层的括号
 * 单调栈
 * 遇到(就压栈，遇到)就pop，如果栈空则说明完整，可以删首尾了
 */
public class removeOuterParentheses {

    public String removeOuterParentheses(String S) {
        StringBuffer res = new StringBuffer();
        int len =  S.length();
        Stack<Character> stack = new Stack<>();
        int start = 0, end = 0;
        for(int i = 0; i < len; i++) {
            start = end;
            if(S.charAt(i) == '('){
                stack.push(S.charAt(i));
            }else if (S.charAt(i) == ')') {
                if (!stack.empty()) {
                    stack.pop();
                }
                if (stack.empty()){ //如果栈空了的话，就说明它是一个完整单位，就删除两侧的括号
                    end = i;
                    for(int j = start+1; j < end; j++){
                        res.append(S.charAt(j));
                    }
                    end++;
                }
            }
        }

        return res.toString();
    }
}
