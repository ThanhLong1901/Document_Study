
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    + Method named f1: remove all Fans iin the list 'a' which code start with the given code
    + Method named f2: count and return the number of Fan in the list"a" which price is less than or equals to given price
    + Method named f3: move all fans which are in the list :a: and have orice is greater than or equals to given price to beginning of the list
    (in the same other of origrinal), other fans are unchanged
*/

/*
Fan Code        Fan price
FS                  70
KS20                68
FF12                52
*/
public class MyFan implements IFan{

    @Override
    public void f1(List<Fan> a, String code) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getCode().startsWith(code)){
                a.remove(i);
                i--;
            }   
        }
    }
    
/*
Test1:
Fan code: FF2012
Fan price: 65

Enter test function (1-f1;2-f2;3-f3): 1
Enter given Fan code: FF

OUTPUT:
FS21           70.00     
KS20           68.00 
*/
    
    @Override
    public int f2(List<Fan> a, double price) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() <= price){
                count++;
            }  
        }
        return count;
    }
    
/*
Test2:
Add more how many Fan: 1

Fan code: FF2012
Fan price: 65

Enter test function (1-f1;2-f2;3-f3): 2
Enter given Fan price: 65

OUTPUT:
2
*/    

    @Override
    public void f3(List<Fan> a, double price) {
        List<Fan> b = new ArrayList();
        double temp = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() >= price){
                b.add(a.get(i));
                a.remove(a.get(i));
                i--;
            }
        }
        b.addAll(a);
        a.clear();
        a.addAll(b);
    }

/*
Test3:
Fan code: FF2012
Fan price: 65.0

Enter test function (1-f1;2-f2;3-f3): 3
Enter given Fan price: 65

OUTPUT:
FS21           70.00     
KS20           68.00     
FF2012         65.00     
FF12           52.00 
*/
    
}
