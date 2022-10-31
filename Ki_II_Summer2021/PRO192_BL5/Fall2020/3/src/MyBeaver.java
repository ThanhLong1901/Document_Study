
import java.util.List;


/*
    +f1: Count and return number of beavers having weight>avg, where avg is the average weight of all 
    beavers (avg is double type)
    +f2: Suppose the list contaions at least 3 elements. Remove the first beaver with maximum weight
    and insert it to position 2 of the list (positive of the first element is 0)
    +f3: Supposr the list contains at teast 7 elements. Sort elements from position 2 to 6 by river alphabetically
    (other elements are unchanged), in case rivers are the same, sort them descendingly by weight
*/
public class MyBeaver implements IBeaver{

    @Override
    public int f1(List<Beaver> t) {
        int sum = 0;
        for (Beaver o : t) {
            sum += o.getWeight();
        }
        double avg = (double)sum/t.size();
        int count = 0;
        for (Beaver o : t) {
            if(o.getWeight() > avg) {
                count++;
            }
        }
        return count;
        
    }

    @Override
    public void f2(List<Beaver> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void f3(List<Beaver> t) {
        
    }
    
}

/*
TEST1:
Add how many elements: 0
Enter TC(1-f1;2-f2;3-f3): 1
The list before running f1:
(A,3) (D,9) (C,6) (B,7) (E,8) 
OUTPUT:
3
*/

/*
TEST2:
*/

/*
TEST3:
*/
