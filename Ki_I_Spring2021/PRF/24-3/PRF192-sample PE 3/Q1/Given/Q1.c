#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int GCD(int m , int n){

	if(m == 0 || n==0)
		return m+n;
		
	while(m != n) {
       
        if (m > n) {
            m -= n;
        }else{
            n -= m;
        }
    }
    return m;	
}

int main() {
  system("cls");
  printf("\nTEST Q1 (4 marks):\n");
  printf("1. Run TC 1\n");
  printf("2. Run TC 2\n");
  //tc holds the test case number of test
  int tc;
  printf("Enter TC (0 to exit): "); scanf("%d",&tc);
  if(tc==0) return(0);
  //============================================================
  switch(tc) {
    case 1: { // Start of TC 1

         int a, b, c;
         printf("Enter a = "); scanf("%d",&a);
        //==FOR TC 1, WRITE YOUR STATEMENTS FROM HERE=========
			b = a/60;
			c = a - 60*b;


        //=========TO HERE============
         printf("a = %d, b = %d, c = %d\n", a, b, c); 
         // OUTPUT for marking:
         printf("\nOUTPUT:\n");
         printf("%d %d %d\n", a, b, c); 
         
        };  break; // The end of TC1     

    case 2: { // Start of TC 2

         int m, n; double s;
         int i;
         printf("Enter m = "); scanf("%d",&m);
         printf("Enter n = "); scanf("%d",&n);

        //== TC 2, WRITE YOUR STATEMENTS FROM HERE =========



 
         //=========TO HERE============
         //-------------------------------------------------------
         if(n<m)
         {
         	for(i = 1; i <= n; i++)
         	{
         		s+= (float)1/i;	
			}
		    printf("s = %.4f\n",s);
			printf("\nOUTPUT:\n");
			printf("%.4f\n", s);
		 }

        else 
        {
            printf("s = %d\n", (int)m*n/GCD(m,n));
 
         // OUTPUT for marking:
			printf("\nOUTPUT:\n");
            printf("%d\n",(int)m*n/GCD(m,n));
   		}

        };  break; // The end of TC2     
         
  }

  printf("\n");
  system ("pause");
  return(0);
}
