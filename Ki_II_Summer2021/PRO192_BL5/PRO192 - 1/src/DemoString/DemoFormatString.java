/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoString;

/**
 *
 * @author elll
 */
public class DemoFormatString {
    public static void main(String[] args) {
        int a = 10;
        float b = 15.5f;
        double c = 20.5;
        System.out.printf("a = %d, b = %5.2f, c = %g, a = %1$d",a,b,c);
    }
}
