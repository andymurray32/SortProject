package com.spartaglobal.sortingalgo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static com.spartaglobal.sortingalgo.Sorting.bubbleSort;
import static com.spartaglobal.sortingalgo.Sorting.printBubble;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    @Test
    @DisplayName("Given an empty String")
    public void bubbleSortEmptyString() {
        Sorting s = new Sorting();
        int[] a = {};
        bubbleSort(a);
        String expected= ("");
        //arrange
        //Act
        String result= String.valueOf(printBubble(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Given some numbers")
    public void bubbleSortCheck() {
        Sorting s = new Sorting();
        int[] a = {99, 88, 77, 102, 105};
        bubbleSort(a);
        String expected= ("77 88 99 102 105 ");
        //arrange
        //Act
        String result= String.valueOf(printBubble(a));
        //Assert
        assertEquals(expected, result);
    }
}
