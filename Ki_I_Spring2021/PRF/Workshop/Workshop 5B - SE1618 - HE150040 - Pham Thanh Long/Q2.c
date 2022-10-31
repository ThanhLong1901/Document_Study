#include <stdio.h>

void daoNguoc()
{
	char a[256];
	int n = 0, i;
	printf("Enter string ended by . : ");
	do
	{
		a[n] = getchar();
	}
	while(a[n++] != '.');
		printf("The original string: ");
		for(i = 0; i < n - 1; i++)
			putchar(a[i]);
		printf("\nThe reverse string: ");
		for(i = 0; i < n; i++)
		putchar(a[n - i - 2]);
}

int main()
{
	char check;
	do
	{
		daoNguoc();
		printf("\n\nAnother run (y/n)? ");
		scanf("%s", &check);
		if(check == 'n')	
		return 0;
	}
	while(check == 'y');
}
