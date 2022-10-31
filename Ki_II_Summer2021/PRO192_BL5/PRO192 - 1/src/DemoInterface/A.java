/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoInterface;

/**
 *
 * @author elll
 */
public class A implements InterfaceDemo{

    @Override
    public void m1() {
        System.out.println("M1");    
    }

    @Override
    public void m2() {
        System.out.println("M2");
    }

    @Override
    public void m3() {
        System.out.println("M3");    
    }

    @Override
    public void m4() {
        System.out.println("M4");    
    }
    
}

class UseIt{
    public static void main(String[] args) {
        InterfaceDemo obj = new A();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        int s = InterfaceDemo.sqr(5);
        System.out.println("5x5=" + s);
    }
}
