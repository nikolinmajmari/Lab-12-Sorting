import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("----------next-----------");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11,2,6,4, 5, 1, 8, 9, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
