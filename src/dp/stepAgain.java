package dp;

/**
 * https://www.nowcoder.com/practice/fac4dc5774204806b7f07ac9e00fb073?tpId=110&&tqId=33474&rp=1&ru=/ta/job-code&qru=/ta/job-code/question-ranking
 * 又见台阶
 *
 * 设f[i]表示0跳到i的方法数，显然有
 *
 * 若i是积水，f[i]=0;
 * 若i为偶数，则i是由奇数跳转过来，有f[i] = sum(f[k]) (k为小于i的奇数)
 * 若n为奇数，则n是由偶数跳转过来，有f[i] = sum(f[k]) (k为小于i的偶数)
 * 由于每次计算都只涉及奇数和与偶数和，那我们完全没必要在开数组。
 * 只需从1到n扫描一遍，记录并更新当前的奇数和sum1、偶数和sum2 即可。
 */
public class stepAgain {

    int mod = (int)(1e9+7);

    public int solve (int n, int m, int[] a) {
        // write code here
        boolean[] tag = new boolean[n+1];
        for(int i = 0;i < m;i++){
            tag[a[i]] = true;
        }
        //奇数和，偶数和
        long sum1 = 0,sum2 = 1;
        for(int i = 1;i <= n;i++){
            //积水就跳过
            if(tag[i]) {
                continue;
            }
            //偶数
            if(i % 2 == 0){
                //sum1为当前的f[i]的值
                sum2 += sum1;
                sum2 %= mod;
            }else{
                //sum2为当前的f[i]的值
                sum1 += sum2;
                sum1 %= mod;
            }
        }
        //总台阶是偶数
        //是积水就是0
        if(n % 2 == 0) {
            return tag[n] ? 0: (int)sum1;
        } else {
            return tag[n] ? 0: (int)sum2;
        }
    }
}
