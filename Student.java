/** A student in university.
 * @author Felix Rabe
 * @version 20111128
 */
public class Student {
    /* Data fields of the student: */
    private String firstName;
    private String lastName;
    private String number;
    private int age;
    private double gradePointAverage;
    
    /* Getters & Setters for the above: */
    
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public double getGradePointAverage() { return gradePointAverage; }
    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }
    
    /** Hidden constructor. Instead use the {@link Student.Builder} class below. */
    private Student() { }
    
    /** Builder to be used to construct {@link Student} objects.
     *
     * Do not use an instance of this class as an Abstract Factory, because its
     * constructor creates a student object that is populated by the builder
     * methods, and the build() method will just return this student object.
     * (See Joshua Bloch, Effective Java, 2nd ed., item 2, p. 15.)
     *
     * @see StudentExampleData
     */
    public static class Builder {
        private final Student student;
        
        public Builder() {
            student = new Student();
        }
        
        public Builder first(String first) {
            student.setFirstName(first);
            return this;
        }
        
        public Builder last(String last) {
            student.setLastName(last);
            return this;
        }
        
        public Builder number(String number) {
            student.setNumber(number);
            return this;
        }
        
        public Builder age(int age) {
            student.setAge(age);
            return this;
        }
        
        public Builder gpa(double gpa) {
            student.setGradePointAverage(gpa);
            return this;
        }
        
        public Student build() {
            return student;
        }
    }
}
