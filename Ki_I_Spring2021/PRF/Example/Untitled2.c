#include<stdio.h>
#include<math.h>
#include<string.h>

void input(int a[], int n)
{
	int i;
	scanf("%d", &n);
	for(i = 0; i < n; i++)
	{
		scanf("%d", &a[i]);
	}
}

void output(int a[], int n)
{

	int i;
	for(i = 0; i <= n - 1; i++)		
		printf("%d\t", a[i]);
		
}

void Xoa1PhanTu(int a[], int n)
{
	int i;
	for(i = 0; i < n; i++)
	{
		a[i] = a[i + 1];
	}
}

void Xoa(int a[], int n)
{
	int i, j;
	for(i = 0; i < n - 1; i++)
	{
	int flag = 0;
		for(j = i + 1; j < n; j++)
		{
		if(a[i] == a[j])
			{
			Xoa1PhanTu(a, n);
			j--;
			flag = 1;
			}
		}
		if(flag == 1)
		{
			Xoa1PhanTu(a, n); 
		}
	}
}

int main()
{
	int a[100];
	int n;
	input(a,n);
	output(a, n);
	Xoa(a, n);
	output(a,n);

}
