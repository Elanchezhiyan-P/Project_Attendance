package com.java.lang;

public class ObjectExamples {
	int count;
	String desc;
	 public ObjectExamples() {
		 
	 }
	 /*@Override
	public String toString() {
		return count + "," + desc;
	}*/
	 
	 
	 public ObjectExamples(int count,String desc)
	 {
		 this.count=count;
		 this.desc=desc;
	 }
	@Override
	public String toString() {
		return "ObjectExamples [count=" + count + ", desc=" + desc + "]";
	}


	public static void main(String[] args) {
		ObjectExamples oe = new ObjectExamples(100,"Yes");
		System.out.println(oe);
		System.out.println(oe.hashCode());
		oe.getClass(); 
		ObjectExamples oeone = new ObjectExamples(100,"Yes");
		System.out.println(oe.equals(oeone));
	}

}
