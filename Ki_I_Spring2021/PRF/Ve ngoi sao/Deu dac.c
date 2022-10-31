//Input: n = 6
//Output:
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *
//  * * * * * * * * * * *

#include <stdio.h>
#include <math.h>

void deuDac
{
	int n , i, j;
	printf("Nhap n hang: "); scanf("%d", &n);
	
		for(j = 1; j <= 2 * n - 1; j++)
    	{
		for(i = 1; i <= n; i++) 
	{
    		if(abs(n - j) <= (i - 1))
			{
				printf(" *");
			}
			else
				printf("  ");
		}
    	printf("\n");

   	}
   return 0;
}
