//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;
public class Area {
	float length, breadth, area;
	void setDim(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
		area = this.length * this.breadth;
	}
	float get_Area() {
		return area;
	}
	public static void main(String[] args) {
		Area ar = new Area();
		float l, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle : ");
		l = sc.nextFloat();
		System.out.print("Enter breadth of rectangle : ");
		b = sc.nextFloat();
		ar.setDim(l, b);
		System.out.println("Area of rectangle is = " + ar.get_Area());
	}
}