#include<stdio.h>
#include<string.h>

char InHoaKyTuDau(char s[])
{
	int i;
	if(s[0] != ' ')
	{
		s[0] = s[0] - 32;	
		for(i = 1;i < strlen(s); i++)
		{
			if(s[i] == ' ' && s[i + 1] != ' ' && s[i + 1] >= 'a' && s[i + 1] <= 'z' )
			{
			s[i + 1] = s[i + 1] - 32;
			}	          
		}
	}
	else
	{
	for(i = 0; i < strlen(s); i++)
	{
		if(s[i] == ' ' && s[i + 1] != ' ' && s[i + 1] >= 'a' && s[i + 1] <= 'z' )
 		{
			s[i + 1] = s[i + 1] - 32;
 		}          
	}
	}
printf("%s",s);
}

int main()
{
	char s[100];
	printf("Nhap chuoi: ");
	gets(s);
	InHoaKyTuDau(s);
}

char InHoaKyTuDau(char s1[])
{
	int i;
	if(s1[0] != ' ')
	{
		s1[0] = s1[0] - 32;	
		for(i = 1;i < strlen(s1); i++)
		{
			if(s1[i] == ' ' && s1[i + 1] != ' ' && s1[i + 1] >= 'a' && s1[i + 1] <= 'z' )
			{
			s1[i + 1] = s1[i + 1] - 32;
			}	          
		}
	}
	else
	{
	for(i = 0; i < strlen(s1); i++)
	{
		if(s1[i] == ' ' && s1[i + 1] != ' ' && s1[i + 1] >= 'a' && s1[i + 1] <= 'z' )
 		{
			s1[i + 1] = s1[i + 1] - 32;
 		}          
	}
	}
printf("%s",s1);
}


