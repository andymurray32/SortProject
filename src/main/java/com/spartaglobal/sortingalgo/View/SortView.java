package com.spartaglobal.sortingalgo.View;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.Scanner;

public class SortView {
    private static final Logger logger = LogManager.getLogger("SortView logger:");

    public int arrSize() {
        int arrSize = 0;
        do {
            System.out.println("Please enter the size of the array you wish to sort:");
            try {
                Scanner scanner = new Scanner(System.in);
                arrSize = Integer.parseInt(scanner.next());
                logger.info("User has selected an array size of: " + arrSize);
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for choice for array", e);
                arrSize = 0;
            }
        }
        while (arrSize == 0);
        return arrSize;
    }

    public int getNextInt(int j) {
        int a = 0;
        int x = 1;
        do {
            System.out.println("Please enter the " + (j) + " Index");
            try {
                Scanner scanner = new Scanner(System.in);
                a = Integer.parseInt(scanner.next());
                logger.info("User has selected " + a + " as the " + j + " Index");
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for choice for array", e);
                x = 0;
            }
        }
        while (x == 0);
        return a;
    }
    // enum for user choice

    public int[] arrChoice() {
        Random rd = new Random(); // creating Random object
        int arraysize = arrSize();
        int[] arr = new int[arraysize];
        int numChoice = 0;
        String arrchoice = null;
        do {
            System.out.println("Enter your array or randomly generate array:");
            int i = 1;
            //list of enum
            for (UserChoice value : UserChoice.values()) {
                System.out.println(i + ": " + value.name());
                i++;
            }
            try {
                Scanner scan = new Scanner(System.in);
                numChoice = Integer.parseInt(scan.next());
                while (numChoice > 3 || numChoice < 0) {
                    System.out.println("Please enter a suitable number:");
                    Scanner a = new Scanner(System.in);
                    numChoice = Integer.parseInt(a.next());
                }
                switch (numChoice) {
                    case 1 -> arrchoice = "Enter input manually";
                    case 2 -> arrchoice = "Randomly generate array";
                    case 3 -> System.exit(0);
                }
                logger.info("User has selected to " + arrchoice);

                if (arrchoice.equals("Randomly generate array")) {
                    for (int k = 0; k < arraysize; k++) {
                        arr[k] = rd.nextInt(); // storing random integers in an array
                    }
                }
                if (arrchoice.equals("Enter input manually")) {
                    for (int j = 0; j < arraysize; j++) {
                        arr[j] = getNextInt(j);
                    }
                }
            } catch (Exception e) {
                System.out.println("You must enter a valid number to the corresponding sort.");
                logger.error("Invalid input to the console for choice for array", e);
                numChoice = 0;
            }
        }
        while (numChoice == 0);
        return arr;
    }


    public StringBuilder getDesiredMethodType() {
        int numChoice = 0;
        int numChoice2 = 0;
        StringBuilder str = new StringBuilder();
        do {
            System.out.println("Sorting Methods: ");
            System.out.println("Please select the number for sort desired");
            int i = 1;
            int j = 1;
            //list of enum
            for (MethodEnum value : MethodEnum.values()) {
                System.out.println(i + ": " + value.name());
                i++;
            }
            try {
                Scanner s = new Scanner(System.in);
                numChoice = Integer.parseInt(s.next());
                while (numChoice > 4 || numChoice < 0) {
                    System.out.println("Please enter a suitable number:");
                    Scanner a = new Scanner(System.in);
                    numChoice = Integer.parseInt(a.next());
                }
                switch (numChoice) {
                    case 1 -> str.append("BubbleSort");
                    case 2 -> str.append("MergeSort");
                    case 3 -> str.append("BST");
                    case 4 -> System.exit(0);
                }
                logger.info("User has selected a Sort method");
                System.out.println("Add another method:");
                for (Choice value : Choice.values()) {
                    System.out.println(j + ": " + value.name());
                    j++;
                }
                try {
                    Scanner scann = new Scanner(System.in);
                    numChoice2 = Integer.parseInt(scann.next());
                    while (numChoice2 > 3 || numChoice2 < 0) {
                        System.out.println("Please enter a suitable number:");
                        Scanner a = new Scanner(System.in);
                        numChoice2 = Integer.parseInt(a.next());
                    }
                    switch (numChoice2) {
                        case 1 -> {
                            str.append(" ");
                            numChoice=0;
                        }
                        case 2 -> numChoice=1;
                        case 3 -> System.exit(0);
                    }
                }  catch (Exception e) {
                    System.out.println("You must enter a valid number from the list");
                    logger.error("Invalid input to the console for anotherMethod added", e);
                    numChoice = 0;
                }

            } catch (Exception e) {
                System.out.println("You must enter a valid number from the list");
                logger.error("Invalid input to the console for getDesiredMethodType", e);
                numChoice = 0;
            }
        }
        while (numChoice == 0);
        return str;
    }


    enum MethodEnum {
        BubbleSort,
        MergeSort,
        BST,
        Exit
    }

    // enum for user choice
    enum UserChoice {
        EnterArray,
        RandomArray,
        Exit
    }
    enum Choice {
        Yes,
        No,
        Exit
    }

}
