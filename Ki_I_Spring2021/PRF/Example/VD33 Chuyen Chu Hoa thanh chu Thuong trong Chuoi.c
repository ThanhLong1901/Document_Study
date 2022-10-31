#include<conio.h>
#include<stdio.h>
#include<string.h>

void main()
{
	int i;
	char s[100];
	printf("Nhap s: ");
	gets(s);
	for(i = 0; i < strlen(s); i++)
	{
		if(s[i] >= 'a' && s[i] < 'z')
		s[i] = s[i] - 32;
	}
	printf("\nChuoi sau khi doi: ");
	puts(s);
	getch();
}
