#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char s[50];
    char *chcp;
    int i, count;
    printf("Nhap chuoi: ");
    gets(s);
    puts(s);
    printf("\n");
    chcp=strtok (s," ");
    while (chcp != NULL)
    {
        count++;
    }
    if(count % 2 == 0)
    {
	for(i = 0; i < strlen(s); i++)
	{
		if(s[i] >= 'a' && s[i] < 'z')
		s[i] = s[i] - 32;
	}
    printf("%s", chcp);
	chcp = strtok(NULL," ");	
	}
    return 0;
}
