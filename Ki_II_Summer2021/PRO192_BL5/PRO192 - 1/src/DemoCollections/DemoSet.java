/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollections;

import com.sun.javafx.css.Combinator;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author elll
 */    
//class MySort implements Comparator{
//    
//    //Int (giảm dần) --> Double (tăng dần)
//    @Override
//        public int compare(Object o1, Object o2) {
//            int kq = 0;
//            if((o1 instanceof Integer) && (o2 instanceof Double)) 
//                kq = -1;
//            
//            if((o1 instanceof Double) && (o2 instanceof Integer)) 
//                kq = 1;
//            
//            if((o1 instanceof Integer) && (o2 instanceof Integer)) 
//                kq = -Integer.compare((int)o1,(int)o2);
//            
//            
//            if((o1 instanceof Double) && (o2 instanceof Double)) 
//                kq = Double.compare((double)o1,(double)o2);
//       
//            return kq;   
//        }
//        
//    }
//
///*
//    BTVN: TreeSet có chauws 3 loại đối tượng thứ tự
//        1. Integer(tăng) --> String(giảm) --> Double(giảm)
//        2. String(tăng) --> Number(giảm)<Bao gồm Integer và Double>
//*/
//
//public class DemoSet {
//
//    public static void main(String[] args) {
////        MySort my = new MySort();
////        TreeSet ts = new TreeSet(my); 
//
////    Comparator com = new Comparator(){
////        @Override
////        public int compare(Object t, Object t1) {
////            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////        }
////        
////    };
//
////    TreeSet ts = new TreeSet(new MySort()); //anonymous object, real name class
//
////    TreeSet ts = new TreeSet(com); //anonymous class, real name object
//
////    TreeSet ts = new TreeSet(new Comparator(){
////        @Override
////        public int compare(Object o1, Object o2) {        
////
////            int kq = 0;
////            if((o1 instanceof Integer) && (o2 instanceof Double)) 
////                kq = -1;
////            
////            if((o1 instanceof Double) && (o2 instanceof Integer)) 
////                kq = 1;
////            
////            if((o1 instanceof Integer) && (o2 instanceof Integer)) 
////                kq = -Integer.compare((int)o1,(int)o2);
////            
////            
////            if((o1 instanceof Double) && (o2 instanceof Double)) 
////                kq = Double.compare((double)o1,(double)o2);
////       
////            return kq;   
////        }
////        
////    }); 
//    TreeSet ts = new TreeSet((o1, o2) -> {
//     int kq = 0;
//            if((o1 instanceof Integer) && (o2 instanceof Double)) 
//                kq = -1;
//            
//            if((o1 instanceof Double) && (o2 instanceof Integer)) 
//                kq = 1;
//            
//            if((o1 instanceof Integer) && (o2 instanceof Integer)) 
//                kq = -Integer.compare((int)o1,(int)o2);
//            
//            
//            if((o1 instanceof Double) && (o2 instanceof Double)) 
//                kq = Double.compare((double)o1,(double)o2);
//       
//            return kq;   
//        }});  //Lambda Expression
////        ts.add(5);
////        ts.add(20);
////        ts.add(1);
////        ts.add(10);
////        ts.add(19);
////        ts.add(10.5);   
////        ts.add(4.5);   
////        ts.add(8.5);   
////        System.out.println(ts); //TreeSet tự động sắp xếp các phần tử
////        HashSet hs = new HashSet();
////        hs.add(5);
////        hs.add("Hello");
////        hs.add(true);
////        hs.add(5);  //can not duplicate
////        hs.remove(5);
////        hs.contains(hs);
////        System.out.println(hs);
////        Iterator it = hs.iterator();
////        while(it.hasNext()){
////            Object obj = it.next();
////            System.out.print(obj + ", ");
////        }
////        System.out.println("");
////        for (Iterator i = hs.iterator(); i.hasNext();) {
////            Object next = i.next();
////            System.out.print(next + ", ");
////        }
////        System.out.println("");
////        for (Object h : hs) {
////            System.out.print(h + ", ");
////        }
////        System.out.println("");       
//    }



