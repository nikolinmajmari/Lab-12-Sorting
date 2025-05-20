import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr){
        for(int i=arr.length/2-1; i>=0; i--){
            heapify(arr, arr.length,i);
        }
        for (int i = arr.length-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int len,int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            printHeapTree(arr,arr.length);
            heapify(arr, len, largest);
        }
    }

    public static void printHeapTree(int[] arr, int size) {
        System.out.println("--------------------------");
        int levels = (int) (Math.log(size) / Math.log(2)) + 1;
        int maxWidth = (int) Math.pow(2, levels) * 2;

        int index = 0;
        for (int level = 0; level < levels; level++) {
            int nodesAtLevel = (int) Math.pow(2, level);
            int spaceBetween = maxWidth / nodesAtLevel;
            int halfSpace = spaceBetween / 2;

            // Leading space
            System.out.print(" ".repeat(halfSpace));

            for (int i = 0; i < nodesAtLevel && index < size; i++) {
                System.out.printf("%2d", arr[index++]); // pad numbers to 2 digits
                // Space between nodes
                if (i < nodesAtLevel - 1) {
                    System.out.print(" ".repeat(spaceBetween - 2));
                }
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }


    public static void main(String[] args) {
        int[] arr = new int[]{
            5,6,11,10,9,12,8,7,2,1,6
        };
        printHeapTree(arr,arr.length);
        sort(arr);
        printHeapTree(arr,arr.length);
    }
}
