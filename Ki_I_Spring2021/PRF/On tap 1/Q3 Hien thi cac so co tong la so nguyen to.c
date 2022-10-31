//Nhap vao so nguyen n. Liet ke cac so tu 1 den n co tong cac chu so la so nguyen to 

#include<stdio.h>
#include<math.h>

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

int primeNumber(int n)
{
	int i = 1;
	if (n < 2)
	return 0;
	
	for( i = 2; i <= sqrt(n); i++)
	if(n % i == 0)
	return (0);
	return (1);
}

int main()
{
	int n, i, S;
	printf("Enter n = ");
	scanf("%d", &n);
	printf("\n");
	for(i = 0; i < n; i++)
	{	
		S = sumNumber(i);
		if(primeNumber(S) == 1 )
		printf("%d ", i);
	}
return 0;
}
	
	
