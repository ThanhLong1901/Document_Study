#include<stdio.h>
#include<conio.h>
#include<string.h>


void xoa(char s[100], int viTriXoa)
{
	int i;
	int n = strlen(s);
    for(i = viTriXoa; i < n; i++)
    s[i] = s[i+1];
	s[n-1] = '\0'; 
}

void xoaKiTu(char*s)
{
	int i;
    for(i = 0; i < strlen(s); i++)
		if(s[i] == ' ' && s[i+1] == ' ')
		{
			xoa(s, i);
			i--;
		}
    if(s[0] == ' ')
		xoa(s, 0);
    if(s[strlen(s) - 1] == ' ')
		xoa(s, strlen(s) - 1);
}

void main()
{
    char s[100];
    printf("VD: ");
    gets(s);
	  xoaKiTu(s);
    puts(s);

}

//void removeRedSpaces(char s[])
//{
//	int n, low, up, i, j;
//	char x[100];
//	n = strlen(s);
//	i = 0;
//	j = n - 1;
//	while(i < n && s[i] == ' ')
//	i++;
//	low = i;
//	while(j > 0 && s[j] == ' ')
//	j--;
//	up = j;
//	if(low > up)
//	{
//		strcpy(s, "");
//		return;
//	}
//	strcpy(x, "");
//	i = low;
//	j = 0;
//	while(i <= up)
//	{
//		while(i < up && s[i] == ' ')
//		i++;
//		while(i <= up && s[i] != ' ') 
//		x[j++] = s[i++];
//		if(i <= up) x[j++] = ' ';
//	}
//	x[j] = '\0';
//	strcpy(s, x);
//}
//
//
//int main ()
//{
//	char s[] = "	Ha		Noi		Mua		Thu		";
//	removeRedSpaces(s);
//	printf("\n%s", s);
//}


