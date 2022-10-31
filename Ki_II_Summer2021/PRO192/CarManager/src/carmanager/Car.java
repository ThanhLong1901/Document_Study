
package carmanager;


public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car(){
        Colour = null;
        EnginePower = 0;
        Convertible = false;
        ParkingBrake = false;
        
    }

    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
       

    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return ParkingBrake;
    }


    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginerPower(int EnginerPower) {
        this.EnginePower = EnginerPower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    } 
    
    public void pressStartButton(){
        System.out.println("You have pressed the start bustton");
    }
    
    public void pressAcceleratorButton(){
        System.out.println("You have presssed the Accelerator button");

    }


    
    public void output(){
        System.out.println("Colour:\t\t" + Colour );
        System.out.println("EnginePower:\t" + EnginePower);
        System.out.println("Convertible:\t" + Convertible);
        System.out.println("ParkingBrake:\t" + ParkingBrake);
        System.out.println("");


    }
}








    
    
    
              
