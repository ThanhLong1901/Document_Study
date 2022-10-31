/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class Teacher {

    String name;
    double salary;

    public Teacher() {
    }

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "\t" + salary;
    }
    
/*
Test1:
Enter Teacher name: Anton
Enter Teacher salary: 2500
1. TC = 1 - test getName()
3. TC = 2 - test setSalary()
3. TC = 3 - test toString()
Enter TC: 1
OUTPUT:
ANTON
*/
    
/*
Test2:
Enter Teacher name: Anton
Enter Teacher salary: 2500
1. TC = 1 - test getName()
3. TC = 2 - test setSalary()
3. TC = 3 - test toString()
Enter TC: 2
Enter new salary: 3700
OUTPUT:
3700.0
*/
    
/*
Test3: 
Enter Teacher name: Anton
Enter Teacher salary: 2500
1. TC = 1 - test getName()
3. TC = 2 - test setSalary()
3. TC = 3 - test toString()
Enter TC: 3
OUTPUT:
Anton	2500.0
*/
    
    
}
