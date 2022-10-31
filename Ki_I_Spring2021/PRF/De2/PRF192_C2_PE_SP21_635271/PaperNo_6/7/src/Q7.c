#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int primeNumber(int n)
{
	int i = 1;
	if (n < 2)
	return 0;
	
	for( i = 2; i <= sqrt(n); i++)
	if(n % i == 0)
	return (0);
	return (1);
}

int output(int n) 
{
	int i, j, count = 0;
	for(i = 0; i <= n; i++) 
	{
		for(j = 0; j <= i; j++)
		{
		if(primeNumber(i) == 1)
		{
			printf("\t%d ", i);
//			count++;
		}
	}
		
//		if(count == 5) 
//		{
//			printf("\n"); 
//			count = 0;
//		}
	}
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n;
	scanf("%d", &n);
	
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	output(n);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
