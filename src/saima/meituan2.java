package saima;

import java.util.*;

public class meituan2 {

    public static int[] values;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        values = new int[m];

        for(int i = 0;i < m;i++){
            values[i] = sc.nextInt() + sc.nextInt() * 2;
        }

        System.out.print(Arrays.toString(values));

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return values[o1] - values[o2];
            }
        });

        for(int  i = 0;i < m;i++){
            queue.offer(i);
            if(queue.size() > n){
                queue.poll();
            }
        }
        int[] ans = new int[n];
        for(int i = 0; i < n;i++){
            ans[i] = queue.poll();
        }
        Arrays.sort(ans);

        StringBuffer sb = new StringBuffer();
        for(int i = 0;i < ans.length;i++){
            sb.append(ans[i] + 1);
            sb.append(" ");
        }

        System.out.print(sb.toString().trim());

    }
}
