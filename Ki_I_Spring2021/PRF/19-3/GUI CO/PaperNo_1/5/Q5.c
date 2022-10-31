#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int n, i, count = 0;
	scanf("%d", &n);
	char a[n];
	fflush(stdin);
	for(i = 0; i < n; i++)
	{
		scanf("%c", &a[i]);
	}
	for(i = 0; i < n; i++)
	{
		if(a[i] != a[n - 1 - i])
		{
			count++;
		}		
	}

  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	if(count == 0)
		printf("1");
	else
		printf("0");







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
