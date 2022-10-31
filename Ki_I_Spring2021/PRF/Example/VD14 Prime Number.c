#include<stdio.h>
#include<math.h>

int nt(int n)
{
	int i = 1;
	if (n < 2)
	return 0;
	
	for( i = 2; i <= sqrt(n); i++)
	if(n % i == 0)
	return (0);
	return (1);
}

/*
int main ()
{
	int n;
	printf("Enter n = "); scanf("%d", &n);
	if (nt(n) == 1) 
	{
		printf("%d is a prime number", n);
	}
	else
	printf("%d is not a prime number", n);
}
*/


int dem()
{   
	int i = 2;
    int n, count = 0;
    printf("Enter n = ");
    scanf("%d", &n);
    while(count < n)
    {
    if(nt(i) == 1)
	{
    printf("%d ",i);
	count++;
	}
    i++;
    }
}

int main ()
{
	dem();
}


