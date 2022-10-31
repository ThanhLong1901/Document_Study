#include<stdio.h>
#include<string.h>

int main() 
{
	char a[100];
	int n;
	scanf("%d", &n);
	printf("\n");
	int i, j, temp = 0;
	for(i = 0; i <= n; i++)
	{
		scanf("%c", &a[i]);
		fflush(stdin);
		printf("\n");
	}
	for(i = 0; i < n; i++)
	{
		for(j = i + 1; j <= n; j++)
		{
			if(a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	
	for(i = 0; i <= n; i++)
	{
		printf("%c\t", a[i]);
	}

   return(0);
}
