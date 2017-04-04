package main.questions;


public class Circle {

	public float radius;
	
	Circle(float radius){
		this.radius = radius;
	}
	public int getArea(){
		return (int) ((3.14*(radius*radius))+0.5) ;
	}
}
