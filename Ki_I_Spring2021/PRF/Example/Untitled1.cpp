#include<stdio.h>

//int main(void)
//{
//	int ref[] = {1,2,4};
//	int *ptr;
//	int index;
//	for(index = 0, ptr = ref; index < 3; index++, ptr++)
//	{
//		printf("%d%d", ref[index], *ptr);
//	}
//}
// 112244

//void inc(int *a)
//{
//	for(int i = 0; i < 5; i++)
//	(*a)++;
//}
//int main()
//{
//	int x = 1;
//	inc(&x);
//	printf("%d", x);
//}
//  6
int main()
{

int i;

char mess[] = "Hello";
char *p;
p = mess;
for(int i = 0; i < 4; i++)
printf("%s\n", p+i);

}
