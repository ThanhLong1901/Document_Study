
package workshop3;


public class Guitar {

    public String serialNumber;
    public int price;
    public String builder;
    public String model;
    public String backWood;
    public String topWood;
        

    public Guitar(){
        
    }

    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    
    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackWood() {
        return backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public void setTopWood(String topWood) {
        this.topWood= topWood;
    }
    
    
    public void createSound(){
        System.out.println("serialNumber: " + serialNumber );
        System.out.println("price: " + price);
        System.out.println("builder: " + builder);
        System.out.println("model: " + model);
        System.out.println("backWood: " + backWood);
        System.out.println("topWood: " + topWood);
    }
    
        
        
    
    
}
