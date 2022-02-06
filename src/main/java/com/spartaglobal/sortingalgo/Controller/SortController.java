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


    public void initiateSort(int[] array,  String desiredMethodType){

        Method m = getMethod(desiredMethodType);
        logger.info("Sort Initiated!");
        m.sort(array);
        logger.info("Sort Complete!");
    }
}
