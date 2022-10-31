/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoString;

import java.util.Scanner;

/**
 *
 * @author elll
 */
public class MyString implements iHW{

    @Override
    public int f1(String s) {
        //dạng thống kê
        /*
        1.Đếm xem trong chuỗi có bao nhiêu từ có độ dài lớn hơn 3
        2.Đếm xem trong chuỗi có bao nhiêu từ có chính xác 1 nguyên âm
        3.Đém xem trong chuỗi có bao nhiều từ không có nguyên âm
        4.Đếm xem trong chuỗi có bao nhiều từ có ít nhất 1 nguyên âm
        5.Đếm và trả về số từ trong chuỗi có nhiều nhất, ít nhất, chính xác không nguyên âm
        6.Đếm và trả về số từ trong chuooixc ó nhiều nhất, ít nhất, chinhs xác không nguyên âm viết hoa
        7.Tính và trả về tổng giá các ký tự là số trong chuỗi
        8.Tính và trả về tổng số xuất hiện trong chuỗi s
        9.Đếm và trả về số từ trong chuỗi thỏa mãn điều kiện a, b, c
            B1:Tách chuỗi thành các mảng có từ, stringtokenizer
            B2:Duyệt từng từ để xem từ đó có thỏa mãn điều kiện a, b, c không? 
        */
      
        
        String[] s1 = s.split("\\s+");
        int count = 0;
        for (int i = 0; i < s1.length; i++) {
            if(check (s1[i])){
            count++;
        }
            
            
        }
        return count;
        }
    boolean check(String s){
        return s.length() >= 3;
    }
    /*
    BTVN: định nghĩa và viết ra ít nhất 20 hàm check với các từ khác nhau
    */
    

    @Override
    public String f2(String s) {
        return "";
    }
    
}

class Using{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String s = ");
        String s = sc.nextLine();
        MyString my = new MyString();
        System.out.println("f1: " + my.f1(s));
//        System.out.println("f2: " + my.f2(s));
    }
           
}