package com.worksheet;

public class CommandLineArgs {
public static void main(String[] args) {
	double a[] = new double[100];
	double sum=0;
	for (int i=0;i<args.length;i++)
	{
		a[i]=Double.parseDouble(args[i]);
		sum+=a[i];
	}
    System.out.println(sum); 
}
}  