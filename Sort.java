/** Interface for classes that sort an array of objects using a
 *  {@link java.util.Comparator} object.
 *
 * @author Felix Rabe
 * @version 20111129
 */
public abstract class Sort<T> {
    protected java.util.Comparator<T> comparator;

    /** Set the comparator. */
    public void setComparator(java.util.Comparator<T> comparator) {
        this.comparator = comparator;
    }
    
    /** Shortcut method to set the comparator, returning this.
     *
     * Useful for chaining with {@link #sort}.
     *
     * @return this
     */
    public Sort<T> cmp(java.util.Comparator<T> comparator) {
        setComparator(comparator);
        return this;
    }

    /** Sort the inputs, not modifying the input array.
     *
     * @param inputs the input array
     * @return sorted version of the input array
     */
    public T[] sort(T[] inputs) {
        T[] outputs = inputs.clone();
        sortInPlace(outputs);
        return outputs;
    }
    
    /** Sort the inputs by modifying the input array.
     *
     * This is the method to implement the sorting in subclasses.
     *
     * @param inputs the input array, will be sorted in-place
     */
    public abstract void sortInPlace(T[] inputs);
}
