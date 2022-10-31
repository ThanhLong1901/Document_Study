
package CaseStudy3;

import java.util.Scanner;
import java.util.Vector;


public class Menu extends Vector<String>{
    public Menu() {
        super();
    }
    void addMenuItem(String s){
        this.add(s);
    }
    int getUserChoice() {
        for (String x : this) {
            System.out.println(x);
        }
        System.out.println("=================================");
        Scanner input = new Scanner(System.in);
        int value;
        System.out.println("You Choice:");
        value = input.nextInt();
        return value;
    }
}
