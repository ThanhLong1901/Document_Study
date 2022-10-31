#include<stdio.h>
#include<conio.h>
#include<math.h>

float F(double x, int n) {
    int a, i;
    if (n % 2 == 0)
		a = 1;
    else
		a = -1;
    float temp = 1;
    for (i = 1; i <= 2*n; i++)
		temp = temp*x/i;
    return a * temp;
}

double myCos(double x, double epsi)
{
	int n = 0;
	double cos = 0;
	while(fabs(F(x, n)) > epsi)
	{
        cos += F(x, n);
        n++;
    }
    return cos;
}
int main()
{
    double x;
    double epsi = 0.00001;
    printf("Nhap gia tri x(radian) = ");	scanf("%lf", &x);
	printf("cos(x) = %llf", myCos(x, epsi));
    return 0;
}
