
package DTO;

public class BeeColony extends Colony implements Role{
    public String type;

    public BeeColony() {

    }

    public BeeColony(int size, String type, String place) {
        super(size, place);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
    
    
    @Override
    public String toString(){
        return "the colony’s type is " + type
                + ", size is about" + size
                + ", and the place is" + place;
    }
    
    
    @Override
    public void createWorker(){
        System.out.println("Worker bees perform all the work of the bees");
    }
}
