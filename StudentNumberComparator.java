/** Compares a student by his number.
 *
 * Note: this comparator imposes orderings that are inconsistent with equals.
 *
 * @author Felix Rabe
 * @version 20111128
 */
public class StudentNumberComparator implements java.util.Comparator<Student> {
    public int compare(Student a, Student b) {
        int aNum = a.getNumber();
        int bNum = b.getNumber();
        return aNum == bNum ? 0 : aNum < bNum ? -1 : 1;
    }
}
