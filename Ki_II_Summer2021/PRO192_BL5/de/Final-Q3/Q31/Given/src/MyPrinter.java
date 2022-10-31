
import java.util.List;


/*
    + void f1(List<Printer>a, double price) - remove from the list of printers "a" all orinters which has price less
    than or equals to given price.
    + int f2(List<Printer> a, String name) - count and return number of printers which are in the list "a" and haas name contains given name.
    The comppartison must ignores the case during comaprison
*/

/*
Printer name            Printer price
HP 200J                     110
HP200G                      150
Canon G1240                 120
*/
public class MyPrinter implements IPrinter{

    @Override
    public void f1(List<Printer> a, double price) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() <= price){
                a.remove(i);
                i--;
            }
        }
    }

    @Override
    public int f2(List<Printer> a, String name) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().contains(name)){
                count++;
            }
        }
        return count;
    }

/*
Test1:
Add more how many printer: 1

Printer name: Canon FX2100
Printer price: 180

Enter test function (1-f1;2-f2): 1
Enter given printer price: 130

OUTPUT:
HP 2000G
Canon FX2100
*/    

/*
Test2:
Add more how many printer: 1

Printer name: PX2100
Printer price: 180

Enter test function (1-f1;2-f2): 2
Enter given printer name: HP

OUTPUT:
2
*/    

    
    
}
