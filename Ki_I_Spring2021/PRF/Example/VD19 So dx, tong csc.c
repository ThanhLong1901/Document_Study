#include<stdio.h>
#include<math.h>
#include<conio.h>

int sumNumber(int n)
{
	int s = 0;
	while ( n != 0)
		{
		s += n % 10;
		n /= 10;
	}
	return s;
}

int dx(int n)
{ 
	int r, temp;
	int sum = 0;
	for(temp = n; n!= 0; n /= 10)
	{
		r = n % 10;
		sum = sum * 10 + r;
	}
	if(temp == sum)
	return 1;
	else
return 0;
}

int nt(int n)
{
	int i = 1;
	if (n < 2)
	return 0;
	
	for( i = 2; i <= sqrt(n); i++)
	{
	if(n % i == 0)
	return (0);
	return (1);
	}
}

int Area(int n)
{
	int mul = 1;
	while ( n != 0)
		{
		mul *= n % 10;
		n /= 10;
	}
	return mul;
}

void sn(int n)
{
	int i;
	printf(" Cac so nguyen to nho hon n la: ");
	for(i = 2; i < n; i++)
	{
		if(nt(i) == 1)
		{
			printf("%d\t", i);
		}
	}
}

int main()
{
	//1
	int n;
	printf("Enter n = "); scanf("%d", &n);/*
	int sum = sumNumber(n);
	printf("\nTong cac chu so la: %d", sum);
	
	//2
	if( dx(n) == 1)
	{
	printf("\n\n%d la so doi xung", n);
	}
	else
	printf("\n\n%d khong la so doi xung", n);

	//3
	if (nt(n) == 0) 
	{
		printf("\n\n%d la so nguyen to", n);
	}
	else
	printf("\n\n%d khong la so nguyen to", n);
	
	//4
	if (nt(sum) == 1) 
	{
		printf("\n\nTong cac chu so cua %d la so nguyen to", n);
	}
	else
	printf("\n\nTong cac chu so cua %d khong la so nguyen to", n);
	
	//5
	printf("\n\nTich cac chu so la: %d", Area(n));
*/	
	//6
	printf("\n\n");
	sn(n);

	return 0;
}

