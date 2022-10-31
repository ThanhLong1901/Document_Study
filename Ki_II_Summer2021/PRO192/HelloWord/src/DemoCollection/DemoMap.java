/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author elll
 */
public class DemoMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put(true, 1);
        
        //update
        
        
//        HashMap hm1 = new HashMap();
////        hm.putAll(hm1);   
        System.out.println(hm);
        hm.put("true", 100);
        hm.put("three", 3);
        System.out.println(hm);
        Integer value = (Integer) hm.remove("three");
        System.out.println(hm);
//        //c2
//        Iterator it = hm.entrySet().iterator();
//        while(it.hasNext()){
//            Object next = it.next();    //lấy key
//            System.out.println("key = " + next + ": value = " + hm.get(next));
//        }
//        //c3
////        while(hm.keySet().)
//        for (Iterator i = hm.keySet().iterator(); i.hasNext();) {
//            Object key = i.next();
//            System.out.println("key = " + key + ": value = " + hm.get(key));    
//        }
//        
//        //c4
//        for (Object obj : hm.keySet()) {
//            System.out.println("key = " + obj + ": value = " + hm.get(obj));  
//        }
//        
//        //c5
//        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
//            String key = entry.getKey();
//            Integer value = entry.getValue();  
//        }
        
    }
}
