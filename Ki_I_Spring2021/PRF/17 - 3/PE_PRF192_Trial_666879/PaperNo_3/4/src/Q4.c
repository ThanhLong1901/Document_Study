#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

void sort(int a[], int n)
{ 
	int i, j, k, min, temp;
    for(i = 0; i < n - 1; i++)
       { 
	   	min = a[i]; k = i;
        for(j = i + 1; j < n; j++)
            if(a[j] < min) 
				{
				min = a[j];
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

void output(int a[], int n)
{

	int i;
	for(i = 0; i <= n - 1; i++)		
		printf("%d ",a[i]);
		
}

int main() {

  system("cls");
  	int a[7];
	int n = 7, i;
	for(i = 0; i < n; i++)
	{
		scanf("%d", &a[i]);
	}
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
//	printf("Enter n = ");	scanf("%d", &n);

	

  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	sort(a, n);
	output(a, n);






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
