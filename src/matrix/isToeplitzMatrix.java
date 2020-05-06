package matrix;


import java.util.HashMap;
import java.util.Map;

public class isToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix){
        Map<Integer,Integer> record = new HashMap<>();
        for(int r = 0; r < matrix.length;r++){
            for(int c = 0; c < matrix[0].length;c++){
                if(!record.containsKey(r-c)){
                    record.put(r-c,matrix[r][c]);
                }else if(record.get(r-c) != matrix[r][c]){
                    return false;
                }
            }
        }
        return true;
    }

}
