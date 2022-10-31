#include<stdio.h>
#include<math.h>
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

int output(int LowerLimit, int UpperLimit) 
{
	int i, count = 0;
	for(i = LowerLimit; i <= UpperLimit; i++) 
	{
		if(primeNumber(i) == 1)
		{
			printf("\t%d ", i);
			count++;
		}
		
		if(count == 5) 
		{
			printf("\n"); 
			count = 0;
		}
	}
}
int main()
{
	int i, LowerLimit, UpperLimit;
	printf("Table of Primes");
	printf("\n===============");
	printf("\nLower Limit: ");
	scanf("%d", &LowerLimit);
	printf("Upper Limit: ");
	scanf("%d", &UpperLimit);
	printf("# of columns: 5");
	printf("\n\n");
	output(LowerLimit, UpperLimit);
	return 0;
}
