package com.css.overload;

public class Elephant {
	
private String e1;
private String e2;
/**
 * @return the e1
 */
public String getE1() {
	return e1;
}
/**
 * @param e1 the e1 to set
 */
public void setE1(String e1) {
	this.e1 = e1;
}
/**
 * @return the e2
 */
public String getE2() {
	return e2;
}
/**
 * @param e2 the e2 to set
 */
public void setE2(String e2) {
	this.e2 = e2;
}
public Elephant() {
	super();
	// TODO Auto-generated constructor stub
}
public Elephant(String e1, String e2) {
	super();
	this.e1 = e1;
	this.e2 = e2;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Elephant [e1=" + e1 + ", e2=" + e2 + "]";
}

}
