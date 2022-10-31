#include <stdio.h>
#include <string.h>
 
int WordCount(char str[], int length)
{
	int i;
    int word = (str[0] != ' ');
    for (i = 0; i < length - 1; i++)
    {
        if (str[i] == ' ' && str[i + 1] != ' ')
        {
            word++;
        }
    }
    return word;
}
 
void Correct(char str[], int length)
{
	int i;
	//Xoa khoang trang o dau va cuoi trong chuoi
    int first = 0, last = length - 1;	
    while (first < last && str[first] == ' ')
        first++;
    while (last > first && str[last] == ' ')
        last--;
 
    //Viet hoa chu cai dau tien
    if (str[first] >= 'a' && str[first] <= 'z')
        str[first] -= 32;
    for (i = first + 1; i <= last; i++)
    {
        //Dua het ve chu thuong
        if (str[i] >= 'A' && str[i] <= 'Z'){
            str[i] += 32;
        }
        if (i + 1 <= last)
        {
            //Bo khoang trang o giua
            if (str[i] == str[i + 1] && str[i] == ' ')
            {
                continue;
            }
            //Neu la chu cai dau moi tu thi viet hoa
            if (str[i] == ' ' && str[i + 1] >= 'a' && str[i + 1] <= 'z')
            {
                str[i + 1] -= 32;
            }
        }
        printf("%c", str[i]);
    }
}
 
int main()
{
    char str[100];
    //Nhap chuoi
    printf("\nNhap chuoi: ");
    fgets(str, sizeof str, stdin);
    //Do su dung "fgets" nen chuoi cua chung ta se doc ca ky tu "\n"
    //Xoa bo no di
    int length = strlen(str) - 1; 
    str[length] = '\0';
    printf("So tu cua \"%s\" la %d", str, WordCount(str, length));
    printf("\nXau chuan hoa la: ");
    Correct(str, length);
}
