#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void coinToss()
{
	int number, tosses;
	printf("Enter number of tosses: ");
	scanf("%d", &number);
	srand(time(NULL));
	tosses = 1 + rand() % number;
	printf("Number of tosses: %d", number);
	printf("\nNumber of heads: %d", tosses);
	printf("\nNumber of tails:\t %d", number-tosses);
	float percen = (float)tosses/number*100;
	printf("\npercentage of heads for all tosses: %.2f", percen);
}

int main(){
	int check;
	do
	{
		printf("Select options:\n1. Start tossing\n2. Exit\n");
		printf("Your selection (0 -> 1): ");
		scanf("%d", &check);	
	}
	while(check != 1 && check != 2);
	if(check == 1) coinToss();
	if(check == 2) return 0;
}
