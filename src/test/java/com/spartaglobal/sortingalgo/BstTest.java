package com.spartaglobal.sortingalgo;

import com.spartaglobal.sortingalgo.Model.BstSort;
import com.spartaglobal.sortingalgo.Model.Method;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.spartaglobal.sortingalgo.Controller.SortController.print;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class BstTest {
        @Test
        @DisplayName("BST: Given an empty String")
        public void bstSortEmptyString() {
            Method s = new BstSort();
            int[] a = {};
            s.sort(a);
            String expected= ("");
            //arrange
            //Act
            String result= String.valueOf(print(a));
            System.out.println(result);
            System.out.println(expected);
            //Assert
            assertEquals(expected, result);
        }
        @Test
        @DisplayName("BST: Positive numbers")
        public void bstSortCheck() {
            Method s = new BstSort();
            int[] a = {99, 88, 77, 102, 105};
            s.sort(a);
            String expected= ("77 88 99 102 105");
            //arrange
            //Act
            String result= String.valueOf(print(a));
            System.out.println(result);
            System.out.println(expected);
            //Assert
            assertEquals(expected, result);
        }
        @Test
        @DisplayName("BST:Negative number")
        public void bstSortNegArray() {
            Method s = new BstSort();
            int[] a = {-3, -88, -77, -102, -105};
            s.sort(a);
            String expected= ("-105 -102 -88 -77 -3");
            //arrange
            //Act
            String result= String.valueOf(print(a));
            System.out.println(result);
            System.out.println(expected);
            //Assert
            assertEquals(expected, result);
        }
        @Test
        @DisplayName("BST: Zero numbers array")
        public void bstSortZeroArray() {
            Method s = new BstSort();
            int[] a = {0, 0, 0, 0, 0};
            s.sort(a);
            String expected= ("0 0 0 0 0");
            //arrange
            //Act
            String result= String.valueOf(print(a));
            System.out.println(result);
            System.out.println(expected);
            //Assert
            System.out.println(result);
            System.out.println(expected);
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("BST: Uneven length")
        public void bstUnevenArray() {
            Method s = new BstSort();
            int[] a = {1, 2, 3, 4, 5};
            s.sort(a);
            String expected= ("1 2 3 4 5");
            //arrange
            //Act
            String result= String.valueOf(print(a));
            //Assert
            assertEquals(expected, result);
        }

}
