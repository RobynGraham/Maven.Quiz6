package rocks.zipcode.io.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] allIntegers = new Integer[end];
        for (int i = start; i < end; i++) {
            Integer allInteger = allIntegers[i];

        }

        return allIntegers;
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {

        array = new Character[5];


        return null;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        return null;
    }
}
