
/*
    getPrice():double - use to determine price of a Tive, peice - original - decrement, where:
        + decrement = 1- percent out of original price if Tivi serie > 3000
        + otherwise decrement = 0
*/

public class ColorTivi extends Tivi{
   
    int serie;

    public ColorTivi() {
    }

    public ColorTivi(String type, int serie, double price) {
        super(type, price);
        this.serie = serie;
    }

    public double getPrice() {
        if(serie > 3000){
            return 0.9 * super.getPrice();
        }
        else
            return super.getPrice();
    }

    @Override
    public String toString() {
        return super.getType() + "\t" + serie + "\t" + super.getPrice();
    }
 
}
/*
Test1:
Enter Tivi type: Led TV
Enter Tivi price: 650
Enter Tivi serie: 2880
1. TC = 1 - test toString()
2. TC = 2 - test getPrice()
Enter TC: 1
OUTPUT:
Led TV	650.0
Led TV	2880	650.0
*/

/*
Test2:
Enter Tivi type: Led TV
Enter Tivi price: 600
Enter Tivi serie: 3120
1. TC = 1 - test toString()
2. TC = 2 - test getPrice()
Enter TC: 2
OUTPUT:
540.00
*/

/*
Test3:
Enter Tivi type: Led TV
Enter Tivi price: 500
Enter Tivi serie: 2880
1. TC = 1 - test toString()
2. TC = 2 - test getPrice()
Enter TC: 2
OUTPUT:
500.00
*/
