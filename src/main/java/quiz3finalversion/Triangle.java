package quiz3finalversion;

import java.lang.Math;


public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		side1=1;
		side2=1;
		side3=1;
		}

	Triangle(double sideone,double sidetwo,double sidethree){
		side1=sideone;
		side2=sidetwo;
		side3=sidethree;
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public double getPerimeter(){
		return side1+side2+side3;
	}
	
	public double getArea(){
		return Math.pow(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3),.5);
	}
	
	public String toString(){
	    return "Triangle: Side1 = " + side1 + "Side 2 = " + side2 + "Side 3 =" + side3;
	}
	}

