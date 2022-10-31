
package Person;

public class Professor extends Person{
    String department;

    public Professor(String department, String name, String address, String birthDate, boolean gender) {
        super(name, address, birthDate, gender);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
}
