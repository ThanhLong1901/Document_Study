#include<conio.h>
#include<stdio.h>
#include<string.h>

char noichuoi(char s1[100], char s2[100])
{
            strcat(s1, s2);
            puts(s1);
}

int main()
{
            char s1[100], s2[100];
            printf("nhap chuoi 1\n");
            gets(s1);
            printf("nhap chuoi 2\n");
            gets(s2);
            noichuoi(s1, s2);
}
