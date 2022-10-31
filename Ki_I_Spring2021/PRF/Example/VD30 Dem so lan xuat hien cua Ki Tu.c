#include<stdio.h>
#include<string.h>
#include<conio.h>
int main()
{
	char s[100];
	int i, j, max;
	gets(s);
	printf("\n");
	int dem, n = strlen(s);
	for(i = 'A'; i <= 'z'; i++)
	{
		dem = 0;
		for(j = 0; j < n; j++)
			if(s[j]==i) dem++;
			if(dem != 0) 
	printf("%c:%d ", i, dem);
	
	if(dem > max)
	{
		printf("%c", s[i]);
	}
	}
	
	getch();
return 0;
}
