
package item;

import java.util.Scanner;


public class Vase extends Item{
        private  int height;
        private String material;

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

        
        
    public void input(){                       
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height: ");
        height = sc.nextInt();
        System.out.println("Input material: ");
        sc.nextLine();
        material = sc.nextLine();              
    }     
        
    public void output(){                   
        System.out.println("Height:\t" + height);
        System.out.println("Material:\t" + material);                           
    }
}


