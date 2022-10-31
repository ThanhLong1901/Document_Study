int doiXung(int n)
{ 
	int r, temp;
	int sum = 0;
	for(temp = n; n!= 0; n /= 10)
	{
		r = n % 10;
		sum = sum * 10 + r;
	}
	if(temp == sum)
	return 1;
	else
	return 0;
}

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
