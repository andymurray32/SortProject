package com.spartaglobal.sortingalgo;

import com.spartaglobal.sortingalgo.Model.BubbleSort;
import com.spartaglobal.sortingalgo.Model.MergeSort;
import com.spartaglobal.sortingalgo.Model.Method;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.spartaglobal.sortingalgo.SortManager.print;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {
    @Test
    @DisplayName("Bubble: Given an empty String")
    public void bubbleSortEmptyString() {
        Method s = new BubbleSort();
        int[] a = {};
        s.sort(a);
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
        Method s = new BubbleSort();
        int[] a = {99, 88, 77, 102, 105};
        s.sort(a);
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
        Method s = new BubbleSort();
        int[] a = {-3, -88, -77, -102, -105};
        s.sort(a);
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
        Method s = new BubbleSort();
        int[] a = {0, 0, 0, 0, 0};
        s.sort(a);
        String expected= ("0 0 0 0 0 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Bubble: Uneven length")
    public void bubbleUnevenArray() {
        Method s = new BubbleSort();
        int[] a = {1, 2, 3, 4, 5};
        s.sort(a);
        String expected= ("1 2 3 4 5 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Merge: Given an empty String")
    public void MergeSortEmptyString() {
        Method s = new MergeSort();
        int[] a = {};
        s.sort(a);
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
        Method s = new MergeSort();
        int[] a = {99, 88, 77, 102, 105};
        s.sort(a);
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
        Method s = new MergeSort();
        int[] a = {-3, -88, -77, -102, -105};
        s.sort(a);
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
        Method s = new MergeSort();
        int[] a = {0, 0, 0, 0, 0};
        s.sort(a);
        String expected= ("0 0 0 0 0 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Merge: Uneven length")
    public void mergeUnevenArray() {
        Method s = new BubbleSort();
        int[] a = {1, 2, 3, 4, 5};
        s.sort(a);
        String expected= ("1 2 3 4 5 ");
        //arrange
        //Act
        String result= String.valueOf(print(a));
        //Assert
        assertEquals(expected, result);
    }
}
