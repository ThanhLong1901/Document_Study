#include<stdio.h>
#include<string.h>

void display(char s[],char p[])
{
	printf("%s",s);
	gets(s);
	printf("%s",p);
	gets(p);
}

int main () 
{
	char s[100];
	char p[100];
	display(s, p);
	if(strstr(s,p) != NULL)
		printf("OKI");
	else
		printf("NOT OKI");
}
