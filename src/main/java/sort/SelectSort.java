package sort;

/**
 * 选择最小的到前面去，相比冒泡排序而言，少了很多交换次数
 */
public class SelectSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minVal = Integer.MAX_VALUE;
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minIndex = j;
                }
            }
            if(minVal < arr[i]) {
                swap(arr, i, minIndex);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 3, 1, 98, 29};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
