package stack;

import java.util.Stack;

public class backspaceCompare {

    public boolean backspaceCompare(String S, String T){
        return build(S).equals(build(T));
    }

    public String build(String s) {

        Stack<Character> ans = new Stack<>();
        for(char c: s.toCharArray()){
            if(c != '#'){
                ans.push(c);
            }else if(!ans.empty()){
                ans.pop();
            }
        }
        return String.valueOf(ans);
    }

}
