int Area(int n)
{
	int mul = 1;
	while ( n != 0)
		{
		mul *= n % 10;
		n /= 10;
	}
	return mul;
}
