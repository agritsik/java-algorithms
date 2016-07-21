package com.agritsik.samples.popular;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andrey on 7/21/16.
 */
public class TwoArraysDuplicatesTest {

    @Test
    public void execute() throws Exception {

        // arrange
        int[] arr1 = new int[]{1, 4, 4, 4, 5, 6, 8};
        int[] arr2 = new int[]{2, 4, 3, 6, 9, 11};

        // act
        int[] result = TwoArraysDuplicates.execute(arr1, arr2);

        // assert
        Assert.assertArrayEquals(new int[]{4, 6}, result);
    }

}