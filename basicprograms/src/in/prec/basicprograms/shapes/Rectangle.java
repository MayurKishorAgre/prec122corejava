package in.prec.basicprograms.shapes;
//constructors types
public class Rectangle {
	float height;
	float width;
	
	//default constructor
	public Rectangle() {
		height = 1F;
		width = 1F;
	
	}
	//parameterized constructor
	public Rectangle(float height, float width) {
		this.height=height;
		this.width=width;
	}
	//Setter method to set the height value
	public void setHeight(float height) {
		this.height=height;		
	}
	// Setter method to set the width value
	public void setWidth(float width) {
		this.width=width;
	}
	public float getHeight() {
		return height;
	}
	public float getWidth() {
		return width;
	}
	public float calculateArea() {
		return width * height;	
	}

}
