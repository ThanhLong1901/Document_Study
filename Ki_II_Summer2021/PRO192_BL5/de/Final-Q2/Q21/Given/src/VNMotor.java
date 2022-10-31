

/*
    + getSalePrice(): double - use to determine sla fare of a Motor, sale price - original price - discount, where:
        discoubt = 5 percent out of origibal price of original price < 3000
        Otherwose discount = 10 percent out of original price.
 */
public class VNMotor extends Motor{
    
    String series;

    public VNMotor() {
    }

    public VNMotor(String brandName, String series, double price) {
        super(brandName, price);
        this.series = series;
    }
    
    public double getSalePrice(){
        if(super.getPrice() < 3000){
            return 0.95 * super.getPrice();
        }
        else
            return 0.9 * super.getPrice();
    }

    @Override
    public String toString() {
        return super.getBrandName() + "\t" + series + "\t" + super.getPrice();
    }

/*
Test1:
Enter brand name of a motor: Honda Future
Enter series of a motor: FX500
Enter price of a motor: 1300
1. TC = 1 - test toString function
2. TC = 2 - test getSalePrice function
3. TC = 3 - test getBrandName function
Enter TC: 2
OUTPUT:
1235.0
*/ 
    
/*
Test2:
Enter brand name of a motor: Honda Future
Enter series of a motor: FX500
Enter price of a motor: 3000
1. TC = 1 - test toString function
2. TC = 2 - test getSalePrice function
3. TC = 3 - test getBrandName function
Enter TC: 2
OUTPUT:
2700.0 
*/ 
    
/*
Test3:
Enter brand name of a motor: Honda Future
Enter series of a motor: FX500
Enter price of a motor: 1300
1. TC = 1 - test toString function
2. TC = 2 - test getSalePrice function
3. TC = 3 - test getBrandName function
Enter TC: 1
OUTPUT:
Honda Future	1300.0
Honda Future	FX500	1300.0
*/
    
/*
Test4:
Enter brand name of a motor: Honda Future
Enter series of a motor: FX500
Enter price of a motor: 1400
1. TC = 1 - test toString function
2. TC = 2 - test getSalePrice function
3. TC = 3 - test getBrandName function
Enter TC: 3
OUTPUT:
Honda Future
*/
    
}
