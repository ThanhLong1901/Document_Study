#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

void Correct(char s[], int length)
{
	int i;
    int first = 0, last = length - 1;	
    while (first < last && s[first] == ' ')
        first++;
    while (last > first && s[last] == ' ')
        last--;
 
    if (s[first] >= 'a' && s[first] <= 'z')
        s[first] -= 32;
    for (i = first + 1; i <= last; i++)
    {
        if (s[i] >= 'A' && s[i] <= 'Z'){
            s[i] += 32;
        }
        if (i + 1 <= last)
        {
            if (s[i] == s[i + 1] && s[i] == ' ')
            {
                continue;
            }

            if (s[i] == ' ' && s[i + 1] >= 'a' && s[i + 1] <= 'z')
            {
                s[i + 1] -= 32;
            }
        }
        printf("%c", s[i]);
    }
}

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
    	int length = strlen(s) - 1; 
   		s[length] = '\0';
    }

	
   
  
	
  
  
  
  
  
  // Fixed Do not edit anything here.
  printf("\nOUTPUT:\n");
  //@STUDENT: WRITE YOUR OUTPUT HERE:
   Correct(s, length);

	






  
  
  //--FIXED PART - DO NOT EDIT ANY THINGS HERE
  printf("\n");
  system ("pause");
  return(0);
}
