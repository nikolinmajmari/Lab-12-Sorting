import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));

       for (int i = 0; i < arr.length - 1; i++) {
           for (int j = i + 1; j > 0; j--) {
               if (arr[j] < arr[j-1]) {
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
               }else{
                   break;
               }

           }
           System.out.println(Arrays.toString(arr));
       }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 1,2, 8, 3,9,1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
