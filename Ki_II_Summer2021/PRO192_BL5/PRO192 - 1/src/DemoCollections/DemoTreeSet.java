
package DemoCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


//public class DemoTreeSet {
//    public static void main(String[] args) {
//        TreeSet ts = new TreeSet((o1,o2) -> {return 1;});
//        ts.add(new Student("HE15942", "Nguyen Van A", 20, 9.5));
//        ts.add(new Student("HE12451", "Nguyen Van B", 21, 8.5));
//        ts.add(new Student("HE12523", "Nguyen Van C", 19, 8.7));
//        ts.add(new Student("HE15522", "Nguyen Van D", 10, 8.5));
//        for (Object t : ts) {
//            System.out.println(t);
//        }
//    }
//}

public class DemoTreeSet{
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList();
        ar.add(new Student("HE15942", "Nguyen Van A", 20, 9.5));
        ar.add(new Student("HE12451", "Nguyen Van B", 21, 8.5));
        ar.add(new Student("HE12523", "Nguyen Van C", 19, 8.7));
        ar.add(new Student("HE15522", "Nguyen Van D", 10, 8.5));

        
        //sort list theo trật tuw nào đó //Q3
        //c1: sort truyền thống, bubble, interchange
        //c2: dùng framework
        //GPA giảm -> age giảm -> name tăng -> id tăng
    
        //c1:
        for(int i = 0; i < ar.size() - 1; i++)
            for (int j = 0; j < ar.size(); j++) {
                boolean dc = false;
                Student ii = ar.get(i);
                Student jj = ar.get(j);
                
                if(ii.gpa <= jj.gpa){
                    if(ii.gpa < jj.gpa)
                        dc = true;
                    else{   //GPA giống nhau
                        if(ii.age >= jj.age){
                            if(ii.age > jj.age)
                                dc = true;
                            else{   //Age giống nhau
                                if(ii.name.compareTo(jj.name) >= 0){
                                    if(ii.name.compareTo(jj.name) > 0)
                                        dc =true;
                                    else{   //Name giống nhau
                                        if(ii.id.compareTo(jj.id) <= 0){dc = true;}
                                    }
                                }
                            }
                        }
                    }
                }
                if(dc){
                  ar.set(i, jj);
                  ar.set(j, ii);
                }  
            }
   
     
//            //c2: dùng framwork
//            Collections.sort(ar, new Comparator<Student>(){
//                public int compare(Student s1, Student s2){
//                    return 1;   
//                }
//             });


            //c2.1b: lamdba expression
//            Collections.sort(ar, (Student s1, Student s2) -> {return 1;});
            
            
            //c2/2:
//            Collections.sort(ar);
            for (Student t : ar) {
                System.out.println(t);
        }
        }
                      
    }


class Student implements Comparable<Student>{
//class Student {
    String id;
    String name;
    int age;
    double gpa;
    
    //GPA giảm -> age giảm -> name tăng -> id tăng
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", mark=" + gpa + '}';
    }

//    public int compareTo(Student o) {
//        int kq = 0;
//        kq = -Double.compare(this.gpa, o.gpa);  //GPA giảm
//        if(kq == 0){
//            kq = Integer.compare(this.age, o.age);  //age giảm
//            if(kq == 0){
//                kq = this.name.compareTo(o.name);   //name tăng
//                if(kq == 0){
//                    kq = this.id.compareTo(o.id);   //id tăng
//                }
//            }
//        }
//        return kq;
//    }

    @Override
    public int compareTo(Student t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

