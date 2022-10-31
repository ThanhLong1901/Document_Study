//Input: m = 6, n = 7
//Output:
// 
//      *  *     *  *
//   *  *  *  *  *  *  *
//   *  *  *  *  *  *  *
//      *  *  *  *  *
//         *  *  *
//            *


#include<stdio.h>

int main()
{
	
//void hinh7()
//{	
	int i, j;
	system("cls");
	int m = 6, n = 7;
   	for(i = 1; i < 7; i++)
	{
        for(j = 1; j <= 7; j++)
        { 
			if( !(( i==1 && (j == 1 || j== 4 || j== 7))
            || (i == 4 && (j == 1 || j == 7))
	        || (i == 5 && (j <= 2 || j >= 6))
	        || (i == 6 && (j <= 3 || j >= 5))))
			{
	 	    	printf(" * ");
	 	    } 
			else 
			{
	 	 		printf("   ");
	 	    }
		}
	 		printf("\n");
	 	    
	}
//} 
}
