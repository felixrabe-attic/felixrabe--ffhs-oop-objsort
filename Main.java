/** Main program.
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
        Student[] students = StudentExampleData.build();
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
