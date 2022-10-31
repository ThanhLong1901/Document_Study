//Nhap n tinh tong T = 1 - 1/2 + 1/3 - ... +/- 1/n

#include<stdio.h>

int main ()
{
	int n, i;
	float T = 0;
	printf("Nhap n: ");
	scanf("%d", &n);
	for(i = 1; i <= n; i++)
	{
	if(i % 2 != 0)
	{
		T = T + (float)1/i;
	}
	else
		T = T - (float)1/i;
	}
	printf("T = %f", T);
return 0;
}
