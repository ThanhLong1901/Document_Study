#include<stdio.h>
#include<math.h>
#include<string.h>

void input(int a[], int n)
{

	int i;
	for( i = 0; i <= n - 1; i++)
	{	
		scanf("%d", &a[i]);
	}
}

void output(int a[], int n)
{

	int i;
	for(i = 0; i < n; i++)		
	{
		printf("%d ", a[i]);
	}
}

void sort(int a[], int n)
{ 
	int temp;
	int i, j;
    for(i = 0; i < n - 1; i++)
	{
        for(j = i + 1; j < n; j++)
		{
            if(a[i] < a[j])
			{
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;        
            }
        }
    }
}



int main ()
{
	int a[100];
	int n, i;
	printf("Enter n = ");	scanf("%d", &n);
	
	input(a, n);
	sort(a, n);	
	printf("OUTPUT:\n");	
	output(a, n);
	printf("\n\n");
}
