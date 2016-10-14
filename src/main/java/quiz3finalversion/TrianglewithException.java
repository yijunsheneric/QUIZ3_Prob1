package quiz3finalversion;

public class TrianglewithException {
	// The perimeter of the triangle //
	
	private double perimeter ;
	private double side1 = 1.0; 
	private double side2 = 1.0; 
	private double side3 = 1.0; 
	
	//number of objects created// 
	
	private static int numberofObjects = 0;
	
	// getter and setter for perimeter, number of object , side1, side2 and side3// 

	public double getPerimeter() {

		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public static int getNumberofObjects() {
		return numberofObjects;
	}

	public static void setNumberofObjects(int numberofObjects) {
		TrianglewithException.numberofObjects = numberofObjects;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
	// construct triangle with perimeter// 
	
	public TrianglewithException ( double side1, double side2, double side3){
	}

	// construct a triangle with a specific perimeter// 
	public TrianglewithException ( double newPerimeter) {
		setPerimeter(newPerimeter);
		numberofObjects++;
		
	
	}
}
