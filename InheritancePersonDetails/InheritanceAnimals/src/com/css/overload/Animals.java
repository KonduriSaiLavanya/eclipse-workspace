package com.css.overload;

public class Animals {
private String animal1;
private String animal2;
private Elephant elephant;
/**
 * @return the animal1
 */
public String getAnimal1() {
	return animal1;
}
/**
 * @param animal1 the animal1 to set
 */
public void setAnimal1(String animal1) {
	this.animal1 = animal1;
}
/**
 * @return the animal2
 */
public String getAnimal2() {
	return animal2;
}
/**
 * @param animal2 the animal2 to set
 */
public void setAnimal2(String animal2) {
	this.animal2 = animal2;
}


public Animals() {
	super();
	// TODO Auto-generated constructor stub
}
public Animals(String animal1, String animal2) {
	super();
	this.animal1 = animal1;
	this.animal2 = animal2;
	
}
/**
 * @return the elephant
 */
public Elephant getElephant() {
	return elephant;
}
/**
 * @param elephant the elephant to set
 */
public void setElephant(Elephant elephant) {
	this.elephant = elephant;
}
public Animals(String animal1, String animal2, Elephant elephant) {
	super();
	this.animal1 = animal1;
	this.animal2 = animal2;
	this.elephant = elephant;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Animals [animal1=" + animal1 + ", animal2=" + animal2 + ", elephant=" + elephant + "]";
}



}
