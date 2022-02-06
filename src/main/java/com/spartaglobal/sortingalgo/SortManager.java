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
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        if(sb.isEmpty()==Boolean.FALSE) {
            sb.deleteCharAt(sb.lastIndexOf(" "));
        }
        return sb;
    }

    private static Logger logger = LogManager.getLogger("SortManager logger:");

    public static void main(String[] args) {

        SortView v = new SortView();
        SortController sc = new SortController();
        int[] a= v.arrChoice();
        int[] b= a;

        sc.initiateSort(a, v.getDesiredMethodType());
        System.out.println("\n Before sort: " + print(b));
        System.out.println("After Sort: " + print(a));
    }
}
