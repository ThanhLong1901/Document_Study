//Viet chuong trinh giao hoan 2 so nguyen a, b. Biet co 2 ham


#include<stdio.h>
/*
void gh1(int a, int b)
{
	int T;
	T = a; a = b; b = T;
	printf("\n a = %d \n b = %d", a, b);
}
int main ()
{
	int a = 5, b = 6;
	gh1(a, b);
	printf("\n a = %d \n b = %d", a, b);
	return 0;
}
*/

void gh2(int *a, int *b)
{
	int T;
	T = *a; *a = *b; *b = T;
	printf("\n a = %d \n b = %d", *a, *b);
}
int main ()
{
	int a = 5, b = 6;
	gh2(&a, &b);
	printf("\n a = %d \n b = %d", a, b);
	return 0;
}
