//  String f4(String src){
//	T   1. đảo ngược tất cả các ký tự trong chuỗi  |abc12 ->21cba
//	T   2. đảo ngược nửa đầu các ký tự của chuỗi không tính ký tự giữa |abc123456 --> 1cba23456
//	T   3. đảo ngược tất cả các từ trong chuỗi |a1 a2 b3 c4 -> c4 b3 a2 a1
//	T   4. đảo ngược nửa cuối các từ trong chuỗi ko tính từ ở giữa |a1 a2 b3 c4 -> a1 a2 c4 b3
//          5. sort nửa đầu các từ trong chuỗi theo thứ tự tăng dần của từ điển (khong tinh tu chinh giữa) 
//          cong hoa xa hoi chu nghia viet nam -> cong hoa hoi xa chu nghia viet nam
//          6. sort tất cả các từ thỏa mãn điều kiện abc
//          7. sort tất cả các ký tự không phải là space theo thứ tự tăng dần của ACSII code
//          a1 b2 c4 -->12 4a bc
//          8. xóa bỏ từ đầu tiên dài nhất trong chuỗi 
//          cong hoa xa hoi12 chu nghia viet nam -> cong hoa xa chu nghia viet nam
//          9. xóa bỏ từ đầu tiên (cuối cùng) thỏa mãn điều kiện abc
//          10. thay thế từ có chứa ký tự số đầu tiên bằng "Hello"
//          cong hoa xa12 hoi chu1 nghia2  --> cong hoa Hello hoi chu1 nghia2
//	}	

package example;

import java.util.Scanner;

public class f4 {
//    //1 ĐÃ XONG
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input String s = ");
//        String s = sc.nextLine();
////        //C1
////        String s1 = new StringBuffer(s).reverse().toString();
////        System.out.println("Output: " + s1);
//
//        //C2
//        String[] s1 = s.split(" ");
//        for (int i = s1.length - 1; i >= 0 ; i--) {
//            System.out.print(s1[i] + " ");   
//        }
//    }
    
    
//    //2 ĐÃ XONG
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input String s = ");
//        String s = sc.nextLine();
//        char[] ch = s.toCharArray();
//        String s1 ="";
//        String s2 ="";
//        for (int i = (int)(ch.length / 2) - 1 ; i >= 0; i--) {
//            s1 = s1 + ch[i];
//        }
//        for (int i = (int)(ch.length / 2 ); i < ch.length; i++) {
//            s2 = s2 + ch[i];
//        }
//        System.out.println(s1+s2);   
//    }
    
    
//    //3 ĐÃ XONG
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input String s = ");
//        String s = sc.nextLine();
//        String [] s1 = s.split(" ");
//        String s2 = "";
//        for (int i = s1.length - 1; i >=0; i--) {
//            s2 = s2 + s1[i] + " ";    
//        }
//        System.out.println(s2);
//    }
    
    
//    //4 ĐÃ XONG
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input String s = ");
//        String s = sc.nextLine();
//        String [] s1 = s.split(" ");
//        String s0 = "";
//        String s2 = "";
//        if(s1.length % 2 ==0){
//        for (int i = 0; i < (s1.length/2); i++) {
//            s0 = s0 + s1[i] + " ";
//        }
//        for (int i = s1.length - 1; i >= s1.length/2; i--) {
//            s2 = s2 + s1[i] + " ";    
//        }
//        System.out.println(s0 + s2);
//    }
//        else{
//             for (int i = 0; i <= (s1.length/2); i++) {
//            s0 = s0 + s1[i] + " ";
//        }
//        for (int i = s1.length - 1; i > s1.length/2; i--) {
//            s2 = s2 + s1[i] + " ";    
//        }
//        System.out.println(s0 + s2);
//        }
//    }
    
        
        
}

    




