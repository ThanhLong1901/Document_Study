//Input: m = 8; n = 4;
//Output:
//		* * * * * * * *
//		*             *
//		*             *
//		* * * * * * * * 

#include<stdio.h>

void chuNhatRong
{
	int m, n, i, j;
	printf("Nhap n hang: ");
	scanf("%d", &n);
	printf("Nhap m cot: ");
	scanf("%d", &m);
	for(i = 1; i <= n; i++)
	{
	for(j = 1; j <= m; j++)
	{
		if ( j == 1 || i == 1 || j == m || i == n )
		{
			printf("* ");
		}
		else
		{
			printf("  ");
		}
	}
	printf("\n");
	}
	return 0;
}
