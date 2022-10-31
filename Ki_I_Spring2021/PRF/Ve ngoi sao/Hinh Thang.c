//Input: n = 7
//Output:
//        **
//       ****
//      ******
//     ********
//    **********
//   ************
//  **************

#include<stdio.h>
 
void hinhThang()
{
		int n, i, j, k;
		do 
		{
            printf("Chieu cao cua hinh thang la  ");
            scanf("%d", &n);
            printf("\n\n");
        } 
		while(n <= 0);
        for(i = 0; i < n; i++)
        {
            for(j = 0; j <= n - i; j++)
            printf("  ");
        {
            for(k = 0; k <= 2*i + 1; k++)
            printf("* ");
            printf("\n");
        }
        }
}

int main()
{
	hinhThang();
}
