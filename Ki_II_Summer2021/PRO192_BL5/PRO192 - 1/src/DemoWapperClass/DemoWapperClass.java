/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoWapperClass;

/**
 *
 * @author elll
 */
public class DemoWapperClass {
    public static void main(String[] args) {
        int a = 5;          //a là variable
        Integer b = 10;     //b là object
        // b là 1 object, 10 là số, 1 object sẽ không trheer gán bằng một số từ số 10
        //hế thống sẽ tự động thêm vào các method, thuộc tính để chuyển nó thành obj sau đó gắn
        //cho đối b --> autoboxing
        System.out.println("Gia tri a = " + a);
        System.out.println("Cac thuoc tinh b: ");
        System.out.println("max cua kieu int: " + b.MAX_VALUE);
        Integer c = b*10;
        //1 obj sex khoon cos casc toasn tuwr + , -, %, / thông thường
        //Để thực hiện thì đầu tiên dùng unboxing (bỏ hết thuộc tính cũng như method);
        //chỉ lấy giá của nó (primitive datatype) sau đó nó sẽ thực hiện phép nhân thông thường
        //kết quả là được 1 số --> dừng cơ chế auto boxii để trả về 1 obj
        //Như vậy tuy theo bài toán, nếu bài tóa ncaanf tốc độ thì chúng ta nên dùng primitive
        //nếu bài toán nặng tính kỹ thuật thì chúng obj
    }
}
