import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int left, int right) {
       if (left < right) {
           int pivot = partition(arr,left,right);
           quickSort(arr,left,pivot-1);
           quickSort(arr,pivot+1,right);
       }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[left];
        arr[left] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{
                0,0,2,1,1,1,10,10,9,9, 4, 4, 1,1,1,1,1,1,1
        };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
