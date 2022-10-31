
package DemoArbitrary;

public class DemoAP {
    //1
    int sum(int a, int b){  
        return a + b;
    }  
    
    //2
    int sum(int a, int b, int c){   
        return a + b +c;
    }
    
    //arbitrary parameter
    int Sum(int ...x){  
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
    }
    
    //3
    void swap(int a, int b){        //pass by value: a, b là kiểu int primitive  
        int x = a;
        a = b;
        b = x;
    }
    
    //4
    void swap(int []x){    
        int t = x[0];
        x[0] = x[1];
        x[1] = t;
    }
        
    //5
    void swap(myNumber my){     
        int t = my.x;
        my.x = my.y;
        my.y = t;
    }
    
    //6
    void swap1(Integer a, Integer b){
        Integer t = a;
        a = b;
        b = t;
    }
    
    public static void main(String[] args) {
        DemoAP d = new DemoAP();
        
//        System.out.println(d.sum(1, 2));                //1
//        
//        System.out.println(d.sum(1, 2, 3));             //2
//        
//        System.out.println(d.Sum(1, 2, 3, 4, 6, 10));   //arbitrary parameter
        
//        int a = 5, b = 3;     //3
//            System.out.printf("Truoc khi swap a = %d, b = %d\n", a, b);   
//            d.swap(a, b);
//            System.out.printf("Sau khi swap a = %d, b = %d\n", a, b);

//        int a = 5, b = 3;       //4
//        int []c = {a, b};
//            System.out.printf("Truoc khi swap a = %d, b = %d\n", a, b);    
//            d.swap(a, b);
//            System.out.printf("Sau khi swap a = %d, b = %d\n", c[0], c[1]);

//        int a = 5, b = 3;       //5
//        myNumber my = new myNumber();
//        my.x = a;
//        my.y = b;
//            System.out.printf("Truoc khi swap a = %d, b = %d\n", my.x, my.y);    
//            d.swap(a, b);
//            System.out.printf("Sau khi swap a = %d, b = %d\n", my.x, my.y);
                 
            Integer a = new Integer(5);          //6
            Integer b = new Integer(10);
            System.out.printf("before swap a = %d, b = %d", a, b);
            d.swap1(a, b);
            System.out.printf("after swap a = %d, b = %d", a, b);
    }
}   

class myNumber{     //5
    int x, y;
}



