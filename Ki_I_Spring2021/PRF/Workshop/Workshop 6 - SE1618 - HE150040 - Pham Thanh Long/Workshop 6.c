#include<stdio.h>
#include<math.h>
#include<conio.h>
#include<string.h>


void sort(float a[], int n)
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

void chon2(float a[], int n)
{	
	int i, max, temp, j, k;
	printf("Befor sorting: ");
	for(i = 0; i < n; i++){
		printf("%.1f\t", a[i]);
	}
	printf("\n");
 	printf("After sorting: ");
 	sort(a, n);
 	for(i = 0; i < n; i++){
		printf("\t%.1f", a[i]);
	}	
	printf("\n");
	
}

void chon3(float a2[], int n)
{
	int i, vitri;
	float x;
	printf("Enter the value x to be searched: ");	
	scanf("%f", &x);
	for(i = 0; i < n; i++)
	{
		if(a2[i] == x){
			vitri = i;
			printf("Found %.1f at position %d", a2[i], vitri);
			printf("\n");
		}
		
	}
		
}

void chon4(float a2[], int n)
{
	int i;
	for(i = 0; i < n; i++){
		printf("%.1f\t", a2[i]);
	}
	printf("\n");
}

int main()
{
	float a[100];
	float a2[100];

	int i, n;
	int luachon;
	while(1){
		printf("   Select options:\n");
		printf("   1. Enter the list  of float number\n");
		printf("   2. Sort the list in increasing order\n");
		printf("   3. Search value x in the list\n");
		printf("   4. Display the list\n");
		printf("   0. Exit\n");
		printf("   Your selection (0 -> 4): ");
		scanf("%d", &luachon);
		
	switch(luachon)
	{	
		case 1:
			printf("\nInput size of array n = ");
			scanf("%d", &n);
			printf("\nEnter %d float nubmers: ", n);
			for(i = 0; i < n; i++)
			{
			scanf("%f", &a[i]);
			a2[i] = a[i];
			}
			break;
		
		case 2:
			chon2(a,n);
			break;
			
		case 3:
			chon3(a2, n);	
			break;
			
		case 4:
			chon4(a2, n);
			break;
			
		case 0:
			return;
 
		}
	}	
}
