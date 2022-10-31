
package item;


public class Status extends Item{
    private int weight;
    private String colour;

    public Status(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Status(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    
    
    public void input(){
    //use Scanner class to input fields
    }
    
    public void ouput(){
    //print fields out 
    }
    
    
}
