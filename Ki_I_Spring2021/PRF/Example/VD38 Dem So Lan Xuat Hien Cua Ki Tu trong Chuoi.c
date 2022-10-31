#include<stdio.h>
#include<string.h>

char TimKyTuTrongChuoi(char s[],char s2[])
{
	int i;
	int dem = 0;
	for(i = 0; i < strlen(s); i++)
	{
		if(s[i] == s2[0])
		{
			printf("'%c' co o vi tri: %d\n", s[i], i);
			dem++;
		}	
	}
	printf("Tong so lan xuat hien la: %d", dem);
	if(dem == 0)
	{
		printf("Ky tu muon tim khong co trong chuoi!");
	}

}

int main()
{
	char s[100];	
	char s2[100];
	printf("Nhap chuoi: ");
	gets(s);
	printf("Nhap ky tu muon tim: ");
	gets(s2);
	TimKyTuTrongChuoi(s,s2);
}
