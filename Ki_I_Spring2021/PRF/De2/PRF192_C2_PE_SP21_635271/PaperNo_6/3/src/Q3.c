#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int SoDoiXung(int n)
{
	int a = 0, b, c = n;
	while(n != 0){
		b = n % 10;
		a = a*10 + b;
		n = n/10;
	}
	if(a == c) 
	return 1;
	return 0;
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n;
	scanf("%d", &n); 
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:

	if(SoDoiXung(n) == 1)
	{
		printf("%d is a palindrome number", n);
	}
	else
		printf("%d is not a palindrome number", n);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
