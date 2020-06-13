package dfs;

public class floodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, image[0][0], newColor);
        return image;
    }


    public static void dfs(int[][] image, int sr, int sc, int val, int newColor){
        // 如果超出边界
        // 或者目标颜色和当前的颜色val不一致（不用改变）
        // 当前的颜色已经和目标颜色一致了
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != val || newColor == val){
            return;
        }else {
            image[sr][sc] = newColor;
        }
        dfs(image,sr,sc+1,val,newColor);
        dfs(image,sr,sc-1,val,newColor);
        dfs(image,sr+1,sc,val,newColor);
        dfs(image,sr-1,sc,val,newColor);
    }
}
