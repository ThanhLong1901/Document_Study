/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanagement;


public class Person {
    private String people;
    private String name;
    private int age;
    
    public Person() {
        people = "";
        name = "";
        age = 0;
        
    }

    public Person(String people, String name, int age) {
        this.people = people;
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeople() {
        return people;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    

    
   

}
