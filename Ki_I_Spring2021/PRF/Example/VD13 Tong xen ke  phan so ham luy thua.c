#include<stdio.h>

long giaiThua(int n)
{
	if(n == 0)
		return 1;
		return n * giaiThua(n - 1);
}

int main ()
{
	int n, i;
	printf("n = "); scanf("%d", &n);
	float A = 0;
	for( i = 1; i <=n; i++)
	{
		if(i % 2 == 0)
		{
		A -= (float)1/giaiThua(i);
		}
		else
		A += (float)1/giaiThua(i);
	}
	printf("T = %f", A);
	return 0;
}
