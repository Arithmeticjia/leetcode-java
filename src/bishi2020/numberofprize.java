package bishi2020;

/**
 * 三个不同的道具换一个奖品
 * 两个不同的可以换一个道具
 */
public class numberofprize {

    public boolean check(int[] arr, int num){
        int n1 = 0;
        int n2 = 0;
        for(int i:arr){
            if(i >= num){
                n1 += i - num;
            }else {
                n2 += num - i;
            }
        }
        return n1 / 2 >= n2;
    }

    public int numberofprize (int a, int b, int c) {
        // write code here

        int l = Math.min(a, Math.min(b, c));
        int r = Math.max(a, Math.max(b, c));

        while(true){
            if(l + 1 >= r){
                if(check(new int[]{a, b, c},r)){
                    return r;
                }
                return l;
            }
            int mid = (l + r) / 2;
            if(check(new int[]{a, b, c}, mid)){
                l = mid;
            }else {
                r = mid - 1;
            }
        }
    }
}
