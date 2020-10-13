package bishi2020;

import java.util.Arrays;

public class getHouses {

    public static void main(String[] args) {
        System.out.print(new getHouses().getHouses(2,new int[]{-1,4,5,2}));
    }


    public int getHouses (int t, int[] xa) {
        int ans = 0;
        int[][] location = new int[xa.length / 2][2];
        // write code here
        int j = 0;
        for(int i = 0;i < xa.length;i+=2){
            location[j++] = new int[]{xa[i],xa[i+1]};
        }

        System.out.print(Arrays.deepToString(location));

        Arrays.sort(location,(a,b)->a[0]-b[0]);

        for(int i = 1; i < location.length;i++){
            int x = location[i][0];
            int a = location[i][1];
            int y = location[i-1][0];
            int b = location[i-1][1];
            if(2 * x - a - 2 * y - b == 2 * t){
                ans += 1;
            }else if(2 * x - a - 2 * y - b > 2 * t){
                ans += 2;
            }
        }

        return ans + 2;
    }
}
