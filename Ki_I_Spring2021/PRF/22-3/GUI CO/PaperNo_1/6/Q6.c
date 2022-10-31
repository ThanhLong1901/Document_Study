#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

void removeRedSpaces(char s[])
 {int n,low, up, i, j; char x[100];
  n = strlen(s);
  i=0; j=n-1;
  while(i<n && s[i]==' ') i++;
  low = i;
  while(j>0 && s[j]==' ') j--;
  up = j;
  if(low>up) {strcpy(s,""); return;}
  strcpy(x,"");
  i = low; j=0;
  while(i<=up)
   {while(i<up && s[i]==' ') i++;
    while(i<=up && s[i]!=' ') x[j++] = s[i++];
    if(i<=up) x[j++] = ' ';
   }
  x[j] = '\0';
  strcpy(s,x);
 }

int demtu(char s[])
{
    int i,dem=0;
    for(i=0;i<strlen(s);i++)
        if(s[i]==' '&&s[i+1]!=' '&&s[i+1]!='\0')
            dem++;
 
        if(s[0]!=' ')
            dem++;
        return dem;
}

int main() {
  system("cls");
  //INPUT - @STUDENT:ADD YOUR CODE FOR INPUT HERE:
	int length;
	char s[100];
	gets(s);
	
	removeRedSpaces(s);
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
	printf("%d", demtu(s));






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
