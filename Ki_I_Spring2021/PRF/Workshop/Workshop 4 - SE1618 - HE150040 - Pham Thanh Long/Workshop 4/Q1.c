#include<stdio.h>
#include<math.h>

float luyThua(int n, int k) {
    int pow = 1;
    int i;
	for (i = 1; i <= k; i++)
        pow *= n;
    return (float)pow;
}

long giaiThua(int n)
{
	if(n == 0)
		return 1;
		return n * giaiThua(n - 1);
}

double myExp(double x, int n)
{
	double sum = 1;
	int i;
	for(i = n - 1; i > 0; --i)
	{
		sum = 1 + x * sum/i;
	}
	return sum;
}

double MyExp(double x, double epsi)
{
    float sum = 1;
    int i = 1;
    float temp = x;
    while ( temp > 1e-10 ) {
        sum += temp;
        i++;
        temp = temp * x / i;
    }
    return sum;
}

int main ()
{
	int n = 1000;
	double x, epsi = 0.00001;
	
	printf("Enter x = ");	scanf("%lf", &x);
	
	printf("\nexp(%lf) = %lf", x, myExp(x, n));
	printf("\nexp(%lf, %d) = %lf", x, n, myExp(x, n));
	printf("\nexp(%lf, %lf) = %lf", x, epsi, MyExp(x, epsi));
	
	return 0;
}







