import java.util.stream.IntStream;

public class Task_HeapSort {
    public static void main(String args[]) {
        int[] arr = fillArray(10, 100);
        System.out.println("Изначальный массив: ");
        printArray(arr);

        Task_HeapSort hs = new Task_HeapSort();
        hs.sort(arr);

        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    public static int[] fillArray(int size, int range) {
        int[] array = new int[size];
        IntStream.range(0, size)
                .forEach(index -> array[index] = (int) (Math.random() * 2 * range) - range);
        return array;
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int maxElement = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
        if (l < n && arr[l] > arr[maxElement])
            maxElement = l;
        if (r < n && arr[r] > arr[maxElement])
            maxElement = r;
        if (maxElement != i) {
            int swap = arr[i];
            arr[i] = arr[maxElement];
            arr[maxElement] = swap;
            heapify(arr, n, maxElement);
        }
    }

    
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
