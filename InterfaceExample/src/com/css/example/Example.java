package com.css.example;

public interface Example {
void e();
}
interface Example1 extends Example
{
	void e1();
}
class Interface implements Example1
{
public void e()
{
	System.out.println("Hello");
	}
public void e1() {
	System.out.println("Welcome");
}
public static void main(String[] args)
{
	Interface object = new Interface();
	object.e();
	object.e1();
}
}