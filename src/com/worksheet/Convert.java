package com.worksheet;

public class Convert {
	private double celsius;
	private double farenheit;
		public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
     public double getFarenheit() {
		return farenheit;
	}
     public void setFarenheit(double farenheit) {
		this.farenheit = farenheit;
	}
     public double celsius() {
    	double celsiuss = 5.0 / 9.0 * ( farenheit - 32 );
    	 return celsiuss;
     }
     public double farenheit() {
    	double farenheitt = 9.0 / 5.0 * celsius + 32;
      return farenheitt;
     }
	public static void main (String[] args)
	{
		Convert a= new Convert();
		a.setCelsius(63.0);
		a.setFarenheit(23.0);
		System.out.println(a.celsius());
		System.out.println(a.farenheit());
	}
}
