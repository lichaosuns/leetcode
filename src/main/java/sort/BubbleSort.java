package sort;

/**
 * 两两交换，适合交换次数少的有序数组
 */
public class BubbleSort {

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] <= arr[j]) {
                    swap(arr, j + 1, j);
                    swap = true;
                }
            }
            //优化
            if(!swap) {
                System.out.println("----" + i);
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 1, 8, 9};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        sort(arr);
    }
}
