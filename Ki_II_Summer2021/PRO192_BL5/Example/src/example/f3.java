//  int f3(String src){
//	T   1. Đếm và trả về trong chuỗi có bao nhiêu ký tự số <s123a2> - 4 số
//	T   2. Đếm số và trả vè trong chuỗi có bao nhiêu số <s123a2> - 2 số
//	T   3. Tính và trả về tổng các chữ số trong chuỗi - <s123a2> 8
//	T   4. Tính và trả về tổng các số xuất hiện trong s <s123a2> - 125
//	T   5. Tìm và trả về giá trị max (min) trong chuỗi <s123a2> - 123, 2
//          6. Tìm và trả về số từ trong chuỗi thỏa mãn điều kiện abc
//	T   7. Tính và trả về phần nguyên của giá trị trung bình của các số xuất hiện trong chuỗi <s12b3a2> ->5
//	T   8. Tính và trả về tổng các số là nguyên tố có trong chuỗi <s12b3a5> -> 8
//	T   9. Đếm và trả về số các số là nguyên tố có trong chuỗi <s12b3a5> -> 2
//          10. Tìm và trả về số có tần suất xuất hiện lớn nhất trong chuỗi <s12b3 a5s1 b17 a5s 12b3a5>->5
//	return 0;
//	}
package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class f3 {
    
    static boolean SNT(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
//        //1 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(Character.isDigit(s.charAt(i))){
//                count++;
//            }
//        }
//        System.out.println(count);
        

//        //2 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        s = s.replaceAll("[^0-9]+", " ");
//        int count = 0;
//        s = s.trim();
//        String[] sub = s.split(" ");
//        for (String o : sub) {
//            count++;
//        }
//           System.out.println(count);
        

       
//        //3 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        int sum = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if(Character.isDigit(s.charAt(i))){
//                int num = Integer.parseInt(s.charAt(i)+"");
//                    sum = sum + num;             
//            }
//        }
//        System.out.println(sum);
//       

//        //4 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        s = s.replaceAll("[^0-9]+", " ");
//            s = s.trim();
//            int sum = 0;
//            String []str = s.split(" ");
//            for(String o: str){
//               int num = Integer.parseInt(o);
//               sum = sum +num;
//            }
//            System.out.println(sum);
        

//        //5 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        ArrayList<Integer> a = new ArrayList<>();
//        s = s.replaceAll("[^0-9]+", " ");
//        s = s.trim();
//        String []str = s.split(" ");
//        for (String o :str) {
//            a.add(Integer.parseInt(o));
//        }
//        int max = Collections.max(a);
//        int min = Collections.min(a);
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);


//        //7 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        s = s.replaceAll("[^0-9]+", " ");
//        int count = 0;
//        int sum = 0;
//        s = s.trim();
//        String[] sub = s.split(" ");
//        
//        for (String o : sub) {
//            int num = Integer.parseInt(o);
//            sum += num;
//            count++;
//        }
//           System.out.println((int)sum/count);


//        //8 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        s = s.replaceAll("[^0-9]+", " ");
//        s = s.trim();
//        int sum = 0;
//        int count = 0;
//        String []str = s.split(" ");
//        for(String o: str){
//            int num = Integer.parseInt(o);
//            if(SNT(num)){
//               sum = sum + num;
//               }
//            }
//            System.out.println(sum);


//        //9 ĐÃ XONG
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input: ");
//        String s = sc.nextLine();
//        s = s.replaceAll("[^0-9]+", " ");
//            s = s.trim();
//            int sum = 0;
//            int count = 0;
//            String []str = s.split(" ");
//            for(String o: str){
//               int num = Integer.parseInt(o);
//               if(SNT(num)){
//                   count++;
//               }
//            }
//        System.out.println(count);

    }
}
