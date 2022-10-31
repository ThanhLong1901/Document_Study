//Input: n = 6
//Output:
//            *
//          *   *
//        *       *
//      *           *
//    *               *
//  * * * * * * * * * * *

#include<stdio.h>
#include<math.h>

void deuRong
{
	int n, i, j, k;
	printf("Nhap n hang = ");
	scanf("%d", &n);
	for (i = n; i > 0; i--)
	{
		for(j = 1; j < i; j++)
			{
			printf("  ");
			}
		for (k = 1; k <= (2*(n - i) + 1); k++)
			{
			if (k == 1 || k == 2*(n - i) + 1 || i == 1)
				printf(" *");
			else
				printf("  ");
			}
		printf("\n");
	}
}


