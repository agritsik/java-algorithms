package com.agritsik.samples.popular;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by andrey on 7/21/16.
 */
public class ArrayContainsTest {


    @Test
    public void testContainsYes() throws Exception {
        // arrange
        int[] outer = new int[]{1, 3, 4, 5, 8, 11, 14, 20};
        int[] inner = new int[]{4, 8, 14};


        // act
        boolean r = ArrayContains.execute(outer, inner);

        // assert
        assertTrue(r);

    }

    @Test
    public void testContainsNo() throws Exception {
        // arrange
        int[] outer = new int[]{1, 3, 4, 5, 8, 11, 14, 20};
        int[] inner = new int[]{4, 9, 14};


        // act
        boolean r = ArrayContains.execute(outer, inner);

        // assert
        assertFalse(r);

    }

}