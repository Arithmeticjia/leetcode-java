package str;

import java.util.Stack;

public class calculate {
    public int calculate(String s){
        char[] nums = s.trim().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == ' '){
                i++;
                continue;
            }
            char temp = nums[i];
            // 遇到符号找下一个
            // 把下面一个数push进去
            if(temp == '*' || temp == '/' || temp == '+' || temp == '-'){
                i++;
                while(i < nums.length && nums[i] == ' '){
                    i++;
                }
            }

            // 根据符号重新赋值
            // 这一步主要是计算多位数，34，456之类的
            int num = 0;
            while(i < nums.length && Character.isDigit(nums[i])){
                num =  num * 10 + nums[i] - '0';
                i++;
            }
            // temp是当前的数或者符号
            switch (temp){
                case '-':
                    num = -num;
                    break;
                case '*':
                    num = stack.pop() * num;
                    break;
                case '/':
                    num = stack.pop() / num;
                    break;
                default:
                    break;
            }

            stack.push(num);
        }
        while(!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
