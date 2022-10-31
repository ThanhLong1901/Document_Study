//Nhap 1 xau ki tu va hien thi ra xau moi bang cach cong moi ki tu cua xau cu tang len 1 don vi

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void input(char s[])
{
	printf("Enter a string s: ");
	fflush(stdin);
	gets(s);
}

void display(char s[])
 {
	int i;
	for (i = 0; i < strlen(s); i++) {
		s[i] = s[i] + 1;
	}
	printf("Xau moi se la:\t%s\n",s);
}
int main () {
	char s[100];
	input(s);
	display(s);
}
