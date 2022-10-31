#include <stdio.h>
#include <math.h>

void TestSaving(float P0, float Pn, float rate, int n)
{
	printf("1. Test saving account");
	printf("\nprincipal = "); scanf("%f", &P0);
	printf("Annual rate = "); scanf("%f", &rate);
	printf("No of year = "); scanf("%d", &n);	
	Pn = pow(1 + rate, n) * P0;	
	printf("principal = %.2f", P0);
	printf("\namount after %d years = %.2f\n", n, Pn);
}

void Investment(float P0, float Pn, float rate, int n)
{

	printf("\n2. Investment caculation\n");
	printf("future = "); scanf("%f", &Pn);
	printf("Annual rate = "); scanf("%f", &rate);
	printf("No of year = "); scanf("%d", &n);
	P0 = Pn / pow(1 + rate, n);
	printf("principle should be = %.2f", P0);
}

int main()
{
	float P0, rate, Pn;
	int n;
	TestSaving(P0, Pn, rate, n);
	Investment(P0, Pn, rate, n);
	return 0;
}
