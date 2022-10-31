#include<stdio.h>

int main ()
{
	float a, b, c;
	printf("Enter a = ");
	scanf("%f", &a);
	printf("\nEnter b = ");
	scanf("%f", &b);
	printf("\nEnter c = ");
	scanf("%f", &c);
	
	if(a > b && a > c && b > c)
	{
		printf("\nMax = %f,\tMin = %f", a, c);
		printf("\nAscending order: %f < %f < %f", c, b, a);
	}
	else if(a > b && a > c && c > b)
	{
		printf("\nMax = %f,\tMin = %f", a, b);
		printf("\nAscending order: %f < %f < %f", b, c, a);
	}
	else if(b > a && b > c && a > c)
	{
		printf("\nMax = %f,\tMin = %f", b, c);
		printf("\nAscending order: %f < %f < %f", c, a, b);
	}
	else if(b > a && b > c && c > a)
	{
		printf("\nMax = %f,\tMin = %f", b, a);
		printf("\nAscending order: %f < %f < %f", a, c, b);
	}
	else if(c > a && c > b && b > a)
	{
		printf("\nMax = %f,\tMin = %f", c, a);
		printf("\nAscending order: %f < %f < %f", a, b, c);
	}
	else
	{
		printf("\nMax = %f,\tMin = %f", c, b);
		printf("\nAscending order: %f < %f < %f", b, a, c);
	}
	return 0;
}
