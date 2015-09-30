package com.agritsik.samples;

/**
 * Created by andrey on 9/30/15.
 */
public class AP1 {

    public boolean scoresIncreasing(int[] scores) {

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 100 && scores[i - 1] == 100) return true;
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {

        for (int i = 2; i < scores.length; i++) {
            if ((scores[i] - scores[i - 1]) + (scores[i - 1] - scores[i - 2]) <= 2) return true;
        }

        return false;
    }


}
