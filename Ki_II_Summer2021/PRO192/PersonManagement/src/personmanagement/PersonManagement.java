/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanagement;


public class PersonManagement {


    public static void main(String[] args) {
        Person p = new Person();
        p.setPeople("000123");
        p.setName("ABC");
        p.setAge(10);
        
        
        Person p2 = new Person("000124", "DER", 13);
        Person p3 = new Person("000125", "AFC", 9);
        
        Person[] list = new Person[10];
        list[0] = new Person ("000123", "ABC", 10);
        list[1] = new Person ("000124", "DER", 13);
        list[2] = new Person ("000125", "AFC", 9);
        
        
        Student s2 = new Student("S001", "SE", "0012123", "ABC", 18);
        System.out.println(s2.toString());
      
        
        
        
        System.out.println(p.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    
    
}
