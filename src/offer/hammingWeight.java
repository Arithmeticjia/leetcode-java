package offer;

/**
 * 剑指offer 15.二进制中1的个数
 * &:都是1则为1，否则为0
 */
public class hammingWeight {

    public int hammingWeight(int n){
        int res = 0;
        while(n!=0){
            res += n & 1;
            n = n >>> 1;
        }

        return res;
    }
}
