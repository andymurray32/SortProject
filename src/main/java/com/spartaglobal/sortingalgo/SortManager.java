package com.spartaglobal.sortingalgo;

import com.spartaglobal.sortingalgo.Controller.SortController;
import com.spartaglobal.sortingalgo.View.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortManager {


    private static final Logger logger = LogManager.getLogger("SortManager logger:");

    public static void main(String[] args) {

        SortView v = new SortView();
        SortController sc = new SortController();
        int[] a = v.arrChoice();
        String str = String.valueOf(v.getDesiredMethodType());
        sc.initiateSort(a, str);
        logger.info("All sorts are complete!");

    }
}
