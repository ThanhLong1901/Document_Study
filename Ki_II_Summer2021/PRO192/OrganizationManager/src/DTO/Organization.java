
package DTO;


abstract class Organization {
    public int size;
    
    public Organization(){
        
    }
    
    public Organization(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
    public void communicateByTool(){
        
    }

    
    @Override
    public String toString() {
        return "the organization's size is " + size;
    }
    
    
    
}
