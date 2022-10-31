//Dem Ki Tu Hoa
//#include <stdio.h>
//#include <conio.h>
//#include <string.h>
//
//int demkthoa(char s[])
//{
//       int i,dem=0;
//       for (i = 0; i < strlen(s); i++)
//        if( s[i]>='A' && s[i]<='Z' )
//                     dem++;
//       return dem;
//}
//
//void main()
//{
//    char s[100];
//    printf("Nhap xau ki tu: ");
//    gets(s);
//    printf("so ki tu hoa la  :  %d",demkthoa(s));
//    getch();
//}


//Dem Ki Tu Thuong
#include <stdio.h>
#include <conio.h>
#include <string.h>
int demktthuong(char s[])
{
       int i,dem=0;
       for (i=0;i<strlen(s);i++)
        if ( s[i]>='a' && s[i]<='z' )
                     dem++;
       return dem;
}
int main()
{
    char s[100];
    printf("Nhap xau ki tu: ");
    gets(s);
    printf("so ki tu thuong la  :  %d",demktthuong(s));
    getch();
}
