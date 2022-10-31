
package item;

import java.util.Scanner;


public class Item{
    protected int value;
    protected String creator;
    
    public Item(){         
        value = 0;       
        creator = "";     
    }
    
    public Item(int value, String creator){
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    
    public void input(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Input value: ");
        value = sc.nextInt();
        System.out.println("Input creator: ");
        sc.nextLine();
        creator = sc.nextLine();
    }    
    
    public void output(){                  
        System.out.println("Value:\t" + value);
        System.out.println("Creator:\t" + creator);
    }
} 

