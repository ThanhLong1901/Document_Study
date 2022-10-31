/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoTV;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TIEN DUNG
 */
public class MyTV implements ITV{

    @Override
    public int f1(ArrayList<TV> a, int x, String s) {
        
         

        return 0;
    }
    
void check1_f1(ArrayList<TV> a, int x, String s){
    //1. đếm và trả về số TV có size lớn giá trị x đã cho
    int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x){
                count++;
            }
        }
//        return count;
}

void check2_f1(ArrayList<TV> a, int x, String s){
    //2. đếm và trả về số TV có name chứa chuỗi s đã cho (không phân biệt chữ hoa thường)
    int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().contains(s)){
                count++;
            }
        }
//        return count;
}

void check3_f1(ArrayList<TV> a, int x, String s){
    //3. Tính và trả về phần nguyên tổng giá của các TV có size >x
    int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x){
                sum = sum + (int)a.get(i).getPrice();
            }
        }
//        return sum;
}

void check4_f1(ArrayList<TV> a, int x, String s){
    //4. Tính và trả về tổng các size của TV có name chữa chuỗi s 
    int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().contains(s)){
                sum = sum + a.get(i).getSize();
            }
        }
//        return sum;
}

void check6_f1(ArrayList<TV> a, int x, String s){
    //6. Tính và trả về size của TV có giá gần với giá trị trung bình của list
    int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = sum + a.get(i).getSize();
        }
        int tb = sum / a.size();
        
        double[] min = new double[a.size()];
        
        for (int i = 0; i < a.size(); i++) {
            min[i] = tb - a.get(i).getPrice();
        }
        double duong = (double)tb;
        double am = (double)-tb;
        for (int i = 0; i < a.size(); i++) {
            if(min[i] > 0){
                if(duong > min[i]){
                    duong = min[i];
                }
            }else{
                if(am < min[i]){
                    am = min[i];
                }
            } 
        }
        
        double z = 0;
        if(duong < Math.abs(am)){
            z = duong;
        }else{
            z = am;
        }
        
        int j = 0;
        for (j = 0; j < 10; j++) {
            if(z + a.get(j).getPrice()  == tb){
                break;
            }
        }

//        return a.get(j).getSize();
}

void check7_f1(ArrayList<TV> a, int x, String s){
    //7. Đếm và trả về số TV có size nhỏ hơn x và tên không chứa chuỗi s
    int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() < x){
                if(!a.get(i).getName().contains(s)){
                    count++;
                }
            }
        }
         

//        return count;
}

		//8. Tính và trả về phần nguyên của giá trị size trung bình trong list a
void check8_f1(ArrayList<TV> a, int x, String s){
    //8. Tính và trả về phần nguyên của giá trị size trung bình trong list a
    int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = sum + a.get(i).getSize();
        }
    int tb = sum / a.size();
    
         

//        return tb;
}

void check9_f1(ArrayList<TV> a, int x, String s){
    //9. Tìm và trả về size phổ biến nhất trong list a
    int[] count = new int[a.size()];
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < i; j++) {
                if(a.get(i).getSize() == a.get(j).getSize()){
                    count[i]++;
                }
            }
        }
        max = count[0];
        for (int i = 0; i < a.size(); i++) {
            if(count[i] > max){
                max = count[i];
            }
        }
        int j = 0;
        for ( j = 0; j < a.size(); j++) {
            if(count[j] == max){
                break;
            }
        }
        
//        return a.get(j).getSize();
}

void check10_f1(ArrayList<TV> a, int x, String s){
    //10. Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho
    int[] min = new int[a.size()];
        
        for (int i = 0; i < a.size(); i++) {
            min[i] = x - a.get(i).getSize();
        }
        double z = x;
        for (int i = 0; i < a.size(); i++) {
            if((z > min[i]) && (min[i] >= 0)){
                z = min[i];
            }
        }
        int j = 0;
        for (j = 0; j < 10; j++) {
            if(z + a.get(j).getSize()== x){
                break;
            }
        }

//        return a.get(j).getSize();
        
}

    @Override
    public void f2(ArrayList<TV> a, int x, String s) {
        
    }

void check1_f2(ArrayList<TV> a, int x, String s){
    //1. sort tất cả TV theo tăng dần của giá
    for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                boolean dc = false;
                TV ii = a.get(i);
                TV jj = a.get(j);
                
                if(ii.getPrice() > jj.getPrice()){
                    dc = true;
                }
                if(dc){
                    a.set(i, jj);
                    a.set(j, ii);
                }
            }
        }
}

