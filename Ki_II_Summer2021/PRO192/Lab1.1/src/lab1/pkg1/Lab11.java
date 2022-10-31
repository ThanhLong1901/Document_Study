/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.pkg1;
import java.util.Scanner;
/**
 *
 * @author elll
 */
public class Lab11 {
    public static void ex1()
    {
        System.out.println("Hello Word");
    }
    public static void ex2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
    public static void ex3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        if (name == "Alice" || name == "Bob") {
            System.out.println("Hello " + name);
        } 
    }
    public static void ex4()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of element ");
        int x = input.nextInt();
        System.out.println("Enter element");
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < x; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }
    public static void ex5()
    {
         
    }
    public static void ex6()
    {
         
    }
    public static void ex7()
    {

         
    }
    public static void ex8()
    {
         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
         
    // TODO code application logic here
    }
    
}
