//Viet chuong trinh nhap so n va tinh tong T = 1 + 2 + ... + n

#include<stdio.h>

int main ()
{
	int n, i = 1, T = 0;
	printf("Nhap gia tri n: ");
	scanf("%d", &n);
	for(i = 1; i <= n; i++)
	{
		T += i;
	}
	printf("\nTong T = %d", T);
return 0;
}
	
