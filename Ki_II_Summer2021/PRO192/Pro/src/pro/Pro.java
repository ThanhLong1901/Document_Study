/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;


public class Pro {

 
    public static void main(String[] args) {
        Point p1 = new Point();     
        String str_p1 = p1.toString();
        System.out.println("Point 1: " + p1.toString());
        System.out.println("Start of Point 1: " + p1.checked); 
        
        p1.setX(34);
        p1.setY(50);
        System.out.println("Point 1 after setXY" + p1.toString());
        
        System.out.println("X = " + p1.getX());
        System.out.println("X = " + p1.getY());
                
        Point p2 = new Point(15,30);
        System.out.println("Point 2: " + p2.toString());
    }
    
}
