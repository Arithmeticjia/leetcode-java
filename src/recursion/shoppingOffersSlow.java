package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 638. 大礼包
 */
public class shoppingOffersSlow {

    public int shoppingOffers(List < Integer > price, List < List < Integer >> special, List < Integer > needs) {
        return shopping(price, special, needs);
    }
    //这个函数递归返回花费
    public int shopping(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int j = 0, res = dot(needs, price);
        for (List<Integer> s: special) {
            ArrayList<Integer> clone = new ArrayList<>(needs);
            for (j = 0; j < needs.size(); j++) {
                int diff = clone.get(j) - s.get(j);
                if (diff < 0) {
                    break;
                }
                clone.set(j, diff);
            }
            //s.get(j)是大礼包的价格
            if (j == needs.size()) {
                res = Math.min(res, s.get(j) + shopping(price, special, clone));
            }
        }
        return res;
    }

    //计算单买的花费（最多的）
    public int dot(List < Integer > a, List < Integer > b) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i) * b.get(i);
        }
        return sum;
    }

}
