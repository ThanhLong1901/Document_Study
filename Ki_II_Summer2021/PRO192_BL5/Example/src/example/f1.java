//  int f1(ArrayList<Integer>a){ //(thống kê)
//      T	1. tìm và trả về số phần tử lớn hơn giá trị trung bình trong list
//	T	2. tính và tổng giá trị của các phần tử lớn hơn giá trị trung bình trong list
//		3. Tính và trả về tổng các giá trị ở vị trí không phải là số nguyên tố 
//	T	4. Tính và trả về (phần nguyên) số lớn nhất lớn hơn bao nhiêu lần so với số bé nhất
//		5. a. xóa bỏ phần tử lớn nhất và bé nhất đầu tiên xuất hiện trong list, 
//		   b. tính và trả về giá trị trung bình (phần nguyên) của list đó
//		6. a. xóa bỏ tất cả phần tử lớn nhất và bé nhất xuất hiện trong list, 
//		   b. tính và trả về giá trị trung bình (phần nguyên) của list đó
//	T	7. Tính và trả về giá trị trung bình nửa đầu của list (không xét phần tử giữa nếu có)		
//		8. 
//      T           a-tính giá trị trung bình của các phần tử lớn hơn giá trị trung bình của list
//      T           b-tính giá trị trung bình của các phần tử nhỏ hơn giá trị trung bình của list
//		   c-tính và trả về (phần nguyên) giá trị trung bình (a) lớn hơn giá trị trung bình (b)
//		   bao nhiêu lần
//		9. tìm và trả về giá trị có tần suất xuất hiện nhiều nhất trong list
//		10. tìm và trả về (phần nguyên) giá trị trung bình của tần suất xuất hiện các số trong list
//		return 0;
//	}
package example;

import java.util.ArrayList;
import java.util.Collections;

public class f1 {
    
    public static void main(String[] args) {
//        //1 ĐÃ XONG
//        int[] list = {1, 10, 19, 20, 9, 15, 2};
//        int sum = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum += list[i];
//        }
//        int count = 0;
//        int Sum = sum/(list.length);
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] > Sum){
//                count++;
//            }
//        }
//        System.out.println("Output: " + count);      


//        //2 ĐÃ XONG
//        int[] list = {1, 10, 19, 20, 9, 15, 2};
//        int sum = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum += list[i];
//        }
//        int ssum = 0;
//        int Sum = sum/(list.length);
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] > Sum){
//                ssum += list[i];
//            }
//        }
//        System.out.println("Output: " + ssum);
        


//        //4 ĐÃ XONG
//        int[] list = {1, 10, 19, 20, 9, 15, 2};
//        int max = list[0];
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] > max){
//                max = list[i];
//            }
//            
//        }
//        int min = list[0];
//        for (int j = 0; j < list.length; j++) {
//            if(list[j] < min){
//                min = list[j];
//            }
//        }
//        System.out.println("Output: " + max/min);
        


//        //7 ĐÃ XONG
//        int[] list = {1, 10, 19, 20, 9, 15, 2, 4};
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < (list.length)/2; i++) {
//            sum += list[i];
//            count++;
//        }
//        System.out.println("Output: " + sum/count);


//        //8a ĐÃ XONG
//        int[] list = {1, 10, 19, 20, 9, 15, 2, 4};
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum += list[i];
//            count++;
//        }
//        int Sum = sum/count;
//        int ssum = 0;
//        int ccount = 0;
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] > Sum){
//                ssum += list[i];
//                ccount++;
//            }  
//        }
//        System.out.println("Output: " + ssum/ccount);


//        //8b ĐÃ XONG
//        int[] list = {1, 10, 19, 20, 9, 15, 2, 4};
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < list.length; i++) {
//            sum += list[i];
//            count++;
//        }
//        int Sum = sum/count;
//        int ssum = 0;
//        int ccount = 0;
//        for (int i = 0; i < list.length; i++) {
//            if(list[i] < Sum){
//                ssum += list[i];
//                ccount++;
//            }  
//        }
//        System.out.println("Output: " + ssum/ccount);
        
        
        
    }
}
