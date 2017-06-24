import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 24/6/17.
 */
public class Sort {

    public static int[] bubbleSort(int numbers[]) {
        boolean isSwapped;
        do {
            isSwapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = tmp;
                    isSwapped = true;
                }
            }//end for
        } while (isSwapped);
        return numbers;
    }


    public static List<Integer> quickSort(List<Integer> numbers) {
        List<Integer> sortedNumbers = new ArrayList<>(),
                      lowerNumbers = new ArrayList<>(),
                      higherNumbers = new ArrayList<>();

        if (numbers.size() < 2) {
            return numbers;
        }//end if

        Integer pivot = numbers.get(0);
        for (int i=1; i<numbers.size(); i++) {//Must start from 1. Pivot cannot be involved
            Integer currentInteger = numbers.get(i);
            if (currentInteger < pivot) {
                lowerNumbers.add(currentInteger);
            } else {
                higherNumbers.add(currentInteger);
            }
        }//end for

        sortedNumbers.addAll(quickSort(lowerNumbers));
        sortedNumbers.add(pivot);
        sortedNumbers.addAll(quickSort(higherNumbers));

        return sortedNumbers;

    }


}
