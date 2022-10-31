//viet chuong trinh nhap vao 2 so thuc a, b tu ban phim sau do hay tim "min" cua so thuc do

#include<stdio.h>

int main ()
{
	float a, b, min;
	printf("Nhap 2 so thuc a, b: ");
	scanf("%f%f", &a, &b);
	if (a > b)
	{
		printf("Min la: %f", b);
	}
	else
	{
		printf("Min la: %f", a);
	} 
/* Cach 2:	
	if (a / b > 1)
		{
			printf("Min = %f", b);
		}
	else
		{
		printf("Min = %f", a);
		} */


 
/* Cach 3:
	min = a < b ? a : b;
	printf("Min = %f", a); */


	return 0;
}
