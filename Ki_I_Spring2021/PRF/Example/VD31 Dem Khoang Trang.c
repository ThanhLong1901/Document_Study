#include<stdio.h>
#include<string.h>

void DemKhoangTrang(char s[])
{
	int i,dem=0;
	for(i=0;i<strlen(s);i++)
	{
	if(s[i]==' ')
	{
		dem++;
	}
}
	printf("Chuoi co %d khoang trang.", dem);
}

int main()
{
	char s[100];
	printf("Nhap chuoi: ");
	gets(s);
	DemKhoangTrang(s);
}
