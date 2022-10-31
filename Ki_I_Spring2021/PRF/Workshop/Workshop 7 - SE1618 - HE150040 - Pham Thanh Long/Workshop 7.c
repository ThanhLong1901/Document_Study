#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <windows.h>
#include <stdbool.h>

void xoa(char s3[],int vitrixoa)
{
	int i;
	int n = strlen(s3);
    for(i = vitrixoa; i < n; i++)
    s3[i] = s3[i + 1];
	s3[n - 1] = '\0'; 
}

void xoakt(char*s3)
{
	int i;
    for(i = 0;i < strlen(s3); i++)
		if(s3[i] == ' ' && s3[i + 1] == ' ')
		{
			xoa(s3, i);
			i--;
		}
    if(s3[0] == ' ')
		xoa(s3, 0);
    if(s3[strlen(s3) - 1] == ' ')
		xoa(s3, strlen(s3) - 1);
}

int demtu(char s[])
{
    int i, dem = 0;
    for(i = 0; i < strlen(s); i++)
        if(s[i] == ' ' && s[i + 1] != ' ' && s[i + 1] != '\0')
            dem++;
 
        if(s[0] != ' ')
            dem++;
        return dem;
}
	
void chon2(char s[])
{
    char *chcp;
    printf("The original string: ");
    puts(s);
    printf("Number of words in the string: %d,  they are", demtu(s));
    printf("\n");
    chcp = strtok(s," ");
    while (chcp != NULL)
    {
          printf("%s\n", chcp);
          chcp = strtok(NULL," ");
    }
}

void chon3(char s2[])
{
	int i;
    printf("The original string: %s", s2);
	if(s2[0] != ' ')
	{
		s2[0] = s2[0] - 32;	
		for(i = 1; i < strlen(s2); i++)
		{
			if(s2[i] == ' ' && s2[i + 1] != ' ' && s2[i + 1] >= 'a' && s2[i + 1] <= 'z' )
			{
			s2[i + 1] = s2[i + 1] - 32;
			}	          
		}
	}
	else
	{
	for(i = 0; i < strlen(s2); i++)
	{
		if(s2[i] == ' ' && s2[i + 1] != ' ' && s2[i + 1] >= 'a' && s2[i + 1] <= 'z' )
 		{
			s2[i + 1] = s2[i + 1] - 32;
 		}          
	}
	}
	printf("\nThe proper form: %s", s2);
	printf("\n");
}

void chon5(char s4[])
{
	bool check = true;
	int i;
	for(i = 0; i < strlen(s4); i++){
		if(isalpha(s4[i]) == 0 && s4[i] != 32)
		{
			check = false;
			break;
		}	
	}
	if(check == true)	
		printf("The string: %s is a valid name\n", s4);
	else 
		printf("The string: %s is not a valid name\n", s4);
}


int main()
{
	char s[100];
	char s2[100];
	char s3[100];
	char s4[100];
	int i, n;
	int luachon;
	while(1)
	{
		printf("   Chose one of the following options:\n");
		printf("   1. Input a string\n");
		printf("   2. Split a string into words\n");
		printf("   3. Convert a string into proper form\n");
		printf("   4. Remove redundant spaces\n");
		printf("   5. Check valid name\n");
		printf("   0. Exit\n");
		printf("   Your selection (0 -> 6): ");
		scanf("%d", &luachon);
		
	switch(luachon)
	{
		case 1:
			printf("\nInput a string: ");
			fflush(stdin);
			gets(s);
			strcpy(s2, s);
			strcpy(s3, s);
			strcpy(s4, s);

			break;
			
		case 2:
			chon2(s);
			break;
			
		case 3:
			chon3(s2);
			break;
			
		case 4:
			xoakt(s3);
			puts(s3);
			break;
			
		case 5:
			chon5(s4);
			break;
			
		case 0:
			return;
			
	}
	}
}

