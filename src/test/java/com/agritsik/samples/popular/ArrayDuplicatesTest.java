package com.agritsik.samples.popular;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by andrey on 7/21/16.
 */
public class ArrayDuplicatesTest {

    @Test
    public void testDuplicationInArray1() throws Exception {

        // arrange
        int[] arr = new int[]{1, 4, 5, 8, 1, 9, 1, 5};

        // act
        int[] t = ArrayDuplicates.execute(arr);

        // assert
        assertTrue(Arrays.equals(new int[]{1, 5}, t));

    }

    @Test
    public void testDuplicationInArray2() throws Exception {

        // arrange
        int[] arr = new int[]{1, 4, 5, 8, 1, 9, 1, 5, 9};

        // act
        int[] t = ArrayDuplicates.execute(arr);

        // assert
        assertTrue(Arrays.equals(new int[]{1, 5, 9}, t));

    }

    @Test
    public void testDuplicationInArray3() throws Exception {

        // arrange
        int[] arr = new int[]{1, 1, 1};

        // act
        int[] t = ArrayDuplicates.execute(arr);

        // assert
        assertTrue(Arrays.equals(new int[]{1}, t));

    }

}