package NowcodeHuaWei;

public class youzan1 {
    public static void main(String[] args) {
        System.out.print(new youzan1().sum(3,5));
    }

    public long sum (int num, int itemNum) {
        // write code here
        long sum = 0;
        if(itemNum == 1){
            return num;
        }
        int temp = 0;
        for(int i = 1; i <= itemNum;i++){
            temp = 10 * temp + num;
            sum += temp;
        }

        return sum;
    }
}
