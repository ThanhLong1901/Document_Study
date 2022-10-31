
/*
    + f1: Count and return mumber of prime digits in str
    + f2: Reverse order of all words in str(word = a string without space)
*/
public class MyString implements IString{
    
    boolean isPrime(int currentNumer){  //Kiểm tra số nguyên tố
        if(currentNumer == 1) return false;
        if(currentNumer == 2) return true;
        for(int i = 2; i < Math.sqrt(currentNumer); i++){
            if(currentNumer % i == 0){
                return false;
            }
        }
        return true;
        
    }
    @Override
    public int f1(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if(Character.isDigit(currentChar)){
                int currentNumber = Integer.parseInt("" + currentChar);
                if(isPrime(currentNumber)){
                    count++;
                }
            }  
        }
        return count;
    }
/*
TEST1:
1. Test f1()
2. Test f2()
Enter TC (1 or 2): 1
Enter a string: 
a32b 95cd b67
OUTPUT:
5
*/

    @Override
    public String f2(String string) {
        String[] words = string.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += " " + words[i];     
        }
        return result.trim();
    }
/*
TEST2:
1. Test f1()
2. Test f2()
Enter TC (1 or 2): 2
Enter a string: 
a9 b1 a8 a7 a6 a5
OUTPUT:
a5 a6 a7 a8 b1 a9
*/
    
}
