
package mainstudent;
        


public class Teacher extends Person {
    
    public double salary;
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Salary\t\t:" + this.getSalary());
   }
            
}
