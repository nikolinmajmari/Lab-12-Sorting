import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int left, int right) {
      if(left < right) {
          int pivot = partition(arr, left, right);
          quickSort(arr, left, pivot - 1);
          quickSort(arr, pivot + 1, right);
      }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIndex = left;
        int low = left + 1;
        int high = right;
        while(low < high) {
            while(low < right && arr[low] <= arr[pivotIndex]) {
                low++;
            }
            while(high > left && arr[high] >= arr[pivotIndex]) {
                high-- ;
            }
            if(low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;
        return high;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                3,6,7,1,11,2,0,-1,4
        };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
