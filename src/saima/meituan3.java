package saima;

import java.util.*;

public class meituan3 {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] values = new int[m];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < m;i++){
            values[i] = sc.nextInt() + sc.nextInt() * 2;
            map.put(values[i],i);
        }


        findKthLargest(values, 1);

        int[] ans = new int[n];
        for(int i = 0; i < n;i++){
            ans[i] = findKthLargest(values, i+1);
            ans[i] = map.get(values[n-1]);
        }

        System.out.print(Arrays.toString(values));

        System.out.print(Arrays.toString(ans));

    }

    static Random random = new Random();

    public static int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    public static int quickSelect(int[] a, int l, int r, int index) {
        int q = randomPartition(a, l, r);
        if (q == index) {
            return a[q];
        } else {
            return q < index ? quickSelect(a, q + 1, r, index) : quickSelect(a, l, q - 1, index);
        }
    }

    public static int randomPartition(int[] a, int l, int r) {
        int i = random.nextInt(r - l + 1) + l;
        swap(a, i, r);
        return partition(a, l, r);
    }

    public static int partition(int[] a, int l, int r) {
        int x = a[r], i = l - 1;
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}



