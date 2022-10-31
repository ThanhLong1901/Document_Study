#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    char s[50];
    char *chcp;
    printf("Nhap chuoi: ");
    gets(s);
    puts(s);
    printf("\n");
    chcp=strtok (s," ");
    while (chcp != NULL)
    {
          printf("%s\n", chcp);
          chcp = strtok(NULL," ");
    }
    printf("\n");
    system ("pause");
    return 0;
}