void check2_f2(ArrayList<TV> a, int x, String s){
    //1. sort tất cả TV theo tăng dần của giá
    for (int i = 0; i < a.size(); i++) {
            for (int j = i+1; j < a.size(); j++) {
                boolean dc = false;
                TV ii = a.get(i);
                TV jj = a.get(j);
                
                if(ii.getSize() >= jj.getSize()){
                    if(ii.getSize() > jj.getSize()){
                        dc = true;
                    }else{
                        if(ii.getName().compareTo(jj.getName()) >= 0){
                            if(ii.getName().compareTo(jj.getName()) > 0){
                                dc = true;
                            }else{
                                if(ii.getPrice() <= jj.getPrice()){
                                    dc = true;
                                }
                            }
                        }
                    }
                    
                }
                if(dc){
                    a.set(i, jj);
                    a.set(j, ii);
                }
            }
        }
}

void check4_f2(ArrayList<TV> a, int x, String s){
    //4. Xóa bỏ TV đầu tiên của list mà có size >=x đã cho
    for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() >= x){
                a.remove(i);
                break;
            }
        }
}

void check5_f2(ArrayList<TV> a, int x, String s){
    //5. Xóa bỏ tất cả TV mà có name chứa s đã cho (Không phân biệt chữ hoa thường)
    for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().contains(s)){
                a.remove(i);
                break;
            }
    }
}

void check6_f2(ArrayList<TV> a, int x, String s){
   //6. Đảo ngược tất cả các TV trong list có size <=x các TV khác giữ nguyên
    ArrayList<TV> b = new ArrayList<>();
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() <= x){
                b.add(a.get(i));
            }
        }
        
        Collections.reverse(b);
        
        int k = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() <= x){
                a.set(i, b.get(k++));
            }
        }
}

void check7_f2(ArrayList<TV> a, int x, String s){
//7. Xóa bỏ TV đầu tiên có giá lớn thứ 2 trong list
    double max ;
        double secondMax ;        
        
        if(a.get(0).getPrice() > a.get(1).getPrice()){
            max = a.get(0).getPrice();
            secondMax = a.get(1).getPrice();
        }else{
            max = a.get(1).getPrice();
            secondMax = a.get(0).getPrice();
        }
        
        for (int i = 2; i < a.size(); i++) {
            if(a.get(i).getPrice() >= max){
                secondMax = max;
                max = a.get(i).getPrice();
            }else if(a.get(i).getPrice() > secondMax){
                secondMax = a.get(i).getPrice();
            }
        }
        
        int k;
        for ( k = 0; k < a.size(); k++) {
            if(secondMax == a.get(k).getPrice()){
                break;
            }
        }
        a.remove(k);
}

void check8_f2(ArrayList<TV> a, int x, String s){
//8. Xóa bỏ tất cả TV có giá lớn thứ 2 trong list
        
}


void check9_f2(ArrayList<TV> a, int x, String s){
    //9. Đổi vị trí TV có price lớn nhất với TV có price bé nhất
    double min = a.get(0).getPrice() , max = a.get(0).getPrice();
        
        for (int i = 0; i < a.size(); i++) {
            if(max < a.get(i).getPrice()){
                max = a.get(i).getPrice();
            }
        }
        
        int k,l;
        for ( k = 0; k < a.size(); k++) {
            if(max == a.get(k).getPrice()){
                break;
            }
        }
        
        for (int i = 0; i < a.size(); i++) {
            if(min > a.get(i).getPrice()){
                min = a.get(i).getPrice();
            }
        }
        
        for ( l = 0; l < 10; l++) {
            if(min == a.get(l).getPrice()){
                break;
            }
        }
        
        ArrayList<TV> b = new ArrayList<>();
        b.add(a.get(k));
        
        a.set(k, a.get(l));
        a.set(l, b.get(0));
}

void check10_f2(ArrayList<TV> a, int x, String s){
//10. Đổi vị trí TV có size lớn nhất và TV có size bé nhất
        int  max = a.get(0).getSize();
        int min = a.get(0).getSize();
        int k=0,l=0;
        
        for (int i = 0; i < a.size(); i++) {
            if(max < a.get(i).getSize()){
                max = a.get(i).getSize();
            }
        }
        
        for (k = 0; k < a.size(); k++) {
            if (max == a.get(k).getSize()) {
                break;
            }
        }
        
        for (int i = 0; i < a.size(); i++) {
            if(min > a.get(i).getSize()){
                min = a.get(i).getSize();
            }
        }
        for (l = 0; l < a.size(); l++) {
            if (min == a.get(l).getSize()) {
                break;
            }
        }

        ArrayList<TV> b = new ArrayList<>();
        b.add(a.get(k));
        
        a.set(k, a.get(l));
        a.set(l, b.get(0));
}

