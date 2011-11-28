/** This class constructs example data using the {@link #build} method.
 *
 * @author Felix Rabe
 * @version 20111128
 */
public class StudentExampleData {
    /** No use for instantiation. */
    private StudentExampleData() { }

    /** Create example data. */
    public static Student[] build() {
        return new Student[] {
            new Student.Builder().number("4")
                .first("Archimedes").last("Syrakus").age(2296).gpa(6.0).build()
        };
    }
}
