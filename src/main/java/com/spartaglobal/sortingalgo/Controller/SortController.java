package com.spartaglobal.sortingalgo.Controller;

import com.spartaglobal.sortingalgo.Model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;


public class SortController {
    private static final Logger logger = LogManager.getLogger("Sort Controller logger:");

    public static Method getMethod(String methodType) {
        MethodSort ms;
        if (methodType.equalsIgnoreCase("bubblesort")) {
            ms = new BubbleMethod();
        } else if (methodType.equalsIgnoreCase("mergesort")) {
            ms = new MergeMethod();
        } else if (methodType.equalsIgnoreCase("bst")) {
            ms = new BstMethod();
        } else {
            logger.warn("get method returned a null");
            ms = null;
        }
        return ms.getInstance();
    }

    /**
     * @param arr
     * @return String of sorted array
     */
    public static StringBuilder print(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        if (sb.isEmpty() == Boolean.FALSE) {
            sb.deleteCharAt(sb.lastIndexOf(" "));
        }
        return sb;
    }


    public void initiateSort(int[] array, @NotNull String desiredMethodType) {
        System.out.println("\n Before sort: " + print(array));
        System.out.println("------------------------------------------\n");
        String[] a = desiredMethodType.split(" ");
        for (int i = 0; i < a.length; i++) {
            Method m = getMethod(a[i]);
            logger.info("Sort Initiated for " + a[i]);
            long startTime = System.currentTimeMillis();
            m.sort(array);
            long endTime = System.currentTimeMillis();
            long timeElapsed = endTime - startTime;
            System.out.println("Method " + (i + 1));
            System.out.println(a[i] + " :" + print(array));
            System.out.println("Time taken (ms):" + timeElapsed);
            System.out.println("------------------------------------------\n");
            //System.out.println("Time taken");
        }

    }
}
