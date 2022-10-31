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
	int n1;
	printf("n1 = ");
	scanf("%d", &n1);
	long result = gt(n1);
	printf("result = %ld", result);
}
