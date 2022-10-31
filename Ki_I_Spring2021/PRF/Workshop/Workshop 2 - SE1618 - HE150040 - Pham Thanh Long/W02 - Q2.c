#include<stdio.h>
#include<math.h>

int nt(int n)
{
	int i;
	if(n < 2)
	return 0;
	
	for (i = 2; i <= sqrt(n); i++)
	if(n % i == 0)
	return 0;
	return 1;
}

int GCD(int m , int n){

	if(m == 0 || n == 0)
		return m + n;
		
	while(m != n) {
       
        if (m > n) {
            m -= n;
        }
		else
		{
            n -= m;
        }
    }
    return m;
}    
int main ()
{
	int m, n, i, j, a;
	printf("Enter m = "); scanf("%d", &m);
	printf("Enter n = "); scanf("%d", &n);
	
	for(i=1; i <= ( m<n? m:n ); i++){
		if(m % i== 0 && n % i == 0 && nt(i) == 1)
		{
				printf(" %d ",i);
		}
	}
	printf("\nGCD = %d",GCD(m, n));
	printf("\nLCM = %d",(m * n)/GCD(m,n));
						
}
