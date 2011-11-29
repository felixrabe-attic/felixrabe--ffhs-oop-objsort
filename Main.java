/** Main program that demonstrates sorting a list of students.
 *
 * To be run without arguments.  It uses the example data provided by
 * {@link StudentExampleData#build}.
 *
 * @author Felix Rabe
 * @version 20111129
 */
public class Main {
    /** Main program. */
    public static void main(String[] args) {
        Student[] students = StudentExampleData.build();
        
        print("Unsorted", students);

        sortInPlaceUsing(students, new java.util.Comparator<Student>() {
            /** Sort students by number. */
            public int compare(Student a, Student b) {
                return a.getNumber() - b.getNumber();
            }
        });
        print("Sorted by number", students);

        sortInPlaceUsing(students, new java.util.Comparator<Student>() {
            /** Sort students by last name. */
            public int compare(Student a, Student b) {
                return a.getLastName().compareTo(b.getLastName());
            }
        });
        print("Sorted by last name", students);

        sortInPlaceUsing(students, new java.util.Comparator<Student>() {
            /** Sort students by GPA. */
            public int compare(Student a, Student b) {
                double aa = a.getGradePointAverage();
                double bb = b.getGradePointAverage();
                return aa == bb ? 0 : aa < bb ? -1 : 1;
            }
        });
        print("Sorted by GPA", students);
    }
    
    /** Print all students with the given caption.
     *
     * @param caption the caption that is printed above the list of the students
     * @param students the array of students to print
     */
    private static void print(String caption, Student[] students) {
        System.out.println(caption + ":");
        for (Student s: students) {
            System.out.println(s);
        }
        System.out.println();
    }
    
    /** Sort the specified array in-place.
     *
     * Uses the bubble sort algorithm and the specified
     * {@link java.util.Comparator} strategy.
     *
     * @param array the array to sort
     * @param comparator the strategy by which to sort the given array
     */
    private static void sortInPlaceUsing(Student[] array,
                                         java.util.Comparator<Student> comparator) {
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
     * @param array the array in which to swap the elements
     * @param first the index of the first element to swap
     * @param second the index of the second element to swap
     */
    private static void swap(Student[] array, int first, int second) {
        Student tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
