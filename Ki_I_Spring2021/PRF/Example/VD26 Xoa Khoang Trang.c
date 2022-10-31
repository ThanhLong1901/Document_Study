#include<stdio.h>
#include<conio.h>
#include<string.h>

void xoa(char s[90],int vitrixoa)
{
	int i;
	int n = strlen(s);
    for(i = vitrixoa; i < n; i++)
    s[i] = s[i + 1];
	s[n - 1]='\0'; 
}
void xoaKhoangTrang(char s[])
{
	int i;
    for(i = 0; i < strlen(s); i++)
		if(s[i] == ' ' && s[i + 1] == ' ')
		{
			xoa(s, i);
			i--;
		}
    if(s[0] == ' ')
		xoa(s, 0);
    if(s[strlen(s) - 1] == ' ')
		xoa(s, strlen(s) - 1);
}

int main()
{
    char s[90];
    printf("\nInput a string: ");
    gets(s);
	xoakt(s);
    puts(s);
//    getch();
}

