package com.worksheet;

public class Shape {
 private double length;
 private double breadth;
 private double perimeter;
 private double area;
 
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	if(length>0 && length < 20.0)
	{
	this.length = length;
    }else
    {
    	System.out.println("sorry u have entered wrong value");
    }
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	if(breadth>0 && breadth < 20.0)
	{
	this.breadth = breadth;
    }else
    {
    	System.out.println("sorry u have entered wrong value");
    }
	}
	public double Perimeter()
	{
		 return (2*length)+(2*breadth);
	}
	public double area()
	{
		return (length * breadth);
	}
public static void main (String[] args) {
 	
Shape a = new Shape();
a.setLength(19.0);
a.setBreadth(3.3);


System.out.println("The rectangle shape value is : "  + a.Perimeter());
System.out.println("The area value is : " + a.area());
}
}

