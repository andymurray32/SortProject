package com.spartaglobal.sortingalgo;

import com.spartaglobal.sortingalgo.Controller.SortController;
import com.spartaglobal.sortingalgo.Model.BubbleSort;
import com.spartaglobal.sortingalgo.Model.MergeSort;
import com.spartaglobal.sortingalgo.Model.Method;
import com.spartaglobal.sortingalgo.View.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortManager {

    /**
     * @param arr
     * @return String of sorted array
     */
    public static StringBuilder print(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i] + " ");
        return sb;
    }

    private static Logger logger = LogManager.getLogger("SortManager logger:");

    public static void main(String[] args) {

        Method b= new BubbleSort();
        int[] a = {93, 3, 2, 90, 4, 5, 12, 9};
        System.out.println("First Array: " + print(a));
        b.sort(a);
        System.out.println("Bubble sort: " + print(a));

        int arr[] = {12, 11, 13, 5, 6, 7};
        Method m= new MergeSort();
        System.out.println("Given Array: " + print(arr));
        m.sort(arr);
        System.out.println("Merge sort: " + print(arr));
        /*-----------------------------------------------*/


        int[] p = {45, 3, 5, 90, 1, 4};
        System.out.println("\n Before sort: " + print(p));
        SortView v = new SortView();
        SortController sc = new SortController();
        sc.initiateSort(p, v.getDesiredMethodType());
        System.out.println("After Sort: " + print(p));
    }
}
