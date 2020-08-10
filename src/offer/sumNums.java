package offer;

/**
 * 剑指offer 64. 求1+2+...+n
 * 利用短路特性，递归求解
 */
public class sumNums {
    int res = 0;

    public int sumNums(int n){
        boolean x = n > 1 && sumNums(n-1) > 0;
        res += n;
        return res;
    }
}
