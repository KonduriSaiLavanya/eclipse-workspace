package com.css.polymorphismoverloading;

 class Overload {
	public static int subract(int a, int b) {
		
		return a-b;
		
	}
public static int subract(int a, int b, int c)
		{
	return a-b-c;
		}

public static void main(String[] args)
{
	
	System.out.println(subract(8,5));
	System.out.println(subract(9,6,3));
}
}