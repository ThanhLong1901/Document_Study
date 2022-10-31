#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	float n;
	scanf("%f", &n);

  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	int i, k = 0;
	int sum = 0;
	for(i = n; i >= 0; i--)
	{
		if(i % 2 != 0)
		{
			k++;
			sum += i;
		}
		if(k == 3)
		break;
	}
	printf("%d", sum);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
