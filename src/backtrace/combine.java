package backtrace;

import java.util.LinkedList;
import java.util.List;

/**
 * 回溯法
 * 77. 组合
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */
public class combine {

    public static void main(String[] args) {
        System.out.print(new combine().combine(4,2));
    }

    int n;
    int k;
    List<List<Integer>> output = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        backtrace(1, new LinkedList<>());

        return output;
    }

    public void backtrace(int first, LinkedList<Integer> curr) {
        if(curr.size() == k){
            output.add(new LinkedList<>(curr));
        }

        for(int i = first; i < n + 1;i++){
            curr.add(i);
            backtrace(i+1, curr);
            curr.removeLast();
        }
    }
}
