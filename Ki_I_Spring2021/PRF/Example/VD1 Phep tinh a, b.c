//viet chuong trinh nhap vao 2 so a, b, thuc hien cac phep tinh 
#include<stdio.h>

int main ()
{
	int a, b;
	printf("Nhap gia tri a\n");
	scanf("%d", &a);
	printf("Nhap gia tri b\n");	
	scanf("%d", &b);
	printf("a + b = %d\n", a + b);
	printf("a - b = %d\n", a - b);
	printf("a / b = %f\n", (float)a/b);
	printf("a * b = %d", a * b);
	return 0;
}
	
