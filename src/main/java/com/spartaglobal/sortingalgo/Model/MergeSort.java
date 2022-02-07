package com.spartaglobal.sortingalgo.Model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeSort implements Method {
    private static final Logger logger = LogManager.getLogger("MergeSort logger:");

    // Merges the left and right array
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int size1 = m - l + 1;
        int size2 = r - m;

        /* Create temp arrays */
        int[] L = new int[size1];
        int[] R = new int[size2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < size1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        //merging the temp left and right arrays
        // k= first index of merged array
        int a = l;
        while (i < size1 && j < size2) {
            if (L[i] <= R[j]) {
                arr[a] = L[i];
                i++;
            } else {
                arr[a] = R[j];
                j++;
            }
            a++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < size1) {
            arr[a] = L[i];
            i++;
            a++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < size2) {
            arr[a] = R[j];
            j++;
            a++;
        }

    }

    // prep values for merge and call function
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            //cal middle
            int m = l + (r - l) / 2;
            //sort first and last halve
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
        logger.info("Sort is complete!");
    }
}