//    BTVN: TreeSet có chauws 3 loại đối tượng thứ tự
//        1. Integer(tăng) --> String(giảm) --> Double(giảm)
//        2. String(tăng) --> Number(giảm)<Bao gồm Integer và Double>


////1. Integer(tăng) --> String(giảm) --> Double(giảm)   (ĐÃ XONG)
//public class DemoSet{
//    public static void main(String[] args) {
//        MySort my = new MySort();
//        TreeSet ts = new TreeSet(my);
//        ts.add(10);
//        ts.add(9.9);
//        ts.add(20);
//        ts.add("Cat");
//        ts.add(1);
//        ts.add(5.8);
//        ts.add(10.5);
//        ts.add("Fish");
//        ts.add("Monkey");
//        System.out.println(" " + ts);
//    }
//
//}
//
//class MySort implements Comparator {
//    @Override
//    public int compare(Object o1, Object o2) {
//        int value = 0;
//        if ((o1 instanceof String) && (o2 instanceof Integer)) {
//            value = 1;
//        }
//        if ((o2 instanceof String) && (o1 instanceof Integer)) {
//            value = -1;
//        }
//        if ((o1 instanceof String) && (o2 instanceof Double)) {
//            value = -1;
//        }
//        if ((o2 instanceof String) && (o1 instanceof Double)) {
//            value = 1;
//        }
//        if ((o1 instanceof Integer) && (o2 instanceof Double)) {
//            value = -1;
//        }
//        if ((o2 instanceof Integer) && (o1 instanceof Double)) {
//            value = 1;
//        }
//        if ((o1 instanceof String) && (o2 instanceof String)) {
//            value = -((String) o1).compareTo((String) o2);
//        }
//        if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
//            value = -Integer.compare((int) o2, (int) o1);
//        }
//        if ((o1 instanceof Double) && (o2 instanceof Double)) {
//            value = Double.compare((double) o2, (double) o1);
//        }
//        return value;
//    } 
//}

//==========================================================================

//2. String(tăng) --> Number(giảm)<Bao gồm Integer và Double>   //Sai khi int < 10

public class DemoSet{
    public static void main(String[] args) {
        MySort my = new MySort();
        TreeSet ts = new TreeSet(my);
        ts.add(3);
        ts.add(3.9);
        ts.add(32);
        ts.add("Cat");
        ts.add(6);
        ts.add(5.8);
        ts.add(10.5);
        ts.add("Fish");
        ts.add("Monkey");
        System.out.println(" " + ts);
    }

}


class MySort implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int value = 0;
        if ((o1 instanceof String) && (o2 instanceof Integer)) {
            value = -1;
        }
        if ((o1 instanceof String) && (o2 instanceof Double)) {
            value = -1;
        }
        if ((o1 instanceof String) && (o2 instanceof String)) {
            value = ((String) o1).compareTo((String) o2);
        }
        if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
            value = -Integer.compare((int) o1, (int) o2);
        }
        if ((o1 instanceof Integer) && (o2 instanceof Double)) {
            value = -1;
        }
        if ( (o1 instanceof Integer)&&(o2 instanceof String) ) {
            value = 1;
        }
        if ((o1 instanceof Double) && (o2 instanceof Double)) {
            value = -Double.compare((double) o1, (double) o2);
        }
        if ((o1 instanceof Double)&&(o2 instanceof Integer) ) {
            value = 1;
        }
        if ((o1 instanceof Double)&&(o2 instanceof String) ) {
            value = 1;
        }
        if ((o1 instanceof Integer) && (o2 instanceof Double)) {
            value = -Double.compare((double)o2, (int) o1);
        }
        if ((o1 instanceof Double) && (o2 instanceof Integer)) {
            value = -Double.compare((double)o1, (int) o2);
        }
        return value;
    }
}