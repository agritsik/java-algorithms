package com.agritsik.samples.codility.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andrey on 7/10/16.
 */
public class CodilityFirstTest {



    @Test
    public void solution11() throws Exception {
        CodilityFirst codilityFirst = new CodilityFirst();

        int solution = codilityFirst.solution1(new int[]{1, 1, 1, 1, 50});

        Assert.assertEquals(1, solution);
    }


    @Test
    public void solution12() throws Exception {
        CodilityFirst codilityFirst = new CodilityFirst();

        int solution = codilityFirst.solution1(new int[]{2, 2, 2, 2, 2, 3, 4, 4, 4, 6});

        Assert.assertEquals(-1, solution);

    }

    @Test
    public void solution21() throws Exception {
        CodilityFirst codilityFirst = new CodilityFirst();

        int r = codilityFirst.solution2(new int[]{0, 1, 3, -2, 0, 1, 0, -3, 2, 3});

        Assert.assertEquals(4, r);

    }

    @Test
    public void solution31() throws Exception {
        CodilityFirst codilityFirst = new CodilityFirst();

        int r = codilityFirst.solution3(new int[]{0, 1, 2, 2, 3, 5}, new int[]{500000, 500000, 0, 0, 0, 20000});

        Assert.assertEquals(8, r);

    }


}