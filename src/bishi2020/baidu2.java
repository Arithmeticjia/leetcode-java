package bishi2020;

//变态跳台阶
public class baidu2 {


    public static void main(String[] args) {
        //System.out.println(jumpFloorII(10));
        //System.out.println(JumpFloorr(10));
        System.out.println(JumpFloorIIj(3));
    }

    //方法一、非递归方法
    public static  int jumpFloorII(int number) {
        if(number==0){
            return 0;
        }
        int a[] = new int[number];
        for(int i=0;i<number;i++){
            int sum = 0;
            for(int j=0;j<i;j++){
                sum += a[j];
            }
            a[i]=sum+1;
        }
        return a[number-1];
    }

    //方法二、递归方法
    public static int JumpFloorIIj(int target) {
        if(target==0||target==1) {
            return 1;
        }
        if(target==2) {
            return 2;
        }
        int sum = 0;
        for(int i=0;i<target;i++){
            sum += JumpFloorIIj(i);
        }
        return sum;
    }

    //方法三、动态规划方法自底向上
    public static int JumpFloorr(int target){
        if(target==0){
            return 0;
        }
        int a[] = new int[target+2];
        int b=3;
        a[0]=1;
        a[1]=1;
        a[2]=2;
        if(target<b&&target>0){
            return a[target];
        }
        for(int i=3;i<=target;i++){
            a[i]=2*a[i-1];
        }
        return a[target];
    }

}


