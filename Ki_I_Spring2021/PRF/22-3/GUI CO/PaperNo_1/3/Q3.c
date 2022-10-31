#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

long giaiThua(int n)
{
	if(n == 0)
		return 1;
		return n * giaiThua(n - 1);
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n;
	scanf("%d", &n);
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	printf("\n%d", giaiThua(n));







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
