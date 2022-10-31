#include<stdio.h>

long gt(int n)
{
	int i; long T;
	T = 1;
	for(i = 1; i <= n; i++)
		T *= i;
	return (T);
}
int main ()
{
	int n, i;
	printf("n = "); scanf("%d", &n);
	float A = 0;
	for( i = 1; i <=n; i++)
	{
	A += (float)1/gt(i);
	}
	printf("T = %f", A);
	return 0;
}
