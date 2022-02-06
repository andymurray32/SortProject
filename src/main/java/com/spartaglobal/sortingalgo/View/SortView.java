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
    // enum for user choice
    enum UserChoice {
        EnterArray,
        RandomArray,
        Exit
    }
    // enum for user choice

    public int arrSize() {
        int arrSize = 0;
        do {
            System.out.println("Please enter the size of the array you wish to sort:");
            try {
                Scanner scanner = new Scanner(System.in);
                arrSize = Integer.parseInt(scanner.next());
                logger.info("User has selected an array size of:"+arrSize);
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for choice for array", e);
                arrSize=0;
            }
        }
        while (arrSize == 0);
        return arrSize;
    }

    // getarraysize
    //getChoice (random or input) invokes:
    //get input
    //get random input
    public String arrChoice() {
        int numChoice = 0;
        String arrchoice = null;
        do {
            System.out.println("Please select whether you would like to enter your values or randomly generate numbers");
            int i = 1;
            //list of enum
            for (UserChoice value : UserChoice.values()) {
                System.out.println(i + ": " + value.name());
                i++;
            }
            try {
                Scanner scan = new Scanner(System.in);
                numChoice = Integer.parseInt(scan.next());
                while (numChoice>3||numChoice<0){
                    System.out.println("Please enter a suitable number:");
                    Scanner a = new Scanner(System.in);
                    numChoice=Integer.parseInt(a.next());
                }
                switch (numChoice) {
                    case 1 -> arrchoice = "Enter input manually";
                    case 2 -> arrchoice = "Randomly generate";
                    case 3 -> System.exit(0);
                }
                logger.info("User has selected to"+ arrchoice);
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for choice for array", e);
                numChoice=0;
            }
        }
        while (numChoice == 0);
        return arrchoice;
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
                logger.info("User has selected a Sort method");
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for getDesiredMethodType", e);
                numChoice=0;
            }
        }
        while (numChoice == 0);
        return desiredMethodType;
    }
}
