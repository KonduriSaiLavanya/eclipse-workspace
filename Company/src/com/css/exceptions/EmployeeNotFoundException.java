package com.css.exceptions;

public class EmployeeNotFoundException extends Exception{
private String errorMessage = "Employee not found in the department..";

public EmployeeNotFoundException() {
	super();
	// TODO Auto-generated constructor stub
}

public EmployeeNotFoundException(String errorMessage) {
	super();
	this.errorMessage = errorMessage;
}

/* (non-Javadoc)
 * @see java.lang.Throwable#getMessage()
 */
@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return this.errorMessage;
}


}
