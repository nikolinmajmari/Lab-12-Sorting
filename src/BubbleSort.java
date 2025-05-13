import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("Before: i=%d  array=%s\n",i,Arrays.toString(arr));
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.printf("Swap(%d,%d)  array=%s\n",j,j+1,Arrays.toString(arr));
                }
            }
            System.out.printf("After: i=%d  array=%s\n",i,Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,2,6,4, 5,6, 1,3, 8,11,4, 9, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
