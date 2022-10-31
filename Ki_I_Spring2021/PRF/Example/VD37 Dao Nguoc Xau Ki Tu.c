
//Intput: Pham Thanh Long
//Output: mahP hnahT gnoL

#include <stdio.h>
#include <string.h>
 
int string_length(char s[])
{
   int i = 0;
   while(s[i] != '\0')
      i++;
   return i;    
}
 
void string_reverse(char str[]) 
{
   int i, j, len;
   char ch;
 
   j = len = string_length(str) - 1;
   i = 0;
 
   while(i < j) {
      ch = str[j];
      str[j] = str[i];
      str[i] = ch;
      i++;
      j--;
   }
}
 

int main (void) {
    char s1[100];
    printf("nhap chuoi: ");
    gets(s1);
	char reverse[100]="";
	char temp[50];
	int i, j, n;
	
	n = string_length(s1);
 
   for(i = 0; i < n; i++) {
 
      for(j = 0; i < n && s1[i]!=' '; ++i,++j) {
         temp[j] = s1[i];
      }
       
      temp[j] = '\0';
 
      string_reverse(temp);
 
      strcat(reverse, temp);
      strcat(reverse, " ");
   }
   printf("\nChuoi sau khi da dao nguoc: %s", reverse);
    
   return 0;
}

////Input: Pham Thanh Long
////Output: gnoL hnahT mahP
//
//#include<conio.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//            char s[100];
//            int i, n;
//            printf("nhap chuoi: ");
//            gets(s);
//            printf("\nChuoi sau khi dao nguoc: ");
//            n = strlen(s) - 1;
//            for(i = n; i >= 0; i--)
//            {
//                        printf("%c", s[i]);
//            }
//            getch();
//            return 0;
//}
