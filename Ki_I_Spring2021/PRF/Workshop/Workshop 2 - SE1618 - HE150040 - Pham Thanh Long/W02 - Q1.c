#include <stdio.h>
#include <math.h>

int s1 = 0, s2 = 1;
float s3 = 0;
int nt(int n)
{
	int i = 1;
	if (n < 2)
		return 0;
	
	for( i = 2; i <= sqrt(n); i++){
		if(n % i == 0)
		return (0);
	}
	return (1);
}

void display(int n){
	int i;
	for (i = 1; i <= n; i++)
		{
			s1 += i;
			s2 *= i;
			s3 += (float)1/i;
		}
		printf("\ns1 = %d", s1);
		printf("\ns2 = %d", s2);
		printf("\ns3 = %f", s3);
}

int main ()
{
	int n, i;
		
	do{
		printf("\nEnter n = "); scanf("%d", &n);
	if(n <= 5)
		printf("n must be > 5, please reenter!");
					
	}
	while(n <= 5);
	
	display(n);
	
	printf("\nEnter n = "); scanf("%d", &n);
	if (nt(n) == 1) 
	{
		printf("%d is a prime number", n);
	}
	else
		printf("%d is not a prime number", n);
}
