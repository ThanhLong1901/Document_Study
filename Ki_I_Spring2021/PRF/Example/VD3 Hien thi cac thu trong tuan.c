//viet chuong trinh nhap vao 1 so nguyen. neu so nguyen nay nam trong gia tri tu 2 -> 8 thi hien thi ra cac thu trong tuan trong do so 8 hien thi la chu nhat. neu so khong nam trong khoang tren thi hien thi khong la ngay trong tuan

#include<stdio.h>

int main ()
{
	int n;
	printf("Nhap gia tri n: ");
	scanf("%d", &n);
	printf("\n");
	switch (n)
	{
		case 2:
			printf("Monday");
			break;
		case 3:
			printf("Tuesday");
			break;
		case 4:
			printf("Wednesday");
			break;
		case 5:
			printf("Thursday");
			break;
		case 6:
			printf("Friday");
			break;
		case 7:
			printf("Saturday");
			break;
		case 8:
			printf("Sunday");
			break;
		default:
			printf("Khong phai thu trong tuan");
		}
	return 0;
}
			
