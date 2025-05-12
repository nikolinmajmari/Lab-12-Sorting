import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr) {
        mergeSort(arr,new int[arr.length], 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        /// todo your code here
    }

    private static void merge(int[] arr, int[] tmp, int start, int end, int mid) {
       /// todo your code here
    }


    public static void main(String[] args) {
        int [] arr = new int[]{
           3, 4, 21, 16, 11, 3, 0, 12, 8
        };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
