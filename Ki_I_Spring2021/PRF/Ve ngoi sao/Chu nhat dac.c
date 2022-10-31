//Input: m = 8; n = 4;
//Output:
//		* * * * * * * *
//		* * * * * * * *
//		* * * * * * * *
//		* * * * * * * * 

#include<stdio.h>

void chuNhatDac
{
	int m, n, i, j;
	printf("Nhap n hang: ");
	scanf("%d", &n);
	printf("Nhap m cot: ");
	scanf("%d", &m);
	for(i = 1; i <= n; i++)
	{
	for(j = 1; j <= m; j++)
			printf("* ");	
			printf("\n");
	
	}
	return 0;
}
