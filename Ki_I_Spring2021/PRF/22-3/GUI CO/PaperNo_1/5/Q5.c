#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
    char s[100];
    int i, n;
	scanf("%s", s);	
 
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
    n = strlen(s) - 1;
    for(i = 0; i < n - 2; i++)
    {
    	printf("%c", s[i]);
	}
    for(i = n; i >= n - 2; i--)
    {
        printf("%c", s[i]);
    }
    return 0;
  






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
