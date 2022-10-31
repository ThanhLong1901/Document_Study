// VIet chuong trinh de nhap n so nguyen tu ban phim sau do tinh tong cua n so do


#include<stdio.h>

int main ()
{
	int n, T = 0, a, i = 1;
	printf("Nhap gia tri n: ");
	scanf("%d", &n);
	for( i = 1; i <= n; i++)
	{
		printf("a = ");
		scanf("%d", &a);
		T = T + a;
	}
		printf("Sum = %d", T);
	return 0;
}



/*
	while ( i <= n)
		{
			printf(" a = ");
			scanf("%d", &a);
			T += a;
			i++;
		}
	printf("Sum = %d", T);
	return 0;
}
*/



/*
	do
		{
		printf(" a = ");
		scanf("%d", &a);
			T += a;
			i++;
		}
	while ( i <= n);
	printf("Sum = %d", T);
	return 0;
}
*/

