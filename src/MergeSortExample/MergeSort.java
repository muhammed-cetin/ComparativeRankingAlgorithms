package MergeSortExample;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.println("The unsorted array is:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int arr[]) {
        int n = arr.length;
        if (n < 2)
            return;

        int mid = n / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int arr[], int left[], int right[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}