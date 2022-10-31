/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoStatic;


public class A {
     static int x = 10; //static variable
     int y = 20;    //instance variable
     
}
class Using{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);    //instance variable
        System.out.println(A.x);    // truy xuất thông qua class name
        A.x = 30;
        A b = new A();
        System.out.println(b.x);
        b.x = 50;
        System.out.println(a.x);
    }
}
