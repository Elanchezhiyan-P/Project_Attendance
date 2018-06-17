package com.java.lang;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {
	
	public ExceptionExample() {
		try
		{
			URL url = new URL("http://www.google.com");
			java.net.URLConnection connection = url.openConnection();
			System.out.println("URL Connection");
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
			System.out.println("MalFormedURLException");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally uses");
		}
	}
public static void main(String[] args) {
	ExceptionExample ee = new ExceptionExample();
}
}
