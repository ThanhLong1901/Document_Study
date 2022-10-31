#include<conio.h>
#include<stdio.h>
#include<string.h>

//remove redundant spaces in a string s
void removeRedSpaces(char s1[])
 {int n,low, up, i, j; char x[100];
  n = strlen(s1);
  i=0; j=n-1;
  while(i<n && s1[i]==' ') i++;
  low = i;
  while(j>0 && s1[j]==' ') j--;
  up = j;
  if(low>up) {strcpy(s1,""); return;}
  strcpy(x,"");
  i = low; j=0;
  while(i<=up)
   {while(i<up && s1[i]==' ') i++;
    while(i<=up && s1[i]!=' ') x[j++] = s1[i++];
    if(i<=up) x[j++] = ' ';
   }
  x[j] = '\0';
  strcpy(s1,x);
 }

char chuyendoi(char s1[100])
{
    int i;
    for(i = 0; i < strlen(s1); i++)
    {
        if(s1[i] % 2 == 0)
        {
            if(s1[i] > 95 && s1[i] < 122)
            {
                s1[i] -= 32;
            }
        }
        else
        {
            if(s1[i] > 65 && s1[i] < 92)
            {
                s1[i] += 32;
            }
        }
    }
    printf("Output\n");
    puts(s1);

}
int main()
{
    char s1[100];
    printf("nhap chuoi\n");
    gets(s1);
    removeRedSpaces(s1);
    chuyendoi(s1);
}
