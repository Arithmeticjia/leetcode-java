package bishi2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class factor {

    List<List<Integer>> res;

    public List<List<Integer>> getFactors(int n) {
        res = new ArrayList<>();
        backtrack(new LinkedList<>(), n, 1, n);
        return res;
    }

    private void backtrack(LinkedList<Integer> list, int target, int now, int n) {
        if (target == now) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 2; i < target; i++) {
            if (n % i == 0 && (list.isEmpty() || list.peekLast() >= i)) {
                list.addLast(i);
                backtrack(list, target, i * now, n / i);
                list.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new factor().getFactors(12));
    }
}
