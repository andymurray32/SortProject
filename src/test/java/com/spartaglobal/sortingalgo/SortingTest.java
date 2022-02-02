package com.spartaglobal.sortingalgo;

import com.spartaglobal.sortingalgo.Model.BubbleSort;
import com.spartaglobal.sortingalgo.Model.MergeSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.spartaglobal.sortingalgo.Model.BubbleSort.bubbleSort;
import static com.spartaglobal.sortingalgo.SortManager.print;
import static com.spartaglobal.sortingalgo.Model.MergeSort.sort;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    @Test
    @DisplayName("Bubble: Given an empty String")
    public void bubbleSortEmptyString() {
        BubbleSort s = new BubbleSort();
        int[] a = {};
        bubbleSort(a);
        String expected= ("");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Bubble: Postive numbers")
    public void bubbleSortCheck() {
        BubbleSort s = new BubbleSort();
        int[] a = {99, 88, 77, 102, 105};
        bubbleSort(a);
        String expected= ("77 88 99 102 105 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Bubble:Negative number")
    public void bubbleSortNegArray() {
        BubbleSort s = new BubbleSort();
        int[] a = {-3, -88, -77, -102, -105};
        bubbleSort(a);
        String expected= ("-105 -102 -88 -77 -3 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Bubble: Zero numbers array")
    public void bubbleSortZeroArray() {
        BubbleSort s = new BubbleSort();
        int[] a = {0, 0, 0, 0, 0};
        bubbleSort(a);
        String expected= ("0 0 0 0 0 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Merge: Given an empty String")
    public void MergeSortEmptyString() {
        MergeSort s = new MergeSort();
        int[] a = {};
        sort(a,0,a.length-1);
        String expected= ("");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Merge: Given some numbers")
    public void mergeSortCheck() {
        MergeSort s = new MergeSort();
        int[] a = {99, 88, 77, 102, 105};
        sort(a,0,a.length-1);
        String expected= ("77 88 99 102 105 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Merge: Negative Numbers")
    public void mergeSortNegArray() {
        MergeSort s = new MergeSort();
        int[] a = {-3, -88, -77, -102, -105};
        sort(a,0,a.length-1);
        String expected= ("-105 -102 -88 -77 -3 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Merge: full zero array")
    public void mergeSortZeroArray() {
        MergeSort s = new MergeSort();
        int[] a = {0, 0, 0, 0, 0};
        sort(a,0,a.length-1);
        String expected= ("0 0 0 0 0 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }

}
