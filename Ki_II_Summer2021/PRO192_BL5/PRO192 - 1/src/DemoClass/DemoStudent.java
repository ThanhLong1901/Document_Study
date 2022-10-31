
package DemoClass;

public class DemoStudent {
    String name;
    int age;
    String id;
    boolean gender;

//    public DemoStudent() {
//        System.out.println("Ban da goi den constructor khong thong so");
//    }
//    
//    public DemoStudent(int x){
//        System.out.println("Ban da goi den constructor co kieu int");
//    }
//    
//    public DemoStudent(double x){
//        System.out.println("Ban da goi den constructor co kieu double");
//    }
    
    public DemoStudent(){
        
    }

    @Override
    public String toString() {
        return "abc";
    }
       
    
}

class Using{
    public static void main(String[] args) {
        byte x = 10;
        DemoStudent d = new DemoStudent();
        System.out.println("Gia tri mac dinh Age: " + d.age);
        System.out.println("Gia tri mac dinh ID: " + d.id);
        System.out.println("Gia tri mac dinh Name: " + d.name);
        System.out.println("Gia tri mac dinh Gender: " + d.gender);
        System.out.println("Thong tin cua obj: " + d);   //toString được kế thừa từ class Object
    }

}
