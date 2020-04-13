package binary;

import sun.nio.cs.ArrayEncoder;

public class searchMatrix {

    public static void main(String[] args){
        int[][] m = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(m,3));
    }

    public static boolean searchMatrix(int[][] matrix, int target){

        int m = matrix.length;
        if(m == 0){
            return false;
        }
        int n = matrix[0].length;

        int left = 0;
        int right = m * n -1;
        while(left <= right){
            int mid = left + (right - left) /2;
            int numMid = matrix[mid / n][mid % n];
            if(numMid == target){
                return true;
            }else if(numMid < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }
}
