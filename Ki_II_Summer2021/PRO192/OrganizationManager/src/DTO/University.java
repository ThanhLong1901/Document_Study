
package DTO;


public class University extends Organization {
    public String name;
    
    public University(){
        
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }
    
    public void communicateByToTool(){
        System.out.println("in the university, people communicate by voice");
    }
    
    public void erroll(){
        System.out.println("The registration for enrollment is only valid "
                + "when the University has received all enrollment documents "
                + "and enrollment fees");
    }
    
    public void educate(){
        System.out.println("provide education at university standard");
    }
    
    
    @Override
    public String toString(){
        return "encourage the advancement and development of knowledge";
    }
    
}
