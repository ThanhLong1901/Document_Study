#include<stdio.h>
#include<math.h>
#include<conio.h>

int doiXung(int n)
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

int main()
{
	int n, i, m;
	
	do{
		printf("Enter m = "); scanf("%d", &m);
		printf("Enter n = "); scanf("%d", &n);
		if(n < m)
		{
			printf("\nPlease Enter m < n\n");
		}
	}while(n < m);
		for(i = m; i <= n; i++)
		{
			if( doiXung(i) == 1)
			{
			printf("%d ", i);
			}	
		}
return 0;
}
