//hay viet phuong trinh nhap vao 2 so nguyen a, b. Sau do hien thi gia tri a / b ra man hinh va kiem tra ket qua co la so thuc khong?

#include<stdio.h>

int main ()
{
	int a, b;
	printf("Nhap gia tri a:\n");
	scanf("%d", &a);
	printf("nhap gia tri b:\n");
	scanf("%d", &b);
	if( a % b == 0)
	{
		printf(" a chia het cho b\n");
		printf(" a / b = %d", a / b);
	}
	else
	{
		printf("a / b khong la so thuc");
	}
return 0;
}
