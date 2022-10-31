#include<stdio.h>
#include<math.h>
#include<string.h>

//So nguyen to
int primeNumber(int n)
{
	int i;
	if (n < 2)
	return 0;
	
	for( i = 2; i <= sqrt(n); i++)
	if(n % i == 0)
	return (0);
	return (1);
}

//So doi xung
int SoDoiXung(int n)
{
	int a = 0, b, c = n;
	while(n != 0){
		b = n % 10;
		a = a*10 + b;
		n = n/10;
	}
	if(a == c) 
	return 1;
	return 0;
}

//Nhap vao cac so
void input(int a[], int n)
{

	int i;
	for( i = 0; i <= n - 1; i++)
	{
		printf("a[%d] = ", i);	scanf("%d", &a[i]);
	}
}

//In ra cac so da nhap
void output(int a[], int n)
{

	int i;
	for(i = 0; i <= n - 1; i++)		
		printf("%d\t",a[i]);
		
}


//Sap xep theo thu tu tang dan(Sap Xep Chon)
void sort(int a[], int n)
{ 
	int i, j, k, min, temp;
    for(i = 0; i < n - 1; i++)
       { 
	   	min = a[i]; k = i;
        for(j = i + 1; j < n; j++)
            if(a[j] < min) 
				{
				min = a[j];
				k = j;
				}
        	if(k != i) 
		 	{ 
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
			}
 		}
}

//Sap xep theo thu tu tu lon => nho(Sap Xep Noi Bot)
void bubbleSort(int a[], int n) // 1 chieu
{ 
  	int i, t, k, doicho;
    k = 1;
    while(1)
       { 
	   	doicho=0;
        for(i=0; i<n-k; i++)
            if(a[i+1] < a[i]) 
            { 
				int tmp = a[i+1];
				a[i+1] = a[i];
				a[i] = tmp;
                doicho = 1;
            }
         	if(!doicho) 
			break;
          	k++;  
       	}
}

//void bubbleSort(char a[][20], int n) // 2 chieu
//{
//	int i, k, doicho;
//	char t[20];
//	k = 1;
//	while(1)
//	{
//		doicho = 0;
//		for(i = 0; i < n - k; i++)
//		if(strcmp(a[i], a[i + 1]))
//		{
//			strcpy(t , a[i]);
//			strcpy(a[i], a[i + 1]);
//			strcpy(a[i + 1], t);
//			doicho = 1;
//		}
//		if(!doicho)
//		break;
//		k++;
//	}
//}

int main ()
{
	int a[100];
	int n, i;
	printf("Enter n = ");	scanf("%d", &n);
	//Hien thi cac so da chon
	input(a, n);
	output(a, n);
	printf("\n\n");
	
	//So nguyen to
	for(i=0; i <= n-1; i++)	
	{
		if(primeNumber(a[i]) == 1)
  		printf("%d\t",a[i]);
	}
	printf("\n\n");
	
	//So doi xung
	for(i=0; i <= n-1; i++)		 
   		{
		if(SoDoiXung(a[i]) == 1)
   			printf("%d\t", a[i]);
		}
	printf("\n\n");
	
	//Sap xep thu tu nho => lon(Sap Xep Chon)
	sort(a, n);
	output(a, n);	
	printf("\n\n");
	
	//Sap xep thu tu lon => nho(Sap Xep Noi Bot)
	bubbleSort(a, n);
	output(a, n);

return 0;
}
