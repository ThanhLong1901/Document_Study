#include <stdio.h>
#include <conio.h>
#include <math.h>
  
double myPI(double epsi)
{
    float S = 0;
    float e = 1;
    int n = 0;
    while(e > epsi)
    {
        e = (float)1/(2*n + 1);
        if(n % 2 == 0)
            S = S + e;
        else
            S = S - e;
        n++;
    }
return S;
}

int main()
{
	double epsi;
	printf("epsi = ");	scanf("%lf", &epsi);
    printf("\n PI = %lf", 4 * myPI(epsi));
    return 0;
}
