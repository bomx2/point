package point;

public class Rect extends Shape implements Drawable{
	private int height;
	private int width;
	
	public int getW() {
		return width;
	}

	public void setW(int width) {
		this.width = width;
	}

	public int getH() {
		return height;
	}

	public void setH(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("직사각형을 그렸습니다!"); 
	 }

	@Override
	public double calculateArea() {
		return (double)width*height;
	}


}
