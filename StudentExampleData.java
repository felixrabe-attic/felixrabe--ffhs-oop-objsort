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
            new Student.Builder(4)
                .first("Archimedes").last("Syrakus").age(2296).gpa(6.0).build(),
            new Student.Builder(3)
                .first("Fritzli").last("Schneider").age(9).gpa(4).build(),
            new Student.Builder(1)
                .first("Walterli").last("Tell").age(12).gpa(4).build(),
            new Student.Builder(5)
                .first("Greengrey").last("vonRotz").age(20).gpa(4).build(),
            new Student.Builder(2)
                .first("Maria").last("Stuart").age(467).gpa(4).build()
        };
    }
}
