package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String capitalizeStr = str.substring(0,1).toUpperCase() + str.substring(1);
        return capitalizeStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        String actualReversalOfStr = reverseStr.reverse().toString();
        return actualReversalOfStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        String actualReversalOfStr = reverseStr.reverse().toString();
        String capReversedStr = actualReversalOfStr.substring(0,1).toUpperCase() + actualReversalOfStr.substring(1);
        return capReversedStr;

    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removeFirstAndLast = str.substring(1, str.length()-1);
        return removeFirstAndLast;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
       char[] letters = str.toCharArray();
        for (char letter : letters){
            if (Character.isUpperCase(letter)){
                letter = Character.toLowerCase(letter);
            } else {
                letter = Character.toUpperCase(letter);
            }

        }


        return new String(letters);
    }
}
