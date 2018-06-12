package com.java.lang;

public class ArrayCopy {
public static void main(String args[])
{
	int a[]= { 2,1,3,6,4,6 };
	int b[]= new int[a.length];
	 System.arraycopy(a, 0, b, 0, a.length);
	for (int i=0;i<b.length;i++) {
	 System.out.println(b[i]);
	}
}
}
