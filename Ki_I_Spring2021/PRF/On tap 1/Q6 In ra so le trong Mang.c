//Nhap vao 1 mang so nguyen, hien thi ra so le trong mang

#include<stdio.h>
#include<math.h>
#include<string.h>

void input(int a[], int n)
{

	int i;
	for(i = 0; i <= n - 1; i++)
	{
		printf("a[%d] = ", i);	scanf("%d", &a[i]);
	}
}

void output(int a[], int n)
{

	int i;
	for(i = 0; i <= n - 1; i++)		
	{
		if(a[i] % 2 != 0)
		{
		printf("%d ", a[i]);
		}
	}
}

int main()
{
	int a[100];
	int n, i;
	printf("Enter n = ");	scanf("%d", &n);
	input(a, n);
	output(a, n);
}
