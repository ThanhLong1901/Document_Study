//#include<stdio.h>
//#include<string.h>
//#include<conio.h>
//
//int main()
//{
//	int i;
//	char s[100];
//	do
//	{
//		printf("\nEnter string: ");
//		scanf("%s", s);	
//		
//		if(strlen(s) % 2 != 0)
//		{
//			printf("\nPlease enter even number of characters");
//		}
//		else
//		{
//		printf("\nResult: ");
//		for(i = 0; i < strlen(s)/2; i++)
//		{
//		printf("%c", s[i]);
//		}
//	}
//}
//	while(strlen(s) % 2 != 0);
//}

#include<stdio.h>
#include<string.h>
#include<conio.h>

int main()
{
	int i;
	char s[100];
	printf("\nEnter string: ");
	scanf("%s", s);	
		for(i = 0; i < strlen(s)/2; i++)
		{
		printf("%c", s[i]);
		}
}
