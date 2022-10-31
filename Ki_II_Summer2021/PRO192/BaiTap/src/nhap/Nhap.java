/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhap;

import java.util.Scanner;

/*
 *
 * @author elll
 */
public class Nhap {
    public static Scanner scanner = new Scanner(System.in);
//Tăng dần    
//    public static void sort(int[] arr) 
//    {
//        int temp = arr[0];
//        for (int i = 0 ; i < arr.length - 1; i++) 
//        {
//            for (int j = i + 1; j < arr.length; j++) 
//            {
//                if (arr[i] > arr[j]) 
//                {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
//    }
    public static void main(String[] args) {
   

//Nhập 1 số nguyên, tính tổng các chữ số của số nguyên đó)
//            System.out.print("Nhập số nguyên n: ");
//            int n = scanner.nextInt();
//            int s = 0;
//            while( n != 0)
//            {
//            
//                s += n % 10;
//                n /= 10;
//            }
//            System.out.println("Tong cac chu so n: " + s);
       

//Nhập 1 số nguyên dưới dạng thập phân, đổi sang dạng nhị phân và in ra màn hình kết quả
//        System.out.print("Nhập n: ");
//        int n = scanner.nextInt();
//        int a = 0;
//        int kqchuyen = 0;
//	while( n > 0)
//	{
//	kqchuyen += (n % 2) * Math.pow(10, a);
//	++a;
//	n /= 2;
//	}
//        System.out.println("Dang nhi phan cua n: " + kqchuyen);


//Nhập vào 1 số nguyên, xác định đây là số dương hay âm (kết quả đưa ra True/False)
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        if(n > 0)
        {
            System.out.println("True");
        }
        else
            System.out.println("False");


//Cho 1 số nguyên, lưu các chữ số của số nguyên vào 1 mảng và in mảng đó ra màn hình
//        System.out.print("Nhập n: ");
//        int n = scanner.nextInt();
//        while(n != 0)
//        {
//        System.out.println(n % 10);
//        n /= 10;  
//        }


//Cho thông tin về năm, xác định có là năm nhuận hay không
//            System.out.print("Nhập số năm cần kiểm tra: ");
//            int n = scanner.nextInt();
//            boolean isLeap = false;
//            
//            if(n % 4 == 0 && n % 100 != 0)
//            {
//               isLeap = true;
//            }          
//            else if(n % 400 == 0)
//            {
//                isLeap = true;
//            }            
//            else
//            {
//                isLeap = false;
//            }
//            
//            if(isLeap == true)
//            {
//                System.out.println(n + " là năm nhuận");
//            }            
//            else
//            {
//                System.out.println(n + " không là năm nhuận");
//            }
            
            
//Nhập vào 1 mảng và sắp xếp tăng dần
//            System.out.println("Nhập số lượng phần tử của mảng:");
//            int n = scanner.nextInt();      
//            int [] arr = new int [n];
//            System.out.print("Nhập các phần tử của mảng: \n");
//            for (int i = 0; i < n; i++) 
//            {
//                System.out.printf("a[%d] = ", i);
//                arr[i] = scanner.nextInt();
//            }
//            sort(arr);
//            System.out.println("Dãy số được sắp xếp tăng dần: ");
//            for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");        
//            }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of element ");
//        int x = input.nextInt();
//        System.out.println("Enter element");
//        int[] array = new int[x];
//        for (int i = 0; i < x; i++) {
//            array[i] = input.nextInt();
//        }
//        int max = array[0];
//        for (int i = 1; i < x; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
    
    
    }
}


