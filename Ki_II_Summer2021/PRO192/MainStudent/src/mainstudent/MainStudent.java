
package mainstudent;


public class MainStudent {

 
    public static void main(String[] args) {
        System.out.println("Welcome to FPT University");
        System.out.println("");
       
        
        Student studentObj = new Student();
        Teacher teacherObj = new Teacher();
        
        studentObj.setName("Thành Long");
        studentObj.setCode("SV20");
        studentObj.setScore(8.9);
        studentObj.setYear(2001);      
        studentObj.showInfo();
        
        teacherObj.setName("Thu Hiền");
        teacherObj.setCode("GV90");
        teacherObj.setYear(1990);
        teacherObj.setSalary(8000000);
        teacherObj.showInfo();
        
        
       
          
    
    
    
    }
    
}
