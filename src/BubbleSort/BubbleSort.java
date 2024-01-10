package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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

        bubbleSort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arrA) {
        if (arrA == null || arrA.length == 0)
            return;

        System.out.println("Original Array: " + Arrays.toString(arrA));
        int size = arrA.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                // check the adjacent elements
                if (arrA[j] > arrA[j + 1]) {
                    // swap the elements
                    int temp = arrA[j];
                    arrA[j] = arrA[j + 1];
                    arrA[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arrA));
    }
}
