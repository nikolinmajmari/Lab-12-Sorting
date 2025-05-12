import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int left, int right) {
      if (left < right) {
          int pivot = partition(arr, left, right);
          quickSort(arr, left, pivot - 1);
          quickSort(arr, pivot + 1, right);
      }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left;
        int low = left+1;
        int high = right;
        while (low < high){

            while (low < right && arr[low] <= arr[pivotIndex]){
                /// increment low until you find a node greater than the pivot
                low++;
            }
            /// you need to have high>left condition as you need for
            /// high to stop at the end of left sequence
            while(high > left && arr[high] >= arr[pivotIndex]){
                /// decrement high until you find a element less then pivot
                high--;
            }

            if (low < high){
                /// if low < high then high and low should point to nodes that need to
                /// be swapped
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        /// you are sure that high as stopped at the end of left sequence,
        /// so sewap end of sequence with pivot index, this is the real pivot index
        /// position
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;
        return high;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
               0,5,4,2,1,4,7
        };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
