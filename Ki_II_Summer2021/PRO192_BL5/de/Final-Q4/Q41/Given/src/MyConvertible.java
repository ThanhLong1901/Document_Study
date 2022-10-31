

/*
    + double toMile(km:double) - used to convert a km value to mile value. Given 1km = 0.621371 mile
    + Strinng getCode(rc:String) - assuming that length of Reservation code is dividable by 3; this functuon return code of RC as the rule:
        Code of RC = separate a RC into froups, eaah group has exactly 3 characters with sam order of original RC,
        groups are se[erated by character "-", eg A12-BE2-CM5
*/
public class MyConvertible implements Convertible{

    @Override
    public double toMile(double x) {
        return x * 0.621371;
    }

    @Override
    public String getCode(String rc) {
        String result = "";
        for (int i = 0; i <= rc.length() - 3; i+=3) {
            result = result + rc.substring(i, i + 3);
            if(i != rc.length() - 3){
                result = result + "-";
            }
            
        }
        return result;
    }

   
/*
Test1:
1. TC = 1 - test toMile()
2. TC = 2 - test getCode()
Enter TC: 1
Enter a value in km: 16.5
OUTPUT:
10.25
*/ 
    
/*
Test2:
1. TC = 1 - test toMile()
2. TC = 2 - test getCode()
Enter TC: 2
Enter a value of rc: K2M762241
OUTPUT:
K2M-762-241
*/    
}
