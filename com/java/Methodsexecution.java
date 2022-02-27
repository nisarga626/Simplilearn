package com.java;

public class Methodsexecution {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;

}

public static void main(String[] args) {

	Methodsexecution b=new Methodsexecution();
	int ans= b.multipynumbers(10,3);
	System.out.println("Multipilcation is :"+ans);
	}

}
