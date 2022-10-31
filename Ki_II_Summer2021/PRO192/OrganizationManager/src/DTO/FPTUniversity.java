
package DTO;



public class FPTUniversity extends University implements Role{
    public String address;
    
    public FPTUniversity(){
        
    }

    public FPTUniversity(int size, String address, String name) {
        super(size, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
     
    
    @Override
    public String toString(){
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }

   
    @Override
    public void createWorker(){
        System.out.println("providing human resources");
    }
    
}
