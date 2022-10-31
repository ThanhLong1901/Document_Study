#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int demktso(char s[])
{
       int i,dem=0;
       for (i=0;i<strlen(s);i++)
        if (s[i]>='0')
            dem++;
       return dem;
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	char s[100];
	gets(s);

  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:








  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
