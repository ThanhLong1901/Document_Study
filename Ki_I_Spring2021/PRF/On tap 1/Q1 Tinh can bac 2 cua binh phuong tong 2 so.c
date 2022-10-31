//Tinh can cua tong binh phuong 2 so x, y

#include<stdio.h>
#include<math.h>

int main ()
{
	float x, y;
	printf("Enter x, y = ");	scanf("%f%f", &x, &y);
	printf("Square root = %.3f", sqrt(pow(x, 2) + pow(y, 2)));
return 0;
}
