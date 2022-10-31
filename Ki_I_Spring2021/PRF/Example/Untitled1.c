#include<stdio.h>

int main()

//{
////	int s = 35;
////	printf("%d%d%d", s == 35, s+20,s>40);
//
////	int g=1;
////	printf("%d %d %d",g,++g,g++);
//
////	int p,q,h;
////	for(p=1;p<=3;p++)
////	for(q=1;q<=2;q++)
////	h=p+q;
////	printf("%d\n",h);
//
////	char i=127;
////	i++;
////	printf("%d",i);
////	return 0;
//
//
////int n;
////char c;
////scanf("%d",&n);
////c=getchar();
////printf("%d, %d", n,c);
////getch();
////return 1;	
//}

void f1 ( int*a, int n)
{ int i,j,t;
for (i=0;i<n-1;i++)
for (j=n-1; j>i; j--)
if (a[j]>a[j-1])
{ t=a[j];
a[j]=a[j-1];
a[j-1]=t;
}
}
void f2 (int a[], int n)
{ int i;
for (i=0;i<n;i++) printf ("%d%s ", a[i], (i<4 ? "," : "" ));
}
int main()
{ int a[5]= { 5, 1, 2,4, 3 };
f1(a,5);
f2(a,5);
getch();
return 1;
}
