#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

long giaiThua(int n)
{
	int i; long Area = 1;
	for(i = 1; i <= n - 1; i++)
		Area *= i;
	return Area;
}


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n;
	scanf("%d", &n); 
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	printf("%d", giaiThua(n));







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
