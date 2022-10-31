/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanagement;

/**
 *
 * @author elll
 */
public class PersonList {
    private Person[] list;
    private int count;
    
    public PersonList (int size) {
        list = new Person[size];
        count = 0;
    }
    
    public void insert(Person p) {
        list [count] = p;
        count++;
    }
    
    public void remove(String people) {
        
    }
    
    public Person find(String people) {
        return null;
    }
    
    public void update(String people) {
        
    }
}
