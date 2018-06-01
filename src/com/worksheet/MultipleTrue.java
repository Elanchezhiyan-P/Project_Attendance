package com.worksheet;

public class MultipleTrue {
      int var1;
      int var2;
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
      public boolean isMultiple() {
    	 if(var1%var2 == 0)
    		 {
    		 return true;
    		 }
    	 else{
    		 return false;
    	 }
      }
}
