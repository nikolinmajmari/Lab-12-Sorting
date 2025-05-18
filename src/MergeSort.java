import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr) {
        mergeSort(arr,new int[arr.length], 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        /// todo your code here
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, end, mid);
            System.out.println(Arrays.toString(arr));
        }

    }

    private static void merge(int[] arr, int[] tmp, int start, int end, int mid) {
       /// todo your code here
        int i = start;
        int j = mid + 1;
        int k = start;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                tmp[k] = arr[i];
                k++;
                i++;
            } else {
                tmp[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i <= mid) {
            tmp[k] = arr[i];
            k++;
            i++;
        }
        while(j <= end) {
            tmp[k] = arr[j];
            k++;
            j++;
        }
        for(int index = start; index <= end; index++) {
            arr[index] = tmp[index];
        }
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
