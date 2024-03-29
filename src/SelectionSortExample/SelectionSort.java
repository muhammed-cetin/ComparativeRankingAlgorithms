package SelectionSortExample;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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

        selectionSort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[iMin])
                    iMin = j;
            if (i != iMin) {
                int temp = arr[i];
                arr[i] = arr[iMin];
                arr[iMin] = temp;
            }
        }
    }
}
