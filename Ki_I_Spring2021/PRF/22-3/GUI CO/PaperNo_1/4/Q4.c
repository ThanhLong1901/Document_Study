#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	char s[100];
	int i, n;
	scanf("%d", &n);
	for(i = 0; i <= n; i++)
	{
		scanf("%c", &s[i]);
		fflush(stdin);
	}
	
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	for(i = 0; i <= n; i++)
	{
		if(s[i] >= 'a' && s[i] < 'z')
			s[i] = s[i] - 32;
		printf("%c\t", s[i]);
	}








  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
