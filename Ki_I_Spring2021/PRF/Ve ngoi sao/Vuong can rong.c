//Input: n = 6
//Output:
//  *
//  * *
//	*   *
//	*     *
//	*       *
//	* * * * * *

#include<stdio.h>

void tamGiacRong
{
	int n, i, j;
	printf("Nhap n hang: "); scanf("%d", &n);
	for(i = 1; i <= n; i++)
	{
		for(j = 1; j <= i; j++)
		{
			if( i == 1 || i == 2 || i == n || i == j || j == 1)
			{
				printf("* ");
			}
			else
				printf("  ");
		}
		printf("\n");
	}
}
