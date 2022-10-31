//class HW{
//	int f1(ArrayList<Integer>a){ //(thống kê)
//		//1. tìm và trả về số phần tử lớn hơn giá trị trung bình trong list
//		//2. tính và tổng giá trị của các phần tử lớn hơn giá trị trung bình trong list
//		//3. Tính và trả về tổng các giá trị ở vị trí không phải là số nguyên tố 
//		//4. Tính và trả về (phần nguyên) số lớn nhất lớn hơn bao nhiêu lần so với số bé nhất
//		//5. a. xóa bỏ phần tử lớn nhất và bé nhất đầu tiên xuất hiện trong list, 
//		//   b. tính và trả về giá trị trung bình (phần nguyên) của list đó
//		//6. a. xóa bỏ tất cả phần tử lớn nhất và bé nhất xuất hiện trong list, 
//		//   b. tính và trả về giá trị trung bình (phần nguyên) của list đó
//		//7. Tính và trả về giá trị trung bình nửa đầu của list (không xét phần tử giữa nếu có)		
//		//8. a-tính giá trị trung bình của các phần tử lớn hơn giá trị trung bình của list
//		//	 b-tính giá trị trung bình của các phần tử nhỏ hơn giá trị trung bình của list
//		//   c-tính và trả về (phần nguyên) giá trị trung bình (a) lớn hơn giá trị trung bình (b)
//		//   bao nhiêu lần
//		//9. tìm và trả về giá trị có tần suất xuất hiện nhiều nhất trong list
//		//10. tìm và trả về (phần nguyên) giá trị trung bình của tần suất xuất hiện các số trong list
//		return 0;
//	}
//	void f2(ArrayList<Integer>a){ //sort - mặc định là tăng dần
//		//1. sort các phần tử nẳm ở nửa đầu của list (ko tính chính giữa) phía sau đứng im
//		//2. sort tất cả các phần tử có giá trị lớn hơn giá trị trung bình, các phần tử khác đứng im
//		//3. sort tất cả các phần tử có giá trị bé hơn giá trị trung bình, các phần tử khác đứng im
//		//4. sort tất cả các phần tử chẵn, các phần tử lẻ đứng im
//		//5. sort tất cả các phần tử thỏa mãn điều kiện (abc), các phần tử khác đứng im
//		
//		//6. reverse các phần tử nẳm ở nửa đầu của list (ko tính chính giữa) phía sau đứng im
//		//7. reverse tất cả các phần tử có giá trị lớn hơn giá trị trung bình, các phần tử khác đứng im
//		//8. reverse tất cả các phần tử có giá trị bé hơn giá trị trung bình, các phần tử khác đứng im
//		//9. reverse tất cả các phần tử chẵn, các phần tử lẻ đứng im
//		//10. reverse tất cả các phần tử thỏa mãn điều kiện (abc), các phần tử khác đứng im
//		
//		//11. delete các phần tử nẳm ở nửa đầu của list (ko tính chính giữa) phía sau đứng im
//		//12. delete tất cả các phần tử có giá trị lớn hơn giá trị trung bình, các phần tử khác đứng im
//		//13. delete tất cả các phần tử có giá trị bé hơn giá trị trung bình, các phần tử khác đứng im
//		//14. delete tất cả các phần tử chẵn, các phần tử lẻ đứng im
//		//15. delete tất cả các phần tử thỏa mãn điều kiện (abc), các phần tử khác đứng im
//		
//		//16. thay thế tất cả các phần tử bằng số nguyên tố lớn hơn hoặc bằng và gần với nó nhất
//		//17. thay thế tất cả các phần tử bằng ước số nguyên tố lớn nhất của nó.
//		//18. thay thế tất cả các phần tử bằng tổng các ước số của nó.
//		//19. thay thế tất cả các phần tử bằng số ngược với nó (123-->321)
//		//20. thay thế tất cả các phần tử bằng số thỏa mãn điều kiện (abc) bé hơn hoặc bằng và gần với nó nhất		
//	}
//	int f3(String src){
//	//1. Đếm và trả về trong chuỗi có bao nhiêu ký tự số <s123a2> - 4 số
//	//2. Đếm số và trả vè trong chuỗi có bao nhiêu số <s123a2> - 2 số
//	//3. Tính và trả về tổng các chữ số trong chuỗi - <s123a2> 8
//	//4. Tính và trả về tổng các số xuất hiện trong s <s123a2> - 125
//	//5. Tìm và trả về giá trị max (min) trong chuỗi <s123a2> - 123, 2
//	//6. Tìm và trả về số từ trong chuỗi thỏa mãn điều kiện abc
//	//7. Tính và trả về phần nguyên của giá trị trung bình của các số xuất hiện trong chuỗi <s12b3a2> ->5
//	//8. Tính và trả về tổng các số là nguyên tố có trong chuỗi <s12b3a5> -> 8
//	//9. Đếm và trả về số các số là nguyên tố có trong chuỗi <s12b3a5> -> 2
//	//10. Tìm và trả về số có tần suất xuất hiện lớn nhất trong chuỗi <s12b3 a5s1 b17 a5s 12b3a5>->5
//	return 0;
//	}
//	String f4(String src){
//	//1. đảo ngược tất cả các ký tự trong chuỗi  |abc12 ->21cba
//	//2. đảo ngược nửa đầu các ký tự của chuỗi không tính ký tự giữa |abc123456 --> 1cba23456
//	//3. đảo ngược tất cả các từ trong chuỗi |a1 a2 b3 c4 -> c4 b3 a2 a1
//	//4. đảo ngược nửa cuối các từ trong chuỗi ko tính từ ở giữa |a1 a2 b3 c4 -> a1 a2 c4 b3
//	//5. sort nửa đầu các từ trong chuỗi theo thứ tự tăng dần của từ điển (khong tinh tu chinh giữa) 
//	//cong hoa xa hoi chu nghia viet nam -> cong hoa hoi xa chu nghia viet nam
//	//6. sort tất cả các từ thỏa mãn điều kiện abc
//	//7. sort tất cả các ký tự không phải là space theo thứ tự tăng dần của ACSII code
//	//a1 b2 c4 -->12 4a bc
//	//8. xóa bỏ từ đầu tiên dài nhất trong chuỗi 
//	//cong hoa xa hoi12 chu nghia viet nam -> cong hoa xa chu nghia viet nam
//	//9. xóa bỏ từ đầu tiên (cuối cùng) thỏa mãn điều kiện abc
//	//10. thay thế từ có chứa ký tự số đầu tiên bằng "Hello"
//	//cong hoa xa12 hoi chu1 nghia2  --> cong hoa Hello hoi chu1 nghia2
//	return "";
//	}	
//}
//class TV{
//	String name;
//	int size;
//	double price;
//}
//interface iTV{
//	int f1(ArrayList<TV> a, int x,String s){
//		//1. đếm và trả về số TV có size lớn giá trị x đã cho
//		//2. đếm và trả về số TV có name chứa chuỗi s đã cho (không phân biệt chữ hoa thường)
//		//3. Tính và trả về phần nguyên tổng giá của các TV có size >x
//		//4. Tính và trả về tổng các size của TV có name chữa chuỗi s (không phân biệt chữ hoa thường)
//		//5. Tính và trả về phần nguyên của giá trung bình các TV có trong list
//		//6. Tính và trả về size của TV có giá gần với giá trị trung bình của list
//		//7. Đếm và trả về số TV có size nhỏ hơn x và tên không chứa chuỗi s
//		//8. Tính và trả về phần nguyên của giá trị size trung bình trong list a
//		//9. Tìm và trả về size phổ biến nhất trong list a
//		//10. Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho
//		return 0;
//	}
//	void f2(ArrayList<TV> a, int x,String s){
//		//1. sort tất cả TV theo tăng dần của giá
//		//2. sort tất cả TV theo tăng dần của size-> name(tăng)-> price (giảm)
//		//3. sort tất cả TV trong list a thỏa mãn điều kiện size >=x
//		//4. Xóa bỏ TV đầu tiên của list mà có size >=x đã cho
//		//5. Xóa bỏ tất cả TV mà có name chứa s đã cho (Không phân biệt chữ hoa thường)
//		//6. Đảo ngược tất cả các TV trong list có size <=x các TV khác giữ nguyên
//		//7. Xóa bỏ TV đầu tiên có giá lớn thứ 2 trong list
//		//8. Xóa bỏ tất cả TV có giá lớn thứ 2 trong list
//		//9. Đổi vị trí TV có price lớn nhất với TV có price bé nhất
//		//10. Đổi vị trí TV có size lớn nhất và TV có size bé nhất
//		//11. Đổi vị trí TV có size lớn nhất cho TV có price lớn nhất nhất
//		//12. đổi chỗ vị trí TV có price lớn thứ 2 đầu tiên với TV có size bé nhất
//	}
//	String f3(ArrayList<TV> a, int x, String s){
//		//1. Tìm và trả về tên của TV có giá lớn nhất
//		//2. Tìm và trả về tên của TV có size lớn nhất
//		//3. Tìm và trả về tên của TV đầu tiên có price gần với giá trị trung bình của price trong list
//		//4. Tìm và trả về tên TV phổ biến nhất trong list
//		//5. Tìm và trả về tên của TV đầu tiên mà có size phổ biến nhất trong list
//		//6. Tìm và trả về tên của TV đầu tiên có size >=x và có tên chứa s đã cho		
//		return "";		
//	}	
//}

package example;

public class Example {
    
}
