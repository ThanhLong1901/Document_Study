//Nhap n hang: 5
//         * * * * *
//       * * * * * *
//     * * * * * * *
//   * * * * * * * *
// * * * * * * * * *

#include <stdio.h>
#include <math.h>

int main()
{
int n , i, j;
	printf("Nhap n hang: "); scanf("%d", &n);
	
		for(j = 1; j <= 2 * n - 1; j++)
    	{for(i = 1; i <= n; i++) 
	{
    		if(abs(n - i) >= (j - 1))
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
