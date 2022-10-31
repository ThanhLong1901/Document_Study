//Input: n = 7
//Output:
//      *
//     ***
//    *****
//   *******
//    *****
//     ***
//      *
//

#include<stdio.h>

void hinhThoi
{ 
    int n, j, i;
  	do 
	{
    printf("Nhap vao so n :");
    scanf("%d", &n);
    } 
	while(n <= 0);
        n = (n/2)*2 + 1;
        for (i = 1; i <= n; i++)
        {
        	for (j = 1; j <= n; j++)
            if (j - 1 >= n/2 - i + 1 && i + n/2 >= j && i <= j + n/2 && j - n/2 <= n - i + 1) 
            printf("*");
            else printf(" ");
            printf("\n");
        } 
}


//Input: n = 7
//Output:
//        *
//      * * *
//    * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *

#include<stdio.h>

void hinhThoi
{ 
    int n, j, i;
  	do 
	{
    printf("Nhap vao so n :");
    scanf("%d", &n);
    } 
	while(n <= 0);
        n = (n/2)*2 + 1;
        for (i = 1; i <= n; i++)
        {
        	for (j = 1; j <= n; j++)
            if (j - 1 >= n/2 - i + 1 && i + n/2 >= j && i <= j + n/2 && j - n/2 <= n - i + 1) 
            printf("*");
            else printf(" ");
            printf("\n");
        } 
}
