//Hoan doi 6 so cuoi cua day
//Input: 1 8 7 6 4 5 2 9
//Ouput: 1 8 9 2 5 4 6 7

#include <stdio.h>
 
int main()
{
    int a[100];
    int n, i;
	printf("Enter n = ");	scanf("%d", &n);
    for(i = 0; i < n; i++)
	{
        printf("a[%d] = ", i);
        scanf("%d", &a[i]);
    }   
    for(i = 0; i < n - 6; i++)
	{
        printf("%d ", a[i]);
    }
    for(i = n - 1; i >= n - 6; i--)
    {    
		printf("%d ", a[i]);       
    }    
}
