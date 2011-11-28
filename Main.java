/** Main program.
 *
 * Run without arguments, it uses the example data provided by
 * {@link StudentExampleData#build}.
 *
 * @author Felix Rabe
 * @version 20111128
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = StudentExampleData.build();
        Student s = students[0];
        dumpStudent(s);
    }
    
    private static void dumpStudent(Student s) {
        p("First:  " + s.getFirstName());
        p("Last:   " + s.getLastName());
        p("Number: " + s.getNumber());
        p("Age:    " + s.getAge());
        p("GPA:    " + s.getGradePointAverage());
    }
    
    private static void p(String s) {
        System.out.println(s);
    }
}
