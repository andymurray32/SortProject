package com.spartaglobal.sortingalgo.Controller;

import com.spartaglobal.sortingalgo.Model.BubbleMethod;
import com.spartaglobal.sortingalgo.Model.MergeMethod;
import com.spartaglobal.sortingalgo.Model.Method;
import com.spartaglobal.sortingalgo.Model.MethodSort;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SortController {
    private static Logger logger = LogManager.getLogger("Sort Controller logger:");

    public static Method getMethod(String methodType) {
        MethodSort ms;
        if (methodType.equalsIgnoreCase("bubblesort")) {
            ms = new BubbleMethod();
        } else if (methodType.equalsIgnoreCase("mergesort")) {
            ms = new MergeMethod();
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
        if(sb.isEmpty()==Boolean.FALSE) {
            sb.deleteCharAt(sb.lastIndexOf(" "));
        }
        return sb;
    }


    public void initiateSort(int[] array,  String desiredMethodType){
        System.out.println("\n Before sort: " + print(array));


//        if(strBuilderMethodType.isEmpty()){
//            logger.warn("Sort Initiated!");
//        }
        String[] a = desiredMethodType.split(" ");
        for(int i=0; i<a.length;i++){
            Method m= getMethod(a[i]);
            logger.info("Sort Initiated for "+a[i]);
            m.sort(array);
            System.out.println("Using "+a[i]+" for sort:" + print(array));
            //System.out.println("Time taken");
        }

    }
}
