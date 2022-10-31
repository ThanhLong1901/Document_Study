#include<stdio.h>
#include<math.h>
int main ()
{
	float a, b, c, x;
	printf("Enter a = ");	scanf("%f", &a);
	printf("Enter b = ");	scanf("%f", &b);
	printf("Enter c = ");	scanf("%f", &c);
	float denta = b * b - 4 * a * c;
	float p = (a + b + c)/2;
	if ((a + b) > c  &&  (b + c) > a  &&  (a + c) > b)
	{
		printf("Area = %f", (float)(sqrt(p * (p - a) * (p - b) * (p - c))));
		printf("\n\nOutput = %f", (float)(sqrt(p * (p - a) * (p - b) * (p - c))));
	}
	else
	{
	printf("Area = 0.00");
	printf("\n\nOutput = 0.00");
	}
	return 0;
}