void check11_f2(ArrayList<TV> a, int x, String s){
//11. Đổi vị trí TV có size lớn nhất cho TV có price lớn nhất nhất
    int  max = a.get(0).getSize();
        double min = a.get(0).getPrice();
        int k=0,l=0;
        
        for (int i = 0; i < a.size(); i++) {
            if(max < a.get(i).getSize()){
                max = a.get(i).getSize();
            }
        }
        
        for (k = 0; k < a.size(); k++) {
            if (max == a.get(k).getSize()) {
                break;
            }
        }
        
        for (int i = 0; i < a.size(); i++) {
            if(min > a.get(i).getPrice()){
                min = a.get(i).getPrice();
            }
        }
        for (l = 0; l < a.size(); l++) {
            if (min == a.get(l).getPrice()) {
                break;
            }
        }

        ArrayList<TV> b = new ArrayList<>();
        b.add(a.get(k));
        
        a.set(k, a.get(l));
        a.set(l, b.get(0));
}

void check12_f2(ArrayList<TV> a, int x, String s){
    //12. đổi chỗ vị trí TV có price lớn thứ 2 đầu tiên với TV có size bé nhất
        double max ;
        double secondMax ;
        double min = (double)a.get(0).getSize();
        
        
        if(a.get(0).getPrice() > a.get(1).getPrice()){
            max = a.get(0).getPrice();
            secondMax = a.get(1).getPrice();
        }else{
            max = a.get(1).getPrice();
            secondMax = a.get(0).getPrice();
        }
        
        for (int i = 2; i < a.size(); i++) {
            if(a.get(i).getPrice() >= max){
                secondMax = max;
                max = a.get(i).getPrice();
            }else if(a.get(i).getPrice() > secondMax){
                secondMax = a.get(i).getPrice();
            }
        }
        
        int k,l;
        for ( k = 0; k < a.size(); k++) {
            if(secondMax == a.get(k).getPrice()){
                break;
            }
        }
        
        for (int i = 0; i < a.size(); i++) {
            if(min > (double)a.get(i).getSize()){
                min = (double)a.get(i).getSize();
            }
        }
        
        for ( l = 0; l < 10; l++) {
            if(min == (double)a.get(l).getSize()){
                break;
            }
        }
        
        ArrayList<TV> b = new ArrayList<>();
        b.add(a.get(k));
        
        a.set(k, a.get(l));
        a.set(l, b.get(0));
}

    @Override
    public String f3(ArrayList<TV> a, int x, String s) {
        int count =0;
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = -1;
        }
        
        for (int i = 0; i < a.size(); i++) {
            count =1;
            for (int j = i+1; j < a.size(); j++) {
                if((arr[j] != 0) && a.get(i).getName() == a.get(i).getName()){
                    count++;
                    arr[j] = 0;
                }
            }
            
            if(arr[i] != 0){
                arr[i] = count;
            }
        }
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        int j =0;
        for (j = 0; j < a.size(); j++) {
            if(arr[j] == max){
                break;
            }
        }
  
        return a.get(j).getName();
    }  
void check1_f3(ArrayList<TV> a, int x, String s){
    //1. 1. Tìm và trả về tên của TV có giá lớn nhất
    double max = a.get(0).getPrice();
        
        for (int i = 0; i < a.size(); i++) {
            if(max < a.get(i).getPrice()){
                max = a.get(i).getPrice();
            }
        }
        int j = 0;
        for (j = 0; j < a.size(); j++) {
            if(a.get(j).getPrice() == max){
                break;
            }
        }
        
        
//        return a.get(j).getName();    
}  

void check2_f3(ArrayList<TV> a, int x, String s){
    //1. 1. Tìm và trả về tên của TV có size lớn nhất
    int max = a.get(0).getSize();
        
        for (int i = 0; i < a.size(); i++) {
            if(max < a.get(i).getSize()){
                max = a.get(i).getSize();
            }
        }
        int j = 0;
        for (j = 0; j < a.size(); j++) {
            if(a.get(j).getSize()== max){
                break;
            }
        }
        
        
//        return a.get(j).getName();
}

