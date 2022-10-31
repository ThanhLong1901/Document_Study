#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

void removeRedSpaces(char o[])
 {int n,low, up, i, j; char x[100];
  n = strlen(o);
  i=0; j=n-1;
  while(i<n && o[i]==' ') i++;
  low = i;
  while(j>0 && o[j]==' ') j--;
  up = j;
  if(low>up) {strcpy(o,""); return;}
  strcpy(x,"");
  i = low; j=0;
  while(i<=up)
   {while(i<up && o[i]==' ') i++;
    while(i<=up && o[i]!=' ') x[j++] = o[i++];
    if(i<=up) x[j++] = ' ';
   }
  x[j] = '\0';
  strcpy(o,x);
 }

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	char o[100];
	gets(o);
	removeRedSpaces(o);
	int i;
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	for(i = 0; i < strlen(o); i++)
	{
		if(o[i] >= 'a' && o[i] < 'z')
		o[i] = o[i] - 32;
	}
	puts(o);







  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
