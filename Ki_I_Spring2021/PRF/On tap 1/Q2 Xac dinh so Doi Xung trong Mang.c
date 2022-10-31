//Nhap vao 1 mang so nguyen n. Liet ke ra man hinh  nhung so doi xung(dao nguoc)

#include<stdio.h>
#include<math.h>
#include<string.h>

void input(int a[], int n)
{

	int i;
	for( i = 0; i <= n - 1; i++)
	{
		printf("a[%d] = ", i);	scanf("%d", &a[i]);
	}
}

int SoDoiXung(int n)
{
	int a = 0, b, c = n;
	while(n != 0){
		b = n % 10;
		a = a*10 + b;
		n = n/10;
	}
	if(a == c) 
	return 1;
	return 0;
}

int main ()
{
	int a[100];
	int n, i;
	printf("Enter n = ");	scanf("%d", &n);
	
	input(a, n);
	
	for(i = 0; i <= n-1; i++)		 
   		{
		if(SoDoiXung(a[i]) == 1)
   			printf("%d\t", a[i]);
		}
}
