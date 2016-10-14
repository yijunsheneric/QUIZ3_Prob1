package quiz3finalversion;

public class IllegalTriangleException extends Exception {
private double perimeter;

public double getPerimeter() {
	return perimeter;
}

public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
} 

// construct an exception//
public IllegalTriangleException (double perimeter){
	super( " The sum of any two sides is greater than the other side" + perimeter);
	this.perimeter = perimeter ; 
	
}

}