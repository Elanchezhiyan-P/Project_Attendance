package com.basic;

public class InnerOuter {
   public static void main (String[] args) {
   inner:    for(int i=0;i<10;i++)
    outer:    for(int j=0;j<5;j++)
    	   {
    		if(j==3)
    		{
    			continue outer;
    	   }
       if(j==6)
    	   {
    	   continue inner;
    	   }
       System.out.println("i = "+i + " j = "+j);
    	  }
   }
 }
