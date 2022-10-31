
package sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Student> student;

    public School() {
        this.student = new ArrayList<>();
    }
    
    public void add(Student student){
        this.student.add(student);
    }
    
    public List<Student> getStudent20YearOld() {
        return this.student.stream().filter(student -> student.getAge() == 20).collect(Collectors.toList());
    }

    public long countStudent23YearOldInDN() {
        return this.student.stream().filter(student -> student.getAge() == 23 && student.getHometown().equals("DN")).count();
    }


    
    
}


