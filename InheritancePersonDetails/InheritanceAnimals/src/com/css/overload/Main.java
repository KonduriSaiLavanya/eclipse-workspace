package com.css.overload;

public class Main {
	public static void main(String[] args)
	{
		Lion li = new Lion();
	
		li.setLion1("lion cub1");
		li.setLion2("lion cub2");
		
		li.setAnimal1("snake");
		li.setAnimal2("croc");
		
		li.setElephant(new Elephant("ele baby1","ele baby2"));
		System.out.println(li);
		
				
	}

}
