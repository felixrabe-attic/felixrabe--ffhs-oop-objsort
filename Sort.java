/** Interface for classes that sort an array of objects using a
 *  @{link java.util.Comparator}.
 */
public abstract class Sort<T> {
    protected java.util.Comparator<T> comparator;

    public Sort(java.util.Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public T[] sort(T[] inputs) {
        T[] outputs = inputs.clone();
        sortInPlace(outputs);
        return outputs;
    }
    
    public abstract void sortInPlace(T[] inputs);
}
