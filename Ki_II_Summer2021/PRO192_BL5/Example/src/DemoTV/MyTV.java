/*
    int f1(ArrayList<TV> a, int x,String s){
    T	1. đếm và trả về số TV có size lớn giá trị x đã cho   
    T	2. đếm và trả về số TV có name chứa chuỗi s đã cho (không phân biệt chữ hoa thường)
    T	3. Tính và trả về phần nguyên tổng giá của các TV có size >x
    T	4. Tính và trả về tổng các size của TV có name chữa chuỗi s (không phân biệt chữ hoa thường)
    T	5. Tính và trả về phần nguyên của giá trung bình các TV có trong list
    T	6. Tính và trả về size của TV có giá gần với giá trị trung bình của list
    T	7. Đếm và trả về số TV có size nhỏ hơn x và tên không chứa chuỗi s
    T	8. Tính và trả về phần nguyên của giá trị size trung bình trong list a
    T	9. Tìm và trả về size phổ biến nhất trong list a
    T	10. Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho

void f2(ArrayList<TV> a, int x,String s){
    T	1. sort tất cả TV theo tăng dần của giá
    T	2. sort tất cả TV theo tăng dần của size-> name(tăng)-> price (giảm)
    T	3. sort tất cả TV trong list a thỏa mãn điều kiện size >=x
    T	4. Xóa bỏ TV đầu tiên của list mà có size >=x đã cho
    T	5. Xóa bỏ tất cả TV mà có name chứa s đã cho (Không phân biệt chữ hoa thường)
    T	6. Đảo ngược tất cả các TV trong list có size <=x các TV khác giữ nguyên
    T	7. Xóa bỏ TV đầu tiên có giá lớn thứ 2 trong list
	8. Xóa bỏ tất cả TV có giá lớn thứ 2 trong list
    T	9. Đổi vị trí TV có price lớn nhất với TV có price bé nhất
    T	10. Đổi vị trí TV có size lớn nhất và TV có size bé nhất
    T	11. Đổi vị trí TV có size lớn nhất cho TV có price lớn nhất nhất
	12. đổi chỗ vị trí TV có price lớn thứ 2 đầu tiên với TV có size bé nhất

String f3(ArrayList<TV> a, int x, String s){
    T	1. Tìm và trả về tên của TV có giá lớn nhất
    T	2. Tìm và trả về tên của TV có size lớn nhất
    T	3. Tìm và trả về tên của TV đầu tiên có price gần với giá trị trung bình của price trong list
    T	4. Tìm và trả về tên TV phổ biến nhất trong list
	5. Tìm và trả về tên của TV đầu tiên mà có size phổ biến nhất trong list
    T	6. Tìm và trả về tên của TV đầu tiên có size >=x và có tên chứa s đã cho	
*/
		
package DemoTV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyTV implements iTV{

    @Override
    public int f1(ArrayList<TV> a, int x, String s) {
        
        //1: đếm và trả về số TV có size lớn giá trị x đã cho     (ĐÃ XONG) (ĐÚNG)
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x){
                count++;
            }   
        }
        return count;
    }

//=================================================================================================

//        //2: đếm và trả về số TV có name chứa chuỗi s đã cho (không phân biệt chữ hoa thường)     (ĐÃ XONG)   (ĐÚNG)
//        int count = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getName().toUpperCase().contains(s.toUpperCase())){
//                count++;
//            }
//        }
//        return count;
//    }

//=================================================================================================

//        //3: Tính và trả về phần nguyên tổng giá của các TV có size > x     (ĐÃ XONG)     (ĐÚNG)
//        int sum = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getSize() > x){
//                sum += a.get(i).getPrice();
//            }
//        }
//        return sum;
//    }

//=================================================================================================

//        //4: Tính và trả về tổng các size của TV có name chữa chuỗi s (không phân biệt chữ hoa thường)   (ĐÃ XONG)  (ĐÚNG)
//        int sum = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getName().toLowerCase().contains(s.toLowerCase())){
//                sum = sum + a.get(i).getSize();
//            }
//        }
//        return sum;
//    }

//=================================================================================================

//        //5: Tính và trả về phần nguyên của giá trung bình các TV có trong list     (ĐÃ XONG)     (ĐÚNG)
//        double sum = 0;
//        int count = 0;
//        for (int i = 0; i < a.size(); i++) {
//            sum += a.get(i).getPrice();
//            count++;
//        }
//        return (int) sum/count;
//    }
        
//=================================================================================================

