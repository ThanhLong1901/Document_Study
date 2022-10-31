//Chuyen doi co so 10 sang co so 2 va co so 8

#include<stdio.h>
#include<math.h>

int Base2(int n)
{
	int a = 0; 
	int kqchuyen1 = 0;
	while( n > 0)
	{
	kqchuyen1 += (n % 2) * pow(10, a);
	++a;
	n /= 2;
	}
	return kqchuyen1;
}

int Base8(int n)
{
	int a = 0; 
	int kqchuyen2 = 0;
	while( n > 0)
	{
	kqchuyen2 += (n % 8) * pow(10, a);
	++a;
	n /= 8;
	}
	return kqchuyen2;
}



int main()
{
	int n;
	printf("Enter n(Base 10) = ");	scanf("%d", &n);
	printf("\nBase 2: %d", Base2(n));
	printf("\nBase 8: %d", Base8(n));
}
