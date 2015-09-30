package com.agritsik.samples;

/**
 * Created by andrey on 9/29/15.
 */
public class Logic1 {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend ? cigars >= 40 : (cigars >= 40 && cigars <= 60);
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2)
            return 0;
        else if (you >= 8 || date >= 8)
            return 2;
        else
            return 1;
    }


    public boolean squirrelPlay(int temp, boolean isSummer) {
        return temp >= 60 && temp <= ((isSummer) ? 100 : 90);
    }

}
