package com.scp.ConstructorDemo;

public class ConstructorDemo {

	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
public  ConstructorDemo(String str) 
{
	this();
	System.out.println("Paramiterized constructor");
}
public  ConstructorDemo(String str, int a) 
{
	this("Hello");

	System.out.println("Paramiterized constructor");
}
public  ConstructorDemo(int a, int b) 
{
	this("Hello",2);

	System.out.println("Paramiterized constructor");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConstructorDemo cd=new  ConstructorDemo("Hello",10);
	}

}
