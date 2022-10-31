#include <stdio.h>
#include <conio.h>
#include <string.h>

int demktso(char s[])
{
       int i,dem=0;
       for (i=0;i<strlen(s);i++)
        if (s[i]>='0')
                     dem++;
       return dem;
}

int main()
{
    char s[100]; 
	printf("Nhap xau ki tu: ");
	gets(s);
    printf("so ki tu so la: %d",demktso(s));
    getch();
}
