package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        Integer[] getOdds = new Integer[0];
        for(int i = 0; i < ints.length; i++){

            if (i %2 == 0){

                int oddElements = getOdds.length;
                getOdds = Arrays.copyOf(getOdds, getOdds.length + 1);
                getOdds[oddElements] = ints[i];

            }
        }
        return getOdds;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] getEvens = new Integer[0];
        for(int i = 0; i < ints.length; i++){

            if (i %2 != 0){

                int evenElements = getEvens.length;
                getEvens = Arrays.copyOf(getEvens, getEvens.length + 1);
                getEvens[evenElements] = ints[i];

            }
        }
        return getEvens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] notDivisBy3 = new Integer[0];

        for(int i = 0; i < ints.length; i++){

            if (i % 3 == 0){

                int oddElements = notDivisBy3.length;
                notDivisBy3 = Arrays.copyOf(notDivisBy3, notDivisBy3.length + 1);
                notDivisBy3[oddElements] = ints[i];

            }
        }
        return notDivisBy3;
    }


    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[] notDivisByN = new Integer[0];

        for(int i = 0; i < ints.length; i++){

            if (i % multiple == 0){

                int oddElements = notDivisByN.length;
                notDivisByN = Arrays.copyOf(notDivisByN, notDivisByN.length + 1);
                notDivisByN[oddElements] = ints[i];

            }
        }
        return notDivisByN;
    }
}
