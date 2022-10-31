#include<stdio.h>

void input()
{
	int a, b;
	printf(" ");	scanf("%d", &a);
	printf("OUTPUT");
	printf(" ");	scanf("%d", &b);
}

void output()
{
	int a, b;
	if(a > b)
	{
		printf("\n%d\t%d\n", b, a);
		printf("min=%d", b);
	}
	else
	{
		printf("\n%d\t%d\n", a, b);
		printf("min=%d", a);
	}
}

int main()
{
	int a, b;
	input();
	output();
}
