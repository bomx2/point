package point;

public class Circle extends Shape implements Drawable{
	private int radius;
	
	public int getR() {
		return radius;
	}

	public void setR(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원을 그렸습니다!"); 
	 }

	@Override
	public double calculateArea() {
		return (double)radius*radius*Math.PI;
	}


}
