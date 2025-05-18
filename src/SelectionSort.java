import java.util.Arrays;

public class SelectionSort {
    
    public static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));

        for (int i = 0 ; i < arr.length-1 ; i++) {
           for (int j = i + 1 ; j < arr.length ; j++) {

               if (arr[i] > arr[j]) {

                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;

               }

           }        System.out.println(Arrays.toString(arr));

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,5,2,6,4,4,7,8,3,5,2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
