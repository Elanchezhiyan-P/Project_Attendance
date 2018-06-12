package com.java.lang;

import java.io.IOException;

public class RunTimeExample {
public static void main(String args[]) {
	long start = System.currentTimeMillis();
	Runtime runtime =  	Runtime.getRuntime();
	int pro = runtime.availableProcessors();
	System.out.println(pro);
	try {
		runtime.exec("notepad");
	} catch (IOException e) {
		e.printStackTrace(); 
		long end  = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
}
