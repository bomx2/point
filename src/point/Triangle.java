package point;

public class Triangle extends Shape implements Drawable{
	private int height;
	private int width;
	
	public Triangle() {
	}
	
	public Triangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return height*width*0.5;
	}
	

}
