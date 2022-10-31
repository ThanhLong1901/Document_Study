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
public interface DemoInterface {
    int x = 10; //constants
    public static final int y = 10;
    void m1();  //method không có body
//    public abstract void m2();
    
    static void m3(){}   //có body nhưng body bằng trống
        //khi không khai báo tường minh access modifer thì nó hiểu public
        
    public default void m4(){}
    
        
}

class interface A {
    void m5();
}

interface B extends A,DemoInterface{
    void m6();
}

class C{
    
}

class D extends  C implements A,DemoInterface,B{


    public void m5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m6() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Using{
    public static void main(String[] args) {
//        DemoInterface demo = new DemoInterface();   //Sai vì Interrface không có construsctor do đó không thể khời tạo được nó
    }
}

