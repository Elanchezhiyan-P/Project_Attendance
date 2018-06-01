package com.worksheet;

public class ArrayEg {
	public static void main(String[] args) {
	int n=12344;
	int t = n,i=0 ,r;	
	int a[]= new int[10];
	 r =n%10;
while( t > 0)
{
	r = t%10;
	a[i]=r;
	i++;
	t=t/10;
}
for(i=0;i<10;i++)
{
	System.out.println(a[i]);
}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           