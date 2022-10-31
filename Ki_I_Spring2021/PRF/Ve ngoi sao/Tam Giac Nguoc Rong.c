#include<stdio.h>
int main()
{
	int i,j,k,n;
	printf("Enter n = ");	scanf("%d",&n);
	for(i = 1; i <= n; i++)
	{
		for(j = n - i; j >= 0; j--)
		{
			if(i == 1)
			{
				for (j = n - i; j >= 0; j--)
				{
					printf("* ");
				}
			}
			else
			{
				if(j == n - i || j == 0)
					printf("* ");
			else 
				printf("  ");
			}
		}
		printf("\n");
		for(k = 1; k <= i; k++)
		{
			printf(" ");
		}	
	}	
}
