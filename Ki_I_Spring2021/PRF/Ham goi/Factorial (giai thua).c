long giaiThua(int n)
{
	int i; long Area = 1;
	for(i = 1; i <= n; i++)
		Area *= i;
	return Area;
}

long giaiThua(int n)
{
	if(n == 0)
		return 1;
		return n * giaiThua(n - 1);
}
