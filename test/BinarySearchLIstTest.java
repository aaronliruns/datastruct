import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 24/6/17.
 */
public class BinarySearchLIstTest {

    public static List<Integer> arrayToListOfInteger(int[] array) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < array.length; index++) {
            intList.add(array[index]);
        }
        return intList;
    }



    @Test
    public void testBinarySearchFound() throws Exception {

        int[] arrayTobeSearched = {4,3,1,9,10,17,14,23,3,0,22};

        List<Integer> listTobeSearched = arrayToListOfInteger(arrayTobeSearched);
        Collections.sort(listTobeSearched);

        assertTrue(BinarySearchLIst.binarySearch(listTobeSearched,3));
    }


    @Test
    public void testBinarySearchNotFound() throws Exception {

        int[] arrayTobeSearched = {4,3,1,9,10,17,14,23,3,0,22};

        List<Integer> listTobeSearched = arrayToListOfInteger(arrayTobeSearched);
        Collections.sort(listTobeSearched);

        assertFalse(BinarySearchLIst.binarySearch(listTobeSearched,47));
    }


}