//        //6: Tính và trả về size của TV có giá gần với giá trị trung bình của list    (ĐÃ XONG)       (ĐÚNG)
//        int sum = 0;
//        for (int i = 0; i < a.size(); i++) {
//            sum = sum + a.get(i).getSize();
//        }
//        int average = sum / a.size();
//        
//        double[] min = new double[a.size()];
//        
//        for (int i = 0; i < a.size(); i++) {
//            min[i] = average - a.get(i).getPrice();
//        }
//        
//        double posi = (double)average;
//        double nega = (double) -average;
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(min[i] > 0){
//                if(posi > min[i]){
//                    posi = min[i];
//                }
//            }
//            else
//            {
//                if(nega < min[i]){
//                    nega = min[i];
//                }
//            } 
//        }
//        double z = 0;
//        if(posi < Math.abs(nega)){
//            z = posi;
//        }else{
//            z = nega;
//        }
//        
//        int j = 0;
//        for (j = 0; j < 10; j++) {
//            if(z + a.get(j).getPrice()  == average){
//                break;
//            }
//        }
//
//        return a.get(j).getSize();
//    }
        
//=================================================================================================
        
//        //7: Đếm và trả về số TV có size nhỏ hơn x và tên không chứa chuỗi s      (ĐÃ XONG)   (ĐÚNG)
//        int count = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getSize() < x){
//                if(!a.get(i).getName().contains(s)){
//                    count++;
//                }
//            }
//        }
//        return count;  
//    }

//=================================================================================================
      
//        //8: Tính và trả về phần nguyên của giá trị size trung bình trong list a    (ĐÃ XONG)     (ĐÚNG)
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < a.size(); i++) {
//            sum += a.get(i).getSize();
//            count++;
//        }
//        return (int) sum/count;
//    }
        
//=================================================================================================

//        //9: Tìm và trả về size phổ biến nhất trong list a    (ĐÃ XONG)   (ĐÚNG)
//        int[] count = new int[a.size()];
//        int max = 0;
//        for (int i = 0; i < a.size(); i++) {
//            for (int j = 0; j < i; j++) {
//                if(a.get(i).getSize() == a.get(j).getSize()){
//                    count[i]++;
//                }
//            }
//        }
//        max = count[0];
//        for (int i = 0; i < a.size(); i++) {
//            if(count[i] > max){
//                max = count[i];
//            }
//        }
//        int j = 0;
//        for ( j = 0; j < a.size(); j++) {
//            if(count[j] == max){
//                break;
//            }
//        } 
//        return a.get(j).getSize();
//    }

//=================================================================================================

//      //10: Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho   (ĐÃ XONG)   (ĐÚNG)
//        int[] min = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            min[i] = x - a.get(i).getSize();
//        }
//        double z = x;
//        for (int i = 0; i < a.size(); i++) {
//            if((z > min[i]) && (min[i] >= 0)){
//                z = min[i];
//            }
//        }
//        int j = 0;
//        for (j = 0; j < 10; j++) {
//            if(z + a.get(j).getSize()== x){
//                break;
//            }
//        }
//        return a.get(j).getSize();   
//    }
 
//================================================================================================
//================================================================================================
    
    @Override
    public void f2(ArrayList<TV> a, int x, String s) {
	//1. sort tất cả TV theo tăng dần của giá       (ĐÃ XONG)   (ĐÚNG)
        double temp = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if(a.get(i).price <= a.get(j).price){
                    temp = a.get(j).price;
                    a.get(j).price = a.get(i).price;
                    a.get(i).price = temp;
                }
            }   
        }
    }

//=================================================================================================
        
//	//2. sort tất cả TV theo tăng dần của size-> name(tăng)-> price (giảm)      (ĐÃ XONG)   (ĐÚNG)
//        for (int i = 0; i < a.size(); i++) 
//            for (int j = 0; j < a.size(); j++) {
//                boolean dc = false;
//                TV ii = a.get(i);
//                TV jj = a.get(j);
//                
//                if(ii.size <= jj.size){
//                    if(ii.size < jj.size)
//                        dc = true;
//                    else{   //Size bằng nhau
//                        if(ii.name.compareTo(jj.name) <= 0){
//                            if(ii.name.compareTo(jj.name) < 0)
//                                dc = true;
//                            else{   //Name bằng nhau
//                                if(ii.price >= jj.price){
//                                    if(ii.price > jj.price)
//                                        dc = true;
//                                }
//                                }
//                            }
//                        }
//                    }
//                if(dc){
//                a.set(i, jj);
//                a.set(j, ii);
//                }
//            }  
//    }

