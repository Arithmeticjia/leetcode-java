package NowcodeHuaWei;

/**
 * 用牛顿迭代法实现int sqrt(int x)
 */
public class shenxinfu1 {

    int x;

    public int getSqrt (int num) {
        // write code here
        x = num;
        if(num == 0){
            return 0;
        }

        return ((int) sqrt(num));
    }

    public double sqrt(double y){
        double s = (y+x/y) / 2;
        if(y == s){
            return y;
        }else {
            return sqrt(s);
        }
    }
}


