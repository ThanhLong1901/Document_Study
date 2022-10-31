/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoBlockCode;

/**
 *
 * @author elll
 */
public class A {
    A(){
        System.out.println("Ban da goi den cs A1");
    }
    {
        System.out.println("Day la none static block code A2");
    }
    static{
        System.out.println("Day la stactic block clode A3");
    }
}

class B extends A{
    //Xây dựng class cũng có cs, none static block code, static block code
    B(){
        System.out.println("Ban da goi den cs B1");
    }
    {
        System.out.println("Day la none static block code B2");
    }
    static{
        System.out.println("Day la static block code B3");
    }
    
}

class C extends B{
    //Xây dựng class cũng có cs, none static block code, static block code
    C(){
        System.out.println("Ban da goi den cs C1");
    }
    {
        System.out.println("Day la none static block code C2");
    }
    static{
        System.out.println("Day la static block code C3");
    }
}

class D extends C{
    //Xây dựng class cũng có cs, none static block code, static block code
    D(){
        System.out.println("Ban da goi den cs D1");
    }
    {
        System.out.println("Day la none static block code D2");
    }
    static{
        System.out.println("Day la static block code D3");
    }
}

class Using{
    public static void main(String[] args) {
        A a = new A();
        System.out.println("-------------");
        a = new A();
        a = new B();
        a = new C();
        a = new D();
//        C c = new C();
        
//        SBCA -> NSBCA -> CSA -> NSBCA -> CSA
//                NSBCA -> CSA
//                SBCS -> NSBCA -> CSA -> NSBCB -> CSB
//                SBCB -> NSBCA -> CSA -> NSBCB -> CSB -> NSBCC -> CSC
//                NSBCA -> CSA -> NSBCB -> CSB -> NSBCC
    }
}
