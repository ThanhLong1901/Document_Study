#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	float n;
	int i, sum = 0;
	scanf("%f", &n);
	
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	for(i = 0; i <= n; i++)
	{
		printf("%d", i);
		if( i % 2== 0)
		{
			sum += i;
		}
		
	}
	printf("\n\n%d", sum);






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
