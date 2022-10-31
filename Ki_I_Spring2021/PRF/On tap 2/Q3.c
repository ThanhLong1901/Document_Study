#include<stdio.h>
#include<math.h>

int GCD(int m , int n)
{
	if(m == 0 || n == 0)
		return m + n;
		
	while(m != n) 
	{
        if (m > n) 
            m -= n;
		else
            n -= m;
    }
    return m;	
}

int main()
{
	int m, n;
	printf("Enter m = ");	scanf("%d", &m);
	printf("Enter n = ");	scanf("%d", &n);
	printf("\ngcd(%d.%d) = %d", m, n, GCD(m, n));
	printf("\n\nOUTPUT:");
	printf("\n%d", GCD(m, n));	
}
