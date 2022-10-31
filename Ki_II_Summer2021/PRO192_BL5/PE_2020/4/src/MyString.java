

/*
    + int sum(rc:String) - used to calculate the summation of all even digits in a given string "rc"
    + String getCode(rc:String) - this function return code of RC as the rule:
        Code of RC = all digit characters and uppercase letters letters in the same order as original given string "rc"
*/
public class MyString implements IString{

    @Override
    public int sum(String string) {
        String IString = string.replaceAll("[^02468]", "");
        int Sum = 0;
        for (int i = 0; i < IString.length(); i++) {
            int sum = Integer.parseInt(IString.charAt(i) + "");
            Sum += sum;
        }
        return Sum;
    }
    
/*
Test1:
1. TC = 1 - test sum()
2. TC = 2 - test getCode()
Enter TC: 1
Enter a value in a string: 123@123a2
OUTPUT:
6
*/

    @Override
    public String getCode(String string) {
        String IString = string.replaceAll("[^A-Z0-9]", "");
        return IString;
    }
    
/*
Test2:
1. TC = 1 - test sum()
2. TC = 2 - test getCode()
Enter TC: 2
Enter a value of rc: 1A2haiBc91
OUTPUT:
1A2B91
*/
    
    
   
}
