
package Person;

public class Student extends Person{
    String studentId;
    String majorField;

    public Student(String studentId, String majorField, String name, String address, String birthDate, boolean gender) {
        super(name, address, birthDate, gender);
        this.studentId = studentId;
        this.majorField = majorField;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
