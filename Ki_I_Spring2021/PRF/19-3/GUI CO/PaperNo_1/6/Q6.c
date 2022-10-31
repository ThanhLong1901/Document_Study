#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>


int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	char s[6][20];
	char t[20];
	int i, j;
	int size = 6;
	for (i = 0; i < size; i++) 
	{
      scanf("%s", s[i]);
      printf("\n");
	}


  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:

	for (i = 1; i < size; i++)
	{
    	for (j = 1; j < size; j++) 
		{
       		if (strcmp(s[j - 1], s[j]) < 0) 
			{
            	strcpy(t, s[j]);
            	strcpy(s[j], s[j - 1]);
            	strcpy(s[j - 1], t);
         	}
     	 }
   }
 
   for (i = 0; i < size; i++) 
   {
      printf("%s ", s[i]);
   }







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
