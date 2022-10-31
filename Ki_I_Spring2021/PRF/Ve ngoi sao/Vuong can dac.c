//Input: n = 5;
//Output                     
//    *
//    * *
//	  * * *
//	  * * * *
//	  * * * * *

#include<stdio.h>

void tamGiacDac
{
	int n, i, j;
	printf("Nhap n hang: "); scanf("%d", &n);
	for(i = 1; i <= n; i++)
	{
		for(j = 1; j <= i; j++)
		{
		printf("* ");
		}
		printf("\n");
	}
}
