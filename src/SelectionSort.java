import java.util.Arrays;

public class SelectionSort {
    
    public static void sort(int[] arr) {
       for (int i = 0; i < arr.length-1; i++) {
           int min = arr[i];
           int minIndex = i;
           for (int j = i+1; j < arr.length; j++) {
               if (arr[j] < min) {
                   min = arr[j];
                   minIndex = j;
               }
           }
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
    }

    public static void main(String[] args) {
        int[] arr = { 1,5,2,6,4,4,7,8,3,5,2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
