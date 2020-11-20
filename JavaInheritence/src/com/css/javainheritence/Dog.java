package com.css.javainheritence;

public class Dog extends Animal{
	private String eyes;
	private String nose;
	private String ear;
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getEar() {
		return ear;
	}
	public void setEar(String ear) {
		this.ear = ear;
	}
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String eyes, String nose, String ear) {
		super();
		this.eyes = eyes;
		this.nose = nose;
		this.ear = ear;
	}
	@Override
	public String toString() {
		return "Dog [eyes=" + eyes + ", nose=" + nose + ", ear=" + ear + "]";
	}
	
	

}
