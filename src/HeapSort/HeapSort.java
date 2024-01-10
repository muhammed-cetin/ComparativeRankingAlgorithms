package HeapSort;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("The unsorted array is:");
        System.out.println(Arrays.toString(arr));

        heapSort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void heapify(int[] a, int n, int i) {
        int max, child;
        child = 2 * i + 1;
        max = i;
        if (child < n && a[child] > a[max])
            max = child;
        if (child + 1 < n && a[child + 1] > a[max])
            max = child + 1;
        if (max != i) {
            int temp = a[i];
            a[i] = a[max];
            a[max] = temp;
            heapify(a, n, max);
        }
    }

    static void buildHeap(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--)
            heapify(a, a.length, i);
    }

    static void heapSort(int[] a) {
        buildHeap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
}