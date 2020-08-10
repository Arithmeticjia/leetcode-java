package offer;

/**
 * 剑指offer 14-I. 剪绳子
 * 绳子等长而且长度为3，但是不一定能正好剪完，有可能有余数，假设绳子长3a+b
 * 0: 3^a
 * 1: 3^(a-1)*(2*2)
 * 2: 3^a * 2
 */
public class cuttingRope {

    public int cuttingRope(int n){
        if(n <= 3){
            return n-1;
        }
        int a = n / 3;
        int b = n % 3;
        if(b == 0){
            return (int)Math.pow(3, a);
        }
        if(b == 1){
            return (int)Math.pow(3, a-1) * 4;
        }
        return (int)Math.pow(3, a) * 2;
    }

}
