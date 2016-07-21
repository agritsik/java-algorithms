package com.agritsik.samples.popular;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andrey on 7/21/16.
 */
public class TwoArraysMergeTest {

    @Test
    public void execute() throws Exception {


        // arrange
        int[] m1 = new int[]{8, 2, 4};
        int[] m2 = new int[]{3, 9, 4, 12, 9};

        // act
        int[] result = TwoArraysMerge.execute(m1, m2);

        // assert
        Assert.assertArrayEquals(new int[]{2, 3, 4, 4, 8, 9, 9, 12}, result);

    }

}