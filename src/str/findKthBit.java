package str;

/**
 * 1545. 找出第 N 个二进制字符串中的第 K 位
 */
public class findKthBit {

    public char findKthBit(int n, int k){

        if(k == 0){
            return '0';
        }
        int mid = 1 << (n-1);
        if(k == mid){
            return '1';
        }else if(k < mid){
            return findKthBit(n-1,k);
        }else {
            k = mid * 2 - k;
            return invert(findKthBit(n-1,k));
        }
    }
    // 0 -> 1
    // 1 -> 0
    public char invert(char bit){
        return (char) ('0' + '1' - bit);
    }
}
