package com.spartaglobal.sortingalgo;

import static com.spartaglobal.sortingalgo.BubbleSort.bubbleSort;
import static com.spartaglobal.sortingalgo.Sorting.sort;

public class SortManager {
    /**
     *
     * @param arr
     * @return String of sorted array
     */
    public static StringBuilder print(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]+" ");
        return sb;
    }

    public static void main(String[] args) {
        int [] a={93,3,2,90,4,5,12,9};
        System.out.println("First Array: "+print(a));
        bubbleSort(a);
        System.out.println("Bubble sort: "+print(a));

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array: "+print(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: "+print(arr));
    }
}
