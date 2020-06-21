package nums;

public class getNoZeroIntegers {

    public int[] getNoZeroIntegers(int n){
        int[] res = new int[2];
        for(int i = 1; i < n;i++){
            if(isNoZero(i) && isNoZero(n-i)){
                return new int[] {i, n - i};
            }
        }

        return res;
    }

    private boolean isNoZero(int num){
        while(num > 0){
            if(num % 10 == 0){
                // 如果最后一位就是0，直接返回
                return false;
            }

            num /= 10;
        }

        return true;
    }
}
