package com.worksheet;

public class PerfectNumber {
	int num;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isPerfect()
	{
	int count=0;
	for(int i=1;i<=(num/2);i++)
	{
		count = count + i;
	}
	if(count == num)
	{
		return true;
	}else
	{
		return false;
	}
	}
	public static void main (String[] args)
	{
		PerfectNumber a = new PerfectNumber();
		a.setNum(6);
		System.out.println(a.isPerfect());
	}
}
