
package sinhvien;

import java.util.Scanner;


//public class SinhVien {
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        School school = new School();
//
//        school.getStudent20YearOld();
//
//        school.countStudent23YearOldInDN();
//    }
class A {
                   public int i;  
                   private int j;
               }    

               class B extends A {
                   void display() {
                       super.j = super.i + 1;
                     System.out.println(super.i + " " + super.j);
                  }
}    

        class inheritance {
            public static void main(String args[]) {
                  B obj = new B();
                  obj.i=1; obj.j=2;                   
                  obj.display();     
              }
         }
    
