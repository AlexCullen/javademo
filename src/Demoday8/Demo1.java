package Demoday8;

/**
 * @Author: cpzh
 * @Date: 2018/3/23 13:52
 * TODO:
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {2, 25, 24, 15, 3, 1};
        sort1(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort1(int[] arr, int lowIndex, int highIndex) {
        int lo = lowIndex;
        int hi = highIndex;
        if (highIndex > lowIndex) {
            int mid = arr[(lowIndex + highIndex) / 2];
            while (lo <= hi) {
                while ((lo < highIndex) && arr[lo] < mid) {
                    ++lo;
                }
                while ((hi > lowIndex) && arr[hi] > mid) {
                    --hi;
                }
                if (lo <= hi) {
                    swapArr(arr, lo, hi);
                    ++lo;
                    --hi;
                }
            }

            if (lowIndex < hi) {
                sort1(arr, lowIndex, hi);
            }

            if (highIndex > lo) {
                sort1(arr, lo, highIndex);
            }

        }
    }

    public static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
