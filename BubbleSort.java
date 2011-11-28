import java.util.*;

/** Program that sorts an arbitrary array using the bubble sort algorithm.
 * @author Felix Rabe
 * @version 20111024
 */
public class BubbleSort<T> extends Sort<T> {
    public BubbleSort(java.util.Comparator<T> comparator) {
        super(comparator);
    }

    /** Sort the specified array in-place.  Uses the bubble sort algorithm.
     * @param array - the array to sort
     */
    public void sortInPlace(T[] array) {
        boolean hadToSwap;
        do {
            hadToSwap = false;
            for (int first = 0; first < array.length - 1; first++) {
                int second = first + 1;
                if (comparator.compare(array[first], array[second]) > 0) {
                    swap(array, first, second);
                    hadToSwap = true;
                }
            }
        } while(hadToSwap);
    }

    /** Swap two elements in the given array.
     * @param array - the array in which to swap the elements
     * @param first - the index of the first element to swap
     * @param second - the index of the second element to swap
     */
    private void swap(T[] array, int first, int second) {
        T tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
