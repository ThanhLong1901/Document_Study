void bubbleSort(int a[], int n)
{ 
  	int i, t, k, doicho;
    k = 1;
    while(1)
       { 
	   	doicho=0;
        for(i=0; i<n-k; i++)
            if(a[i+1]<a[i]) 
            { 
				int tmp=a[i+1];
				a[i+1]=a[i];
				a[i]=tmp;
                doicho = 1;
            }
         	if(!doicho) 
			break;
          	k++;  
       	}
}
