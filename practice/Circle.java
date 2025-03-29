package practice;
//import java.awt.*;
public class Circle {
//	Point center;
	double radius;
	
	Circle(){
		
	}
	
	Circle( double radius){
	//	this.center=center;
		this.radius=radius;
		
	}
	double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
//	void setCenter(Point center) {
//		this.center=center;
//	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	public static void main(String args[]) {
		Circle c1=new Circle();
		System.out.println(c1.getPerimeter());
	}
}
