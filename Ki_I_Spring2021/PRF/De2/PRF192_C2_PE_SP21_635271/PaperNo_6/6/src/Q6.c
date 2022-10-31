#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

void sort(int a[], int n)
{ 
	int i, j, k, max, temp;
    for(i = 0; i < n - 1; i++)
       { 
	   	max = a[i]; k = i;
        for(j = i + 1; j < n; j++)
            if(a[j] > max) 
				{
				max = a[j];
				k = j;
				}
        	if(k != i) 
		 	{ 
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			}
 		}
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int a[100];
	int i, n;
	scanf("%d", &n);
	for( i = 0; i <= n - 1; i++)
	{
		scanf("%d", &a[i]);
	}
  	
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	sort(a, n);
	
	printf("%d\n", a[0]);
	printf("%d", a[n - 1]);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
