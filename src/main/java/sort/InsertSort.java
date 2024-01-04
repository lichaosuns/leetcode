package sort;

/**
 * 打牌时将拿到的新牌放入到已经洗好的牌中
 */
public class InsertSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curIndex = i;
            int preIndex = i - 1;
            int val = arr[i];
            while (preIndex >= 0 && val < arr[preIndex]) {
                swap(arr, preIndex, curIndex);
                curIndex = preIndex;
                preIndex--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
