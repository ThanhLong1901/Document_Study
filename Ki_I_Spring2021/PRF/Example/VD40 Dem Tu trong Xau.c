#include<stdio.h>
#include<string.h>

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

int main ()
{
	char s[100];
	printf("Nhap chuoi: ");
	gets(s);
	printf("So tu trong chuoi la: %d",	demtu(s));
	return 0;
}
