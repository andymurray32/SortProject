package com.spartaglobal.sortingalgo.Controller;

import com.spartaglobal.sortingalgo.Model.BubbleMethod;
import com.spartaglobal.sortingalgo.Model.MergeMethod;
import com.spartaglobal.sortingalgo.Model.Method;
import com.spartaglobal.sortingalgo.Model.MethodSort;

public class SortController {
    public static Method getMethod(String methodType) {
        MethodSort ms;
        if (methodType.equalsIgnoreCase("bubblesort")) {
            ms = new BubbleMethod();
        } else if (methodType.equalsIgnoreCase("mergesort")) {
            ms = new MergeMethod();
        } else {
            ms = null;
        }
        return ms.getInstance();
    }

    public void initiateSort(int[] array, String desiredMethodType){
        Method m = getMethod(desiredMethodType);
        m.sort(array);
    }
}
