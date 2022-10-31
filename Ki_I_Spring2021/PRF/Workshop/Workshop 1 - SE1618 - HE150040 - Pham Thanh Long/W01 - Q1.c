#include<stdio.h>
#include<math.h>
int main ()
{
	float a, b, c, x;
	printf("Enter a = ");	scanf("%f", &a);
	printf("Enter b = ");	scanf("%f", &b);
	printf("Enter c = ");	scanf("%f", &c);
	printf("Enter x = ");	scanf("%f", &x);
	printf("S1 = %f,", a * x * x + b * x + c);
	float denta = b * b - 4 * a * c;
	if (denta > 0)
	{
		printf("\tS2 = %f", sqrt(denta));
	}
	else
	{
		printf("\tS2 = 0");
	}
	
	printf("\n\nEnter a, b, c = ");	scanf("%f%f%f", &a, &b, &c);
	float p = (a + b + c)/2;
	if ((a + b) > c  &&  (b + c) > a  &&  (a + c) > b)
	{
		printf("\nPerimeter = %f", a + b + c);
		printf("\nArea = %f", (float)(sqrt(p * (p - a) * (p - b) * (p - c))));
	}
	else
	printf("a, b, c are not side of a triangle");
	return 0;
}

