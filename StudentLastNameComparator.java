/** Compares a student by his last name.
 *
 * Note: this comparator imposes orderings that are inconsistent with equals.
 *
 * @author Felix Rabe
 * @version 20111129
 */
public class StudentLastNameComparator implements java.util.Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
