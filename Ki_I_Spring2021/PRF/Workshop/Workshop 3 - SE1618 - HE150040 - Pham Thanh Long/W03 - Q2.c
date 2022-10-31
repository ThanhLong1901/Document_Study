#include<stdio.h>
#include<math.h>


void timNghiem(int a, int b, int c)
{
	float denta;
	denta =  b * b - 4 * a * c;
	if (denta < 0)
	{
		printf("\nPhuong trinh vo nghiem");
	}
	else if (denta == 0)
	{
		printf("\nPhuong trinh co nghiem kep la: %d", (-b)/(2*a));
	}
	else
	{	
		printf("\nPhuong trinh co nghiem la: x1 = %f", (- b + sqrt(denta))/( 2 * a));
		printf("\nPhuong trinh co nghiem la: x2 = %f", (- b - sqrt(denta))/( 2 * a));
	}
}

int main ()
{
	int a, b, c;
	printf("Nhap 3 gia tri a, b , c: ");
	scanf("%d%d%d", &a, &b, &c);
	timNghiem(a, b, c);
return 0;
}
