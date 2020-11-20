package com.css.javainheritence;

public class Animal {
	private String breed;
	private String type;
	private String color;
	private Cat cat;
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String breed, String type, String color) {
		super();
		this.breed = breed;
		this.type = type;
		this.color = color;
	}
	
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Animal (String breed, String type, String color, Cat cat) {
		super();
		this.breed = breed;
		this.type = type;
		this.color = color;
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", type=" + type + ", color=" + color + ", cat=" + cat + "]";
	}
	
	
}