//=================================================================================================
        
//	//3. sort tất cả TV trong list a thỏa mãn điều kiện size >= x   (ĐÃ XONG)   (ĐÚNG)
//        for (int i = 0; i < a.size(); i++) {
//            for (int j = i+1; j < a.size(); j++){  
//                if(a.get(i).getSize() >= x && a.get(j).getSize() >= x){
//                    boolean dc = false;
//                    TV ii = a.get(i);
//                    TV jj = a.get(j);
//                
//                    if(ii.getSize() > jj.getSize()){
//                        dc = true;
//                    }
//                    if(dc){
//                        a.set(i, jj);
//                        a.set(j, ii);
//                    }
//                }
//            }
//        }
//    }
        
//=================================================================================================
        
//	//4. Xóa bỏ TV đầu tiên của list mà có size >= x đã cho     (ĐÃ XONG)   (ĐÚNG)
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).size >= x){
//                a.remove(i);
//                break;   
//        }
//        for (TV tv : a) {
//            System.out.println(tv);
//            }
//        }
//    }

//=================================================================================================

//	//5. Xóa bỏ tất cả TV mà có name chứa s đã cho (Không phân biệt chữ hoa thường)     (ĐÃ XONG)   (ĐÚNG)
//            for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getName().toLowerCase().contains(s.toLowerCase())){
//                a.remove(i);
//                  i--;
//            }
//        }
//    }

//=================================================================================================

//	//6. Đảo ngược tất cả các TV trong list có size <=x các TV khác giữ nguyên    (ĐÃ XONG)     (ĐÚNG)
//        ArrayList<TV> b = new ArrayList<>();
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getSize() <= x){
//                b.add(a.get(i));
//            }
//        }
//        
//        Collections.reverse(b);  
//        int k = 0;
//        for (int i = 0; i < a.size(); i++) {
//            if(a.get(i).getSize() <= x){
//                a.set(i, b.get(k++));
//            }
//        }
//        }
        
//=================================================================================================

//	//7. Xóa bỏ TV đầu tiên có giá lớn thứ 2 trong list     (ĐÃ XONG)   (ĐÚNG)
//        double max ;
//        double secondMax ;        
//        
//        if(a.get(0).getPrice() > a.get(1).getPrice()){
//            max = a.get(0).getPrice();
//            secondMax = a.get(1).getPrice();
//        }else{
//            max = a.get(1).getPrice();
//            secondMax = a.get(0).getPrice();
//        }
//        
//        for (int i = 2; i < a.size(); i++) {
//            if(a.get(i).getPrice() >= max){
//                secondMax = max;
//                max = a.get(i).getPrice();
//            }else if(a.get(i).getPrice() > secondMax){
//                secondMax = a.get(i).getPrice();
//            }
//        }
//        
//        int k;
//        for ( k = 0; k < a.size(); k++) {
//            if(secondMax == a.get(k).getPrice()){
//                break;
//            }
//        }
//        a.remove(k);
//    }

//=================================================================================================

	//8. Xóa bỏ tất cả TV có giá lớn thứ 2 trong list

//=================================================================================================
        
//	//9. Đổi vị trí TV có price lớn nhất với TV có price bé nhất    (ĐÃ XONG)   (ĐÚNG)
//        double min = a.get(0).getPrice(), max = a.get(0).getPrice(); 
//        for (int i = 0; i < a.size(); i++) {
//            if(max < a.get(i).getPrice()){
//                max = a.get(i).getPrice();
//            }
//        }
//        
//        int k,l;
//        for ( k = 0; k < a.size(); k++) {
//            if(max == a.get(k).getPrice()){
//                break;
//            }
//        }
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(min > a.get(i).getPrice()){
//                min = a.get(i).getPrice();
//            }
//        }
//        
//        for ( l = 0; l < a.size(); l++) {
//            if(min == a.get(l).getPrice()){
//                break;
//            }
//        }
//        
//        ArrayList<TV> b = new ArrayList<>();
//        b.add(a.get(k));
//        
//        a.set(k, a.get(l));
//        a.set(l, b.get(0));
//    }

//=================================================================================================

//	//10. Đổi vị trí TV có size lớn nhất và TV có size bé nhất      (ĐÃ XONG)   (ĐÚNG) 
//        int  max = a.get(0).getSize();
//        int min = a.get(0).getSize();
//        int k=0,l=0;
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(max < a.get(i).getSize()){
//                max = a.get(i).getSize();
//            }
//        }
//        
//        for (k = 0; k < a.size(); k++) {
//            if (max == a.get(k).getSize()) {
//                break;
//            }
//        }
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(min > a.get(i).getSize()){
//                min = a.get(i).getSize();
//            }
//        }
//        for (l = 0; l < a.size(); l++) {
//            if (min == a.get(l).getSize()) {
//                break;
//            }
//        }
//
//        ArrayList<TV> b = new ArrayList<>();
//        b.add(a.get(k));
//        
//        a.set(k, a.get(l));
//        a.set(l, b.get(0));
//    }

//=================================================================================================    
 
//	//11. Đổi vị trí TV có size lớn nhất cho TV có price lớn nhất nhất     (ĐÃ XONG)    (ĐÚNG)
//        int  max = a.get(0).getSize();
//        double Max = a.get(0).getPrice();
//        int k = 0, l = 0;
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(max < a.get(i).getSize()){
//                max = a.get(i).getSize();
//            }
//        }
//        
//        for (k = 0; k < a.size(); k++) {
//            if (max == a.get(k).getSize()) {
//                break;
//            }
//        }
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(Max < a.get(i).getPrice()){
//                Max = a.get(i).getPrice();
//            }
//        }
//        for (l = 0; l < a.size(); l++) {
//            if (Max == a.get(l).getPrice()) {
//                break;
//            }
//        }
//
//        ArrayList<TV> b = new ArrayList<>();
//        b.add(a.get(k));
//        
//        a.set(k, a.get(l));
//        a.set(l, b.get(0));
//}

//=================================================================================================    
    
//	//12. đổi chỗ vị trí TV có price lớn thứ 2 đầu tiên với TV có size bé nhất    
//        double max ;
//        double secondMax ;
//        double min = (double)a.get(0).getSize();
//
//        if(a.get(0).getPrice() > a.get(1).getPrice()){
//            max = a.get(0).getPrice();
//            secondMax = a.get(1).getPrice();
//        }else{
//            max = a.get(1).getPrice();
//            secondMax = a.get(0).getPrice();
//        }
//        
//        for (int i = 2; i < a.size(); i++) {
//            if(a.get(i).getPrice() >= max){
//                secondMax = max;
//                max = a.get(i).getPrice();
//            }else if(a.get(i).getPrice() > secondMax){
//                secondMax = a.get(i).getPrice();
//            }
//        }
//        
//        int k,l;
//        for ( k = 0; k < a.size(); k++) {
//            if(secondMax == a.get(k).getPrice()){
//                break;
//            }
//        }
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(min > (double)a.get(i).getSize()){
//                min = (double)a.get(i).getSize();
//            }
//        }
//        
//        for ( l = 0; l < 10; l++) {
//            if(min == (double)a.get(l).getSize()){
//                break;
//            }
//        }
//        
//        ArrayList<TV> b = new ArrayList<>();
//        b.add(a.get(k));
//        
//        a.set(k, a.get(l));
//        a.set(l, b.get(k)); 
//    }

//================================================================================================
//================================================================================================
      
    @Override
    public String f3(ArrayList<TV> a, int x, String s) {
	//1. Tìm và trả về tên của TV có giá lớn nhất       (ĐÃ XONG)   (ĐÚNG)
        double max = a.get(0).getPrice();
        for (int i = 0; i < a.size(); i++) {
            if(max < a.get(i).getPrice()){
                max = a.get(i).getPrice();
            }
        }
        int j = 0;
        for (j = 0; j < a.size(); j++) {
            if(a.get(j).getPrice()== max){
                break;
            }
        }
        return a.get(j).getName();
    }
    
       

//=================================================================================================

//	//2. Tìm và trả về tên của TV có size lớn nhất      (ĐÃ XONG)   (ĐÚNG)
//        int max = a.get(0).getSize();
//        
//        for (int i = 0; i < a.size(); i++) {
//            if(max < a.get(i).getSize()){
//                max = a.get(i).getSize();
//            }
//        }
//        int j = 0;
//        for (j = 0; j < a.size(); j++) {
//            if(a.get(j).getSize() == max){
//                break;
//            }
//        }
//        return a.get(j).getName();
//    }

//=================================================================================================

//	//3. Tìm và trả về tên của TV đầu tiên có price gần với giá trị trung bình của price trong list     (ĐÃ XONG)   (ĐÚNG)
//        double sum = 0;
//        for (int i = 0; i < a.size(); i++) {
//            sum = sum + a.get(i).getPrice();
//        }
//        
//        double average = sum/a.size();
//        double[] min = new double[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            min[i] = average - a.get(i).getPrice();
//        }
//        
//        double posi = average;
//        double nega = -average;
//        for (int i = 0; i < a.size(); i++) {
//            if(min[i] > 0){
//                if(posi > min[i]){
//                    posi = min[i];
//                }
//            }else{
//                if(nega < min[i]){
//                    nega = min[i];
//                }
//            } 
//        }
//        
//        double z = 0;
//        if(posi < Math.abs(nega)){
//            z = posi;
//        }else{
//            z = nega;
//        }
//        
//        int j = 0;
//        for (j = 0; j < 10; j++) {
//            if(z + a.get(j).getPrice()  == average){
//                break;
//            }
//        }     
//        return a.get(j).getName(); 
//    }

//=================================================================================================

//	//4. Tìm và trả về tên TV phổ biến nhất trong list      (ĐÃ XONG)   (ĐÚNG)
//        int count =0;
//        int[] arr = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            arr[i] = -1;
//        }
//        
//        for (int i = 0; i < a.size(); i++) {
//            count =1;
//            for (int j = i+1; j < a.size(); j++) {
//                if((arr[j] != 0) && a.get(i).getName() == a.get(i).getName()){
//                    count++;
//                    arr[j] = 0;
//                }
//            }
//            
//            if(arr[i] != 0){
//                arr[i] = count;
//            }
//        }
//        
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        
//        int j =0;
//        for (j = 0; j < a.size(); j++) {
//            if(arr[j] == max){
//                break;
//            }
//        }  
//        return a.get(j).getName();
//    }

//=================================================================================================

//	//5. Tìm và trả về tên của TV đầu tiên mà có size phổ biến nhất trong list      (ĐÃ XONG)  
//        int count =0;
//        int[] arr = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            arr[i] = -1;
//        }
//        for (int i = 0; i < a.size(); i++) {
//            count =1;
//            for (int j = i+1; j < a.size(); j++) {
//                if((arr[j] != 0) && (a.get(i).getSize() == a.get(j).getSize())){
//                    count++;
//                    arr[j] = 0;
//                }
//            }
//            if(arr[i] != 0){
//                arr[i] =count;
//            }
//        }
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        int j =0;
//        for (j = 0; j < a.size(); j++) {
//            if(arr[j] == max){
//                break;
//            }
//        }
//        return a.get(j).getName();
//    }
 
//=================================================================================================

//	//6. Tìm và trả về tên của TV đầu tiên có size >= x và có tên chứa s đã cho      (ĐÃ XONG)      (ĐÚNG)
//        int i = 0;     
//        for ( i = 0; i < a.size(); i++) {
//            if(a.get(i).getSize() >= x){
//                if(a.get(i).getName().contains(s)){
//                    i = i;
//                    break;
//                }else{
//                    return "Không có tv chứa " + s;                    
//                }
//                    
//            }
//            else{
//                    return "Không có tv nào >= x";
//                }  
//            }
//        return a.get(i).getName();  
//        }
 
    
    
}
        
class Using{
    static void display(ArrayList<TV>a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));       
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TV> ar = new ArrayList();
        MyTV my = new MyTV();
        System.out.print("Input number of TV: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) { 
            System.out.print("Input name TV " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Input size of TV " + (i + 1) + ": ");
            int size = Integer.parseInt(sc.nextLine());
            System.out.print("Input price of TV " + (i + 1) + ": ");
            double price = Integer.parseInt(sc.nextLine());
            ar.add(new TV(name, size, price));
        }
        int select = 0;
        int x;
        String s = "";

        do{
            System.out.println("");
            System.out.println("1: select test case f1");
            System.out.println("2: select test case f2");
            System.out.println("3: select test case f3");
            System.out.println("0: Quit");
            System.out.print("You Select: ");
            select = Integer.parseInt(sc.nextLine());
//            int x = 0;
//            String s = "";
            switch(select){
                case 1:
                    System.out.print("Input x value: ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.print("Input string s = ");
                    s = sc.nextLine();
                    System.out.println("Result f1(): " + my.f1(ar, x, s));
                    break;
                case 2:
                    System.out.print("Input x value: ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.print("Input String s = ");
                    s = sc.nextLine();
                    my.f2(ar, x, s);
                    Using.display(ar);
                    break;
                case 3:
                    System.out.print("Input x value: ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.print("Input string s = ");
                    s = sc.nextLine();
                    System.out.println("Result f3(): " + my.f3(ar, x, s));
                    break;
            }
            
        }while(select != 0);
    }
}
