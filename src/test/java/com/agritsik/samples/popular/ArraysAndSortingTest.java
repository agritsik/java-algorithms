package com.agritsik.samples.popular;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by andrey on 7/9/16.
 */
public class ArraysAndSortingTest extends TestCase {


    public void testDuplicationInArray1() throws Exception {

        // arrange
        int[] arr = new int[]{1, 4, 5, 8, 1, 9, 1, 5};

        // act
        int[] t = ArraysAndSorting.findDuplicates(arr);

        // assert
        assertTrue(Arrays.equals(new int[]{1, 5}, t));

    }

    public void testDuplicationInArray2() throws Exception {

        // arrange
        int[] arr = new int[]{1, 4, 5, 8, 1, 9, 1, 5, 9};

        // act
        int[] t = ArraysAndSorting.findDuplicates(arr);

        // assert
        assertTrue(Arrays.equals(new int[]{1, 5, 9}, t));

    }

    public void testDuplicationInArray3() throws Exception {

        // arrange
        int[] arr = new int[]{1, 1, 1};

        // act
        int[] t = ArraysAndSorting.findDuplicates(arr);

        // assert
        assertTrue(Arrays.equals(new int[]{1}, t));

    }


    // --------------------------------------------------------------------
    // --------------------------------------------------------------------
    // --------------------------------------------------------------------


    public void testContainsYes() throws Exception {
        // arrange
        int[] outer = new int[]{1, 3, 4, 5, 8, 11, 14, 20};
        int[] inner = new int[]{4, 8, 14};


        // act
        boolean r = ArraysAndSorting.contains(outer, inner);

        // assert
        assertTrue(r);

    }

    public void testContainsNo() throws Exception {
        // arrange
        int[] outer = new int[]{1, 3, 4, 5, 8, 11, 14, 20};
        int[] inner = new int[]{4, 9, 14};


        // act
        boolean r = ArraysAndSorting.contains(outer, inner);

        // assert
        assertFalse(r);

    }
}