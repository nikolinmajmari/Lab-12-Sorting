import java.util.Arrays;

public class HeapSort {

    public static void sort(int[] arr){
        printHeapTree(arr,arr.length);
        for(int i=arr.length/2-1;i>= 0;i--){
            heapify(arr,arr.length,i);
            System.out.printf("heapify(arr,arr.length,%d)",i);
            printHeapTree(arr,arr.length);
        }
        for(int i=arr.length-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
            printHeapTree(arr,i);
        }
    }

    private static void heapify(int[] arr, int len,int i) {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<len && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<len && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,len,largest);
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
        sort(arr);
        printHeapTree(arr,arr.length);
    }
}
