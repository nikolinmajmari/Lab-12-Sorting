import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int left, int right) {
      /// todo your code here
    }

    private static int partition(int[] arr, int left, int right) {
        /// todo your code here
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                0,0,2,1,1,1,10,10,9,9, 4, 4, 1,1,1,1,1,1,1
        };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
