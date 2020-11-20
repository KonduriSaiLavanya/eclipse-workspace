package com.css.javainheritence;

public class Cat {
	private String legs;
	private String hands;
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getHands() {
		return hands;
	}
	public void setHands(String hands) {
		this.hands = hands;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String legs, String hands) {
		super();
		this.legs = legs;
		this.hands = hands;
	}
	@Override
	public String toString() {
		return "Cat [legs=" + legs + ", hands=" + hands + "]";
	}
	

}
