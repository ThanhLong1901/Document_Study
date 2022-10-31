
package DemoHidingMethod;

public class DemoHiding {
    public static void main(String[] args) {
        A a = new A();
//        a.m1(); //m1 in A
        a = new B();
//        a.m1(); //m1 in B
        B b = new B();
//        b.m1();
        System.out.println("a thuộc class A: " + (a instanceof B));
        System.out.println("a thuộc class A: " + (b instanceof A));
    }
}

class A{
    static void m1(){
        System.out.println("m1 in A");
    }
}

class B extends A{
    static void m1(){
        System.out.println("m1 in B");
    }
}
