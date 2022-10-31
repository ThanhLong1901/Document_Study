void selectionSort(int a[], int n)
{ 
	int i, j, k, min, temp;
    for(i=0; i<n-1; i++)
       { 
	   	min= a[i]; k = i;
        for(j = i+1; j<n; j++)
            if(a[j] <min) 
				{
				min= a[j];
				k = j;
				}
        	if(k != i) 
		 	{ 
			temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			}
 		}
}

