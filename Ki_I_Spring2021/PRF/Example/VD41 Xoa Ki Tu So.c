#include<stdio.h>
#include<conio.h>
#include<string.h>

void xoa(char s[90],int vitrixoa)
{
	int i;
	int n = strlen(s);
    for(i = vitrixoa; i < n; i++)
    	s[i] = s[i + 1];
		s[n - 1]= '\0'; 
}

void xoaKiTuSo(char*s)
{
	int i;
    for(i = 0; i < strlen(s); i++)
		if(s[i] >= '0' && s[i] <= '9')
		{
			xoa(s,i);
			i--;
		}

}

int main()
{
    char s[90];
    printf("\nInput a string: ");
    gets(s);
	xoaKiTuSo(s);
	printf("Ket qua la: ");
    puts(s);
    getch();
}



