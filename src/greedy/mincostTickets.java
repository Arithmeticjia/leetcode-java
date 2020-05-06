package greedy;

import java.util.HashSet;
import java.util.Set;

public class mincostTickets {

    int[] costs;
    Integer[] memo;
    Set<Integer> dayset;

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        dayset = new HashSet();
        for (int d: days) {
            dayset.add(d);
        }
        return dp(1);
    }
    // dp(i) 来表示从第 i 天开始到一年的结束，我们需要花的钱
    public int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        // min(i+1天花的钱+当天通行证，i+7天花的钱+当天开始一共7天的通行证(i,i+1,...,i+6),i+30天花的钱+当天开始一共30天的通行证(i,i+1,...,i+30))
        if (dayset.contains(i)) {
            memo[i] = Math.min(Math.min(dp(i + 1) + costs[0], dp(i + 7) + costs[1]), dp(i + 30) + costs[2]);
        }
        else {
            //如果这一天不是必须出行的日期，那我们可以贪心地选择不买。
            memo[i] = dp(i + 1);
        }
        return memo[i];
    }
}
