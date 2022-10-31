#include<stdio.h>
#include<string.h>

void them(char s[], int viTriThem, char kiTuThem[])
{
	printf("Ki Tu Muon Them: ");
	scanf("%c", &kiTuThem);
	printf("Vi tri Xoa: ");
	scanf("%d", &viTriThem);
	int n = strlen(s);
	int i;
	for(i = n - 1; i >= viTriThem; i--)
	{
		s[i + 1] = s[i];
	}
	s[viTriThem] = kiTuThem;
	s[n + 1] = '\0';
}

int main()
{
	char s[100];
	int n;
	printf("Nhap chuoi: ");
	gets(s);
	int viTriThem;
	char kiTuThem[100];
	them(s, viTriThem, kiTuThem);
	printf("Chuoi sau khi them: %s", s);

//	Them(s, 2, 't');
//	printf("Chuoi moi la: %s", s);
	getch();
	
}
