import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 24/6/17.
 */
public class SortTest {


    public static List<Integer> arrayToListOfInteger(int[] array) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int index = 0; index < array.length; index++) {
            intList.add(array[index]);
        }
        return intList;
    }


    @Test
    public void testBubbleSort1() throws Exception {
        int[] inputData = {4,2,5,1,3};
        int[] expectedSorted = {1,2,3,4,5};

        assertArrayEquals(expectedSorted, Sort.bubbleSort(inputData) );
    }


    @Test
    public void testBubbleSort2() throws Exception {
        int[] inputData = {-6,-1,0,-9,-2};
        int[] expectedSorted = {-9,-6,-2,-1,0};

        assertArrayEquals(expectedSorted, Sort.bubbleSort(inputData) );
    }

    @Test
    public void testQuickSort1() throws Exception {
        int[] inputData = {4,2,5,1,3};
        int[] expectedSorted = {1,2,3,4,5};
        assertEquals(arrayToListOfInteger(expectedSorted), Sort.quickSort(arrayToListOfInteger(inputData)));
    }


    @Test
    public void testQuickSort2() throws Exception {
        int[] inputData = {-6,-1,0,-9,-2};
        int[] expectedSorted = {-9,-6,-2,-1,0};
        assertEquals(arrayToListOfInteger(expectedSorted), Sort.quickSort(arrayToListOfInteger(inputData)));
    }


}