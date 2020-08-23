package NowcodeHuaWei;

import java.util.Scanner;

/**
 * #include <iostream>
 * #include <cstdio>
 * #include <cstring>
 * #include <algorithm>
 * using namespace std;
 * int A[5010];
 * int n;
 * int solve(int l,int r,int h)
 * {
 *     if (l>r) return 0;
 *     int loc=-1,mini=1<<30;
 *     int sum=0;
 *     for (int i=l;i<=r;i++){
 *         if (mini>A[i])
 *         {
 *             mini=A[i];
 *             loc=i;
 *         }
 *             if (A[i]>h) sum++;
 *     }
 *     //if (loc==-1) return 0;
 *     int tmp=A[loc]-h; //即使当前最小板子已经被刷过了，也要继续递归下去，因为还可能有其他板子没刷到，h代表当前已经刷到的高度。
 *     if (tmp<0) tmp=0;
 *     return min(sum,solve(l,loc-1,max(A[loc],h))+solve(loc+1,r,max(A[loc],h))+tmp);
 * }
 * int main()
 * {
 *    // cout<< (1<<30)<<endl;
 *     while (scanf("%d",&n)!=EOF)
 *     {
 *         for (int i=1;i<=n;i++) scanf("%d",&A[i]);
 *         int ans=solve(1,n,0);
 *         printf("%d\n",ans);
 *     }
 *     return 0;
 * }
 */
public class tengxun4 {

    static int[] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = new int[n];
        for(int i = 0; i< n;i++){
           A[i] = sc.nextInt();
        }
        System.out.print(new tengxun4().solve(1,n,0));
    }

    public int solve(int l,int r,int h){
        if(l > r){
            return 0;
        }

        int loc = -1;
        int mini =1 << 30;
        int sum=0;
        for (int i=l;i<=r;i++){
            if (mini>A[i])
            {
                mini=A[i];
                loc=i;
            }
            if (A[i]>h) {
                sum++;
            }
        }
        int tmp=A[loc]-h;
        if (tmp<0) {
            tmp=0;
        }
        return Math.min(sum,solve(l,loc-1,Math.max(A[loc],h))+solve(loc+1,r,Math.max(A[loc],h))+tmp);
    }
}

