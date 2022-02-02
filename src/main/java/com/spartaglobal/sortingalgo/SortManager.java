package com.spartaglobal.sortingalgo;

import java.util.Scanner;

import static com.spartaglobal.sortingalgo.BubbleSort.bubbleSort;
import static com.spartaglobal.sortingalgo.MergeSort.sort;

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
    public static Method getMethod(String methodType) {
        MethodSort ms;
        if (methodType.toLowerCase().equals("bubblesort")) {
            ms= new BubbleMethod();
        }
        else if (methodType.toLowerCase().equals("mergesort")) {
            ms= new MergeMethod();
        }else {
            ms = null;
        }
        return ms.getInstance();
    }

    public static void main(String[] args) {
        int [] a={93,3,2,90,4,5,12,9};
        System.out.println("First Array: "+print(a));
        bubbleSort(a);
        System.out.println("Bubble sort: "+print(a));

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array: "+print(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("Merge sort: "+print(arr));
        /*-----------------------------------------------*/
        Scanner s= new Scanner(System.in);
        int [] p={45,3,5,90,1,4};
        System.out.print("Please enter the sort method you would like to use: ");
        String desiredMethodType= s.next();
        Method m=getMethod(desiredMethodType);
        System.out.println("Before sort:"+print(p));
        m.sort(p);
        System.out.println("After Sort"+print(p));
    }
}
