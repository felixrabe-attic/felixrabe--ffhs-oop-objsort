/** Main program that demonstrates sorting a list of students.
 *
 * Run without arguments, it uses the example data provided by
 * {@link StudentExampleData#build}.
 *
 * @author Felix Rabe
 * @version 20111129
 */
public class Main {
    /** Main program. */
    public static void main(String[] args) {
        Sort sort;
        Student[] students;
        
        System.out.println("### SORTING USING BUBBLESORT ###");
        sortUsing(StudentExampleData.build(), new BubbleSort<Student>());
    }
    
    /** Sort students using the provided algorithm. */
    private static void sortUsing(Student[] students, Sort<Student> sort) {
        print("Unsorted", students);
        print("Sorted by number",
            sort.cmp(new StudentNumberComparator()).sort(students));
        print("Sorted by last name",
            sort.cmp(new StudentLastNameComparator()).sort(students));
    }
    
    private static void print(String caption, Student[] students) {
        System.out.println(caption + ":");
        for (Student s: students) {
            System.out.println(s);
        }
        System.out.println();
    }
}
