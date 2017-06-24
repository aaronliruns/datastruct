import java.util.List;

/**
 * Created by admin on 24/6/17.
 */
public class BinarySearchLIst {

    public static boolean binarySearch(List<Integer> sortedList, Integer value) {

        if (sortedList == null || sortedList.isEmpty()) {
            return false;
        }

        Integer pivot = sortedList.get(sortedList.size() / 2);
        if (value.equals(pivot)) {
            return true;
        }

        if (value <  pivot) {
            return binarySearch(sortedList.subList(0,sortedList.size()/2),value);
        } else {
            return binarySearch(sortedList.subList(sortedList.size()/2 + 1 , sortedList.size()),value);
        }

    }
}
