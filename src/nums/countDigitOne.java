package nums;

/**
 *  剑指 Offer 43. 1～n整数中1出现的次数
 *  输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 *
 *  例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 *
 *  当第一位是1，如1234，那么千位出现1的次数就是234+1次，234出现1的次数继续递归f(234),1-999出现1的次数递归f(999)
 *
 *  当第一位不是1，如3234，假设高位是high=3，位数是pow=1000，最后的数last=234，那么
 *  1-999: f(999)=f(pow-1)
 *  1000-1999: 1000 + f(pow-1)
 *  2000-2999: f(pow-1)
 *  3000-3234: f(234)=f(last)
 */
public class countDigitOne {

    public int countDigitOne(int n) {
        return f(n);
    }
    private int f(int n ) {
        if (n <= 0)
            return 0;
        String s = String.valueOf(n);
        int high = s.charAt(0) - '0';
        int pow = (int) Math.pow(10, s.length()-1);
        int last = n - high*pow;
        if (high == 1) {
            return f(pow-1) + last + 1 + f(last);
        } else {
            return pow + high*f(pow-1) + f(last);
        }
    }

}
