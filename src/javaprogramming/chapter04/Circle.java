/*
 * Exercise 6, page 236.
 */
package javaprogramming.chapter04;

import java.lang.Math;

public class Circle{
	double radius;
	double diameter;
	double area;
	
	public Circle(){
		radius = 1;
		//calculate the other two values.
	}
	
	public void setRadius(double radius){
		this.radius = radius;
		diameter = 2 * radius;
		area = Math.PI * radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void display(){
		System.out.println("Circle: " + area);
	}
}