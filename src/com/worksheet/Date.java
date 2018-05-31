package com.worksheet;

public class Date {
	private int month;
	private int day;
	private int year;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
public void displayDate()
{
	System.out.println(day + "/" + month + "/" + year);
}
public static void main (String[] args)
{
	Date day = new Date();
	day.setDay(30);
	day.setMonth(11);
	day.setYear(1997);
	day.displayDate();
	}
}
