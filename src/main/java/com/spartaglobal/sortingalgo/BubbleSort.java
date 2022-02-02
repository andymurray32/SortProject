package com.spartaglobal.sortingalgo;

import java.util.ArrayList;

public class BubbleSort implements Method {
    /**
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        int swapCount = 0;
        ArrayList<String> a= new ArrayList<>();

        //loop all numbers, -1 because of index
        for (int i = 0; i < arr.length-1; i++){
            boolean swap = false;

            //for that arr[i], compare to every number to the right of it, swapping if necessary
            //max number of comparison but break will avoid some comparisons
            for (int j = 0; j < arr.length-i-1; j++){
                //if left bigger than right then they swap places and the bigger (left) continues
                // comparing with the rest of the numbers on the right
                if (arr[j] > arr[j+1])
                {
                    // swap the two numbers using third variable temp
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                    swapCount++;
                    a.add(arr[j]+" Swapped with: "+arr[j+1]); // keep track of swaps
                }
            }
            //Stop comparing if it didnt cause any swaps
            if (swap == false)
                break;
        }
        //System.out.println("Swap Count: "+swapCount); // number of swaps
        //System.out.println("Swap log: "+a);
    }

    @Override
    public void sort(int[] array) {
        bubbleSort(array);
    }
}
