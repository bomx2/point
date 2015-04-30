package point;

public class Circle extends Shape implements Drawable{
	private int r;
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void draw() {
		System.out.println("원을 그렸습니다!"); 
	 }

	@Override
	public double calculateArea() {
		return (double)r*r*Math.PI;
	}


}
