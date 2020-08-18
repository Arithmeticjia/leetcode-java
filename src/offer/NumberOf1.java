package offer;

public class NumberOf1 {

    public int NumberOf1(int n) {
        int ans = 0;
        while(n != 0){
            if((n & 1) >= 1){
                ans++;
            }
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        int i = 3;
        System.out.print(i & 1);
    }
}
