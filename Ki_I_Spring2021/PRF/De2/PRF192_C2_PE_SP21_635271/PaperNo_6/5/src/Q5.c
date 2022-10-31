#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	char s[100];
	char s1[100];
	gets(s);
	int i, n;
    n = strlen(s) - 1;
    for(i = n; i >= 0; i--)
    { 	
   		if(s[0] != ' ')
	{
		s[0] = s[0] - 32;	
		for(i = 1;i < strlen(s); i++)
		{
			if(s[i] == ' ' && s[i + 1] != ' ' && s[i + 1] >= 'a' && s[i + 1] <= 'z' )
			{
			s[i + 1] = s[i + 1] - 32;
			}	          
		}
	}
	else
	{
	for(i = 0; i < strlen(s); i++)
	{
		if(s[i] == ' ' && s[i + 1] != ' ' && s[i + 1] >= 'a' && s[i + 1] <= 'z' )
 		{
			s[i + 1] = s[i + 1] - 32;
 		}          
	}
}printf("%s",s);
	}

   
  
	
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
 

	






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
