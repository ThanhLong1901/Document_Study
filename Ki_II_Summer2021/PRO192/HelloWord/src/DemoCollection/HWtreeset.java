/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;

import java.util.Comparator;

/**
 *
 * @author Luan Miro
 */
//class student10 implements Comparable<student10> {//10b done
//
//    String id;
//    String name;
//    int gpa;
//
//    public student10(String id, String name, int gpa) {
//        this.id = id;
//        this.name = name;
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return "student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + "}" + "\n";
//    }
//
//    @Override
//    public int compareTo(student10 t) {
//        int value = 0;
//        if (gpa < t.gpa) {
//            value = 1;
//        }
//        if (gpa > t.gpa) {
//            value = -1;
//        }
//        if (gpa == t.gpa) {
//            if (name.compareTo(t.name) > 0) {
//                value = 1;
//            }
//            if (name.compareTo(t.name) < 0) {
//                value = -1;
//            }
//            if (name.compareTo(t.name) == 0) {
//                value = t.id.compareTo(id);
//            }
//        }
//        return value;
//    }
//}



//class array11 implements Comparable<array11> {//11b done
//
//    int number;
//    String name;
//    double gpa;
//
//    public array11(int number, String name, double gpa) {
//        this.number = number;
//        this.name = name;
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        return "array11{" + "number=" + number + ", name=" + name + ", gpa=" + gpa + "}\n";
//    }
//
//    @Override
//    public int compareTo(array11 t) {
//        int value = 0;
//        if (number < t.number) {
//            value = 1;
//        }
//        if (number > t.number) {
//            value = -1;
//        }
//        if (number == t.number) {
//            if (name.compareTo(t.name) > 0) {
//                value = 1;
//            }
//            if (name.compareTo(t.name) < 0) {
//                value = -1;
//            }
//            if (name.compareTo(t.name) == 0) {
//                if (gpa < t.gpa) {
//                    value = -1;
//                }
//                if (gpa > t.gpa) {
//                    value = 1;
//                }
//                if (gpa == t.gpa) {
//                    value = 0;
//                }
//            }
//        }
//        return value;
//    }
//}

//class mysort11 implements Comparator {//11a done
//
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
//            value = ((String) o1).compareTo((String) o2);
//        }
//        if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
//            value = Integer.compare((int) o2, (int) o1);
//        }
//        if ((o1 instanceof Double) && (o2 instanceof Double)) {
//            value = Double.compare((double) o2, (double) o1);
//        }
//        return value;
//    }
//}

class Student2 implements Comparator {//12a

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
            value = -((String) o1).compareTo((String) o2);
        }
        if ((o1 instanceof Integer) && (o2 instanceof Integer)) {
            value = Integer.compare((int) o1, (int) o2);
        }
        if ((o1 instanceof Integer) && (o2 instanceof Double)) {
            value = -1;
        }
        if ( (o1 instanceof Integer)&&(o2 instanceof String) ) {
            value = 1;
        }
        if ((o1 instanceof Double) && (o2 instanceof Double)) {
            value = Double.compare((double) o1, (double) o2);
        }
        if ((o1 instanceof Double)&&(o2 instanceof Integer) ) {
            value = 1;
        }
        if ((o1 instanceof Double)&&(o2 instanceof String) ) {
            value = 1;
        }
        if ((o1 instanceof Integer) && (o2 instanceof Double)) {
            double x = 1.0*(int) o1;
            value = Double.compare((double)x, (double) o1);
        }
        if ((o1 instanceof Double) && (o2 instanceof Integer)) {
            double x = 1.0*(int) o2;
            value = Double.compare((double)o1, (double) x);
        }
        return value;
    }
}
