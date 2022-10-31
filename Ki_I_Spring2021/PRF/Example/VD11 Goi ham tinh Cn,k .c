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
	int n, k, A, B, C, S;
	printf("n = "); scanf("%d", &n);
	printf("k = "); scanf("%d", &k);
	if (n > k)
	{
		long A = gt(n);
		long B = gt(k);
		long C = gt(n - k);
		S = A/(B*C);
		printf("S = %d", S);
	}
	else
	printf("Error");
}
