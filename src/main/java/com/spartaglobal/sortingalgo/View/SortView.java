package com.spartaglobal.sortingalgo.View;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class SortView {
    private static Logger logger = LogManager.getLogger("SortView logger:");
    enum MethodEnum {
        BubbleSort,
        MergeSort,
        Exit
    }

    public String getDesiredMethodType() {
        int numChoice = 0;
        String desiredMethodType = null;
        do {
            System.out.println("Sorting Methods: ");
            System.out.println("Please select the number for sort desired");
            int i = 1;
            //list of enum
            for (MethodEnum value : MethodEnum.values()) {
                System.out.println(i + ": " + value.name());
                i++;
            }
            try {
                Scanner s = new Scanner(System.in);
                numChoice = Integer.parseInt(s.next());
                while (numChoice>3||numChoice<0){
                    System.out.println("Please enter a suitable number:");
                    Scanner a = new Scanner(System.in);
                    numChoice=Integer.parseInt(a.next());
                }
                switch (numChoice) {
                    case 1 -> desiredMethodType = "BubbleSort";
                    case 2 -> desiredMethodType = "MergeSort";
                    case 3 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for getDesiredMethodType", e);
                numChoice=0;
            }
        }
        while (numChoice == 0);
        return desiredMethodType;
//        setBaseClass();
//        Scanner s = new Scanner(System.in);
//        String desiredMethodType = s.next();
//        return desiredMethodType;
    }
}
