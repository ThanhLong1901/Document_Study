
package sinhvien;

public class Student {
    private String name;
    private int age;
    private String hometown;
    private String classStudent;

    public Student(String name, int age, String homewtown, String classStudent) {
        this.name = name;
        this.age = age;
        this.hometown = homewtown;
        this.classStudent = classStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHomewtown() {
        return hometown;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomewtown(String homewtown) {
        this.hometown = homewtown;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }
    
    
    public String showInfor(){
        return "\t\tStudent" + "\nName:\t" + name + "\nAge:\t" + age + "\nHometown:\t"
                + hometown;
    }

    Object getHometown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
