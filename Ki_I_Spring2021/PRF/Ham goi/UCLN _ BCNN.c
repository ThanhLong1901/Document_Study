int GCD(int x , int y){

	if(x == 0 || y==0)
		return x+y;
		
	while(x != y) {
       
        if (x > y) {
            x -= y;
        }else{
            y -= x;
        }
    }
    return x;	
}

int UCLN(int a, int b)
{
   if (a < 0) a = -a; //Truong hop phân so âm
   if (b < 0) b = -b;
   while (a != b)
      a > b ? a -= b : b -= a;
   return a;
}
//LCM = (m * n)/GCD(m,n)
//GCD: Uoc Chung Lon Nhat
//LCM: Boi Chung Nho Nhat
