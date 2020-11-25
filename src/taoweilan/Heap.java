package taoweilan;

/**
 * @File Heap.java
 * @Author Weilan Tao
 * @Date 2020-11-14
 * @Description This is the implementation for Max Heap, Java version.
 * @Since version-1.0
 * @Copyright Copyright (c) 2020
 */


public class Heap {

    public static int[] array;
    private static int len;
    private static int heapLen;

    public Heap() {
        len = 1;
        array = new int[len];
        array[0] = 0;
        heapLen = len;
    }

    public static void getHeap() {
        for (int i = 1; i < heapLen; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static int parentIndex(int index) {
        return index / 2;
    }

    public static int leftChild(int index) {
        return index * 2;
    }

    public static int rightChild(int index) {
        return index * 2 + 1;
    }

    public static void swap(int indexA, int indexB, int[] array) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    /**
     * Time complexity of insertion is O(logn)
     * Time complexity of heap creation is O (nlogn)
     *
     * @param val
     */
    public static void Insert(int val) {
        // 新数组扩容
        len = len + 1;
        heapLen++;
        array = java.util.Arrays.copyOf(array, array.length + 1);
        int newIndex = len - 1;
        array[newIndex] = val;

        if (heapLen < len) {
            int temp = len - 1;

            while (temp > heapLen - 1) {
                swap(temp, temp - 1, array);
                temp--;
            }

            newIndex = temp;
            array[newIndex] = val;

        }
        int pIndex = parentIndex(newIndex);


        while (pIndex != 0) {

            if (val > array[pIndex]) {
                swap(newIndex, pIndex, array);
                newIndex = pIndex;
                pIndex = parentIndex(newIndex);
            } else {
                break;
            }
        }
    }


    public static void pop() {
        //swap the nodes
        System.out.println("Pop...the first node of the heap contains value..." + array[1]);
        swap(1, heapLen - 1, array);

        //adjust the heap
        int temphead = 1;
        int biggerIndex = 1;
        while ((leftChild(temphead) < heapLen) || (rightChild(temphead) < heapLen - 1)) {
            // 找最大值
            if ((rightChild(temphead) < heapLen - 1)) {
                if (array[leftChild(temphead)] >= array[rightChild(temphead)]) {
                    biggerIndex = leftChild(temphead);
                } else {
                    biggerIndex = rightChild(temphead);
                    System.out.println("biggerIndex..." + biggerIndex);
                }
                if (array[biggerIndex] > array[temphead]) {
                    swap(temphead, biggerIndex, array);
                    temphead = biggerIndex;
                }
                //
            } else if ((leftChild(temphead) < heapLen) && (rightChild(temphead) > heapLen)) {
                biggerIndex = rightChild(temphead);
                if (array[biggerIndex] > array[temphead]) {
                    swap(temphead, biggerIndex, array);
                    temphead = biggerIndex;
                }
            } else {
                break;
            }
        }
        heapLen = heapLen - 1;
//        len = len - 1;
    }

    public static void peek() {
        System.out.println("Peek...the first node of the heap contains value..." + array[1]);
        System.out.print("Now printing the heap after implementing the peek() operation...");
        getHeap();
    }

    /**
     * Time complexity of O(nlogn)
     */
    public static void heapSort() {
        int l = heapLen;
        while (l > 1) {
            pop();
            l--;
        }

        //反转数组
        for (int i = 1; i < heapLen / 2; i++) {
            swap(i, heapLen - i, array);
        }
    }

}

class TestHeap {
    public static void main(String[] args) {
        Heap maxHeap = new Heap();
        Heap.Insert(10);
        Heap.Insert(20);
        Heap.Insert(15);
        Heap.Insert(30);
        Heap.Insert(40);
        Heap.getHeap();//40 30 15 10 20
//        maxHeap.peek();
//        maxHeap.heapSort();
//        maxHeap.getHeap();//40 30 20 15 10
        Heap.pop();      //30 10 20 15 40
        Heap.getHeap(); //30 10 20 15 40
//        maxHeap.Insert(61);
//        maxHeap.getHeap(); //61 10 30 15 40 20
//        maxHeap.pop();
//        maxHeap.getHeap();
//        maxHeap.Insert(66);
//        maxHeap.getHeap();
//        maxHeap.pop();
//        maxHeap.getHeap();
//        maxHeap.Insert(5);
//        maxHeap.getHeap();
//        maxHeap.heapSort();
//        maxHeap.getHeap();

    }
}
