
package demo_Collection;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class UsingCollection {
    public static void main(String[] args) {
        HWCollection hw = new HWCollection();
        int size = 10;
        
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> input = new ArrayList<>();    
        
        Random rd = new Random();
        
        for (int i = 0; i < size; i++){
            System.out.print("Day so la:\t4");
            Integer x = s.nextInt();
            input.add(rd.nextInt(100));           
        }
           
            

    }
    
}
