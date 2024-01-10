package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    private static Scanner scanner;

    public static void main(String args[]) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("The unsorted array is:");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while (i > -1 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
}
