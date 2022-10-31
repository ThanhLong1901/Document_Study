package DemoCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] arg) {
        
//        HWCollection hw = new HWCollection();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size: ");
//        int size = sc.nextInt();
//        ArrayList<Integer> input = new ArrayList<>();
//        Random rd = new Random();
//        for (int i = 0; i < size; i++) {
//            input.add(rd.nextInt(100));
//        }
//        System.out.println("Day ban dau la " + input);
//        System.out.println("1, New array: " + hw.f1(input));
//        System.out.println("2, New array: " + hw.f2(input));
//       hw.f3(input);
//       System.out.println("4, New array: " + hw.f4(input));
//        System.out.println("5, New array: " + hw.f5(input));
//       hw.f6(input);

//        HashSet hs = new HashSet();
//        Random hsrd = new Random();
//        for (int i = 0; i < size; i++) {
//            hs.add(hsrd.nextInt(100));
//        }
//        System.out.println("Day ban dau la " + hs);
//        System.out.println("7, Sum: " + hw.f7(hs));
//        hw.f8(input);
//        System.out.println("9, Sum: " + hw.f9(input));
//        hw.f9(input);
        // treeset luyên tập theo 2 cách comparator và conparable
        //10. tạo ra một treeset lưu trữ một ds sinh viên (id string; name string, gpa int)
        // -> gpa giảm nếu cùng gpa tên tăng dần nếu cùng tên theo id tăng dần
        //11. viết treeset lưu trữ string integer double theo thứ tự
        //integer giảm ,string tăng, double giảm
        //vd 9 8 Daisy anna 11.9 3.2
        //12. viết treeset theo thứ tự lưu trữ string number(all)
        //string giảm number tăng vd elsa anna Micky 5.6 9 10.6



        //10 c2 done
//        TreeSet ss = new TreeSet();
//        ss.add(new student10("he15", "luan", 9));
//        ss.add(new student10("he134", "quang", 4));
//        ss.add(new student10("he124", "hung", 6));
//        ss.add(new student10("he43", "hoa", 8));
//        ss.add(new student10("he23", "anh", 9));
//        ss.add(new student10("he154", "luan", 3));
//        ss.add(new student10("he86", "hung", 6));
//        System.out.println("ss :" + ss); 

////        11c1 done
//        mysort11 ms = new mysort11();
//        TreeSet tr = new TreeSet(ms);
//        tr.add(10);
//        tr.add(9.9);
//        tr.add(20);
//        tr.add("Cat");
//        tr.add(1);
//        tr.add(5.8);
//        tr.add("fish");
//        tr.add("micky");
//        System.out.println("tr: " + tr);
         
        //12c1 lỗi
        Student2 ms = new Student2();
        TreeSet tr = new TreeSet(ms);
        tr.add(12);
        tr.add(9.9);
        tr.add(8);
        tr.add("Cat");
        tr.add(4);
        tr.add(5.8);
        tr.add("fish");
        tr.add("micky");
        System.out.println("tr: " + tr);

//        System.out.println("ss :" + tr);       
    }
}
