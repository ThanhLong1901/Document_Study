/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HWCollection {

    public static boolean checkPrime(int a) {
        if (a < 2) {
            return false;
        }
        if (a >= 2) {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void SelectSort(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n - 1; i++) {
            int index_Min = i;
            for (int j = i + 1; j < n; j++) {
                if (a.get(j) < a.get(index_Min)) {
                    index_Min = j;
                }
            }
            int temp = a.get(index_Min);
            a.set(index_Min, a.get(i));
            a.set(i, temp);
        }
        System.out.println("New array:" + a);
    }

    public void InsertSort(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j++) {
                if (a.get(j) < a.get(j - 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j - 1));
                    a.set(j - 1, temp);
                }
            }
        }
        System.out.println(a);
    }

    public ArrayList<Integer> f1(ArrayList<Integer> a) {

        for (int i = 0; i < a.size(); i++) {
            if (checkPrime(a.get(i)) == true) {
                a.remove(i);
            }
        }
        return a;
    }

    public ArrayList<Integer> f2(ArrayList<Integer> b) {
        int n = b.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (b.get(j).compareTo(b.get(j + 1)) > 0) {
                    int a = b.get(j);
                    b.set(j, b.get(j + 1));
                    b.set((j + 1), a);
                }
            }
        }
        return b;
    }

    public void f3(ArrayList<Integer> a) {
        Scanner sc = new Scanner(System.in);
        int n = a.size();
        int indexStart, indexEnd;
        do {
            System.out.print("Start: ");
            indexStart = sc.nextInt();
            System.out.print("End: ");
            indexEnd = sc.nextInt();
        } while (indexEnd < indexStart || indexStart < 0 || indexEnd >= n);
        ArrayList b = new ArrayList();
        for (int i = indexStart; i < indexEnd; i++) {
            b.add(a.get(i));
        }
        System.out.println("Mang moi: " + f2(b));
    }

    public ArrayList<Integer> f4(ArrayList<Integer> a) {
        if (a.size() < 10) {
            System.out.println("size of array must be >= 10");
            return null;
        } else {
            int max = a.get(0);
            int index = 0;
            for (int i = 1; i < a.size(); i++) {
                if (a.get(i) > max) {
                    max = a.get(i);
                    index = i;
                }
            }
            a.add(index, 100);
            return a;
        }
    }

    public ArrayList<Integer> f5(ArrayList<Integer> a) {
        int site = a.size();
        if (site < 9) {
            System.out.println("Số phần tử trong mảng phải >= 10");
            return null;
        }
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < site; i++) {
            if (i < 5) {
                newList.add(a.get(i));
                continue;
            }
            if (i == 5) {
                newList = f2(newList);
            }
            if (i > (site - 6)) {
//                System.out.println("i = " + i + ", site = " + site + "ct = " + ((site - i) ));
                newList.add(a.get(2 * site - i - 6));
                continue;
            }
            newList.add(a.get(i));
        }
        return newList;
    }

    public static int UNTLN(int a) {
        int max = 2;
        if (a == 1) {
            return -1;
        }
        for (int i = a; i >= 2; i--) {
            if (checkPrime(i) == true) {
                if (a % i == 0) {
                    max = i;
                    break;
                }
            }
        }
        return max;
    }

    public void f6(ArrayList<Integer> a) {
        int n = a.size();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            c.add(i, UNTLN(a.get(i)));
        }
        System.out.println(c);
    }

    public int f7(HashSet a) {
        int sum = 0;
        ArrayList<Integer> l = new ArrayList<>(a);
        for (int i = 0; i < a.size(); i++) {
            if (checkPrime(l.get(i)) == true) {
                sum += l.get(i);
            }
        }
        return sum;
    }

    public void f8(ArrayList<Integer> a) {
        HashSet b = new HashSet();
        for (Integer value : a) {
            b.add(value);
        }
        System.out.println(b);
    }

    public void f9(ArrayList<Integer> a) {
        int sum = 0; int i = a.size()-1;
        int count = 0;
        ArrayList<Integer> c = new ArrayList<>();
        c = f2(a);
        System.out.println("sort: "+c);
        int max = c.get(i);
        do{
           if(max == c.get(i)){
               sum+=max;
               i--;
           }else{
               max = c.get(i);
               count ++;
           }
            
        }while(count != 2);
        System.out.println("sum: "+sum);
    }

}
