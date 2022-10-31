/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanagement;


public class Student extends Person{
    String studentID;
    String majorField;

    public Student(String studentID, String majorField, String people, String name, int age) {
        super(people, name, age);
        this.studentID = studentID;
        this.majorField = majorField;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", " + studentID + ", " + majorField;
            }
    
    
    
   
}
