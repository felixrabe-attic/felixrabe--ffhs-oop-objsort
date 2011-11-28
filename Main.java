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
            printStudent(s);
        }
    }
    
    /** Print the information of a student to the console. */
    private static void printStudent(Student s) {
        System.out.println("First:  " + s.getFirstName());
        System.out.println("Last:   " + s.getLastName());
        System.out.println("Number: " + s.getNumber());
        System.out.println("Age:    " + s.getAge());
        System.out.println("GPA:    " + s.getGradePointAverage());
        System.out.println();
    }
}
