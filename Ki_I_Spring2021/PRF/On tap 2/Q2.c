#include<stdio.h>
#include<conio.h>
#include<math.h>

double Cos(int n, float x)
{
	int i;
	float S, T;
	long M, N;

	S = 1;
	N = 1;
	i = 1;

	while(i <= n)
	{
		T = pow(x, (2 * i ));
		M = i * 2;
		N = N * M * (M - 1);
		S += pow(-1, (float)i) * T / N;
		i++;
	}
	return S;
}

int main()
{	
	int n;
	float x;
	printf("n=");	scanf("%d", &n);
	printf("x=");	scanf("%f", &x);

	printf("\n%lf", Cos(n, x));
}
