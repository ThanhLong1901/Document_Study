#include<stdio.h>
#include<math.h>

int binaryNumber(int n)
{
	int a = 0; 
	int kqchuyen = 0;
	while( n > 0)
	{
	kqchuyen += (n % 2) * pow(10, a);
	++a;
	n /= 2;
	}
	return kqchuyen;
}

int sumnumber(int n)
{
	int s = 0;
	while ( n != 0)
	{
		s += n % 10;
		n /= 10;
	}
	return s;
}

int nghichDao(int n)
{
	int sodaonguoc = 0;
	int a = log10(n);
	while ( n != 0)
	{
		sodaonguoc += (n % 10) * pow(10,a);
		--a;
		n /= 10;
	}
	return sodaonguoc;
}

int main ()
{	
	int n;
	printf("Enter n = ");
	int check = scanf("%d", &n);
	if(check == 0)
	{
		printf("n phai la so nguyen. Vui long chay lai!");
	}
	else
	{
	int binarynumber = binaryNumber(n);
	printf("%d in binary number format is: %d", n, binarynumber);	
			
	printf("\n\nEnter\tn = "); scanf("%d", &n);
	int sum = sumnumber(n);
	printf("The sum of all digits in %d is %d", n, sum);
	int m = nghichDao(n);
	printf("\n\nThe reverse number of %d is %d", n, m);
	}
return 0;	
}
