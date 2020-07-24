package offer;

/**
 * 1025. 除数博弈
 *
 * 递归
 */
public class divisorGame {

    public boolean divisorGame(int N) {
        boolean[] f = new boolean[N+5];

        f[1] = false;
        f[2] = true;
        for(int i = 3;i <= N;i++){
            for(int j = 1;j < i;j++){
                if((i % j) == 0 && !f[i-1]){
                    f[i] = true;
                    break;
                }
            }
        }

        return f[N];
    }
}
