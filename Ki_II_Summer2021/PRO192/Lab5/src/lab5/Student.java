
package lab5;


class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int gpa;
    
    public Student(){
        
    }

    public Student(String id, String name, int gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGpa() {
        return gpa;
    }


    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + '}';
    }
    
    
    public int CompareTo1(Student student1){
        return this.getGpa().compareTo(student1.getGpa());
    }
   
    

    
}