void check_f3(ArrayList<TV> a, int x, String s){
    //3. Tìm và trả về tên của TV đầu tiên có price gần với giá trị trung bình của price trong list
        double sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = sum + a.get(i).getPrice();
        }
        double tb = sum/ a.size();
        
        
        double[] min = new double[a.size()];
        
        for (int i = 0; i < a.size(); i++) {
            min[i] = tb - a.get(i).getPrice();
        }
        double duong = tb;
        double am = -tb;
        for (int i = 0; i < a.size(); i++) {
            if(min[i] > 0){
                if(duong > min[i]){
                    duong = min[i];
                }
            }else{
                if(am < min[i]){
                    am = min[i];
                }
            } 
        }
        
        double z = 0;
        if(duong < Math.abs(am)){
            z = duong;
        }else{
            z = am;
        }
        
        int j = 0;
        for (j = 0; j < 10; j++) {
            if(z + a.get(j).getPrice()  == tb){
                break;
            }
        }     
//        return a.get(j).getName();   
}

void check4_f3(ArrayList<TV> a, int x, String s){
    //4. Tìm và trả về tên TV phổ biến nhất trong list	
    int count =0;
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = -1;
        }
        
        for (int i = 0; i < a.size(); i++) {
            count =1;
            for (int j = i+1; j < a.size(); j++) {
                if((arr[j] != 0) && a.get(i).getName() == a.get(i).getName()){
                    count++;
                    arr[j] = 0;
                }
            }
            
            if(arr[i] != 0){
                arr[i] = count;
            }
        }
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        int j =0;
        for (j = 0; j < a.size(); j++) {
            if(arr[j] == max){
                break;
            }
        }
        
//        return a.get(j).getName();
}


void check5_f3(ArrayList<TV> a, int x, String s){
    //5. Tìm và trả về tên của TV đầu tiên mà có size phổ biến nhất trong list
		
        int count =0;
        int[] arr = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            arr[i] = -1;
        }
        
        for (int i = 0; i < a.size(); i++) {
            count =1;
            for (int j = i+1; j < a.size(); j++) {
                if((arr[j] != 0) && (a.get(i).getSize() == a.get(j).getSize())){
                    count++;
                    arr[j] = 0;
                }
            }
            
            if(arr[i] != 0){
                arr[i] =count;
            }
        }
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        int j =0;
        for (j = 0; j < a.size(); j++) {
            if(arr[j] == max){
                break;
            }
        }
  
//        return a.get(j).getName();
}

void check6_f3(ArrayList<TV> a, int x, String s){
    //6. Tìm và trả về tên của TV đầu tiên có size >=x và có tên chứa s đã cho
    int i = 0;
        
        for ( i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() >= x){
                if(a.get(i).getName().contains(s)){
                    i = i;
                    break;
                }else{
//                    return "Không có tv chứa " + s;                    
                }
                    
            }else{
//                    return "Không có tv nào >= x";
            }  
        }
  
//        return a.get(i).getName();  
}

}

class Using{
    static void display(ArrayList<TV>a){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <TV> ar = new ArrayList();
        MyTV my = new MyTV();
        System.out.print("input number of TV:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("input name of Tv " +(i+1)+ "=");
            String name = sc.nextLine();

            System.out.print("input size of Tv " +(i+1)+ "=");
            int size  = Integer.parseInt(sc.nextLine());

            System.out.print("input price of Tv " +(i+1)+ "=");
            double price  = Integer.parseInt(sc.nextLine());

            
            ar.add(new TV(name, size, price));
        }
        int select = 0;
        int x;
        String s="";
        do {            
            System.out.println("1: select test case f1 ");
            System.out.println("2: select test case f2 ");
            System.out.println("3: select test case f3 ");
            System.out.println("0. Quit.");
            select = Integer.parseInt(sc.nextLine());
            switch(select){
                case 1:
                    System.out.print("input x value ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.print("Input string s = ");
                    s = sc.nextLine();
                    System.out.println("Result f1:" + my.f1(ar,x,s) );
                    break;
                
                case 2:
                    System.out.print("input x value ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.print("Input string s = ");
                    s = sc.nextLine();
                    my.f2(ar,x,s);
                    Using.display(ar);
                    break;
                case 3:
                    System.out.print("input x value ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.print("Input string s = ");
                    s = sc.nextLine();
                    System.out.println("Result f3(): " + my.f3(ar,x,s));
                    break;
                    
            }
            
            
        } while (select != 0);
        
    }
}