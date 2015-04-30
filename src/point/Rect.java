package point;

public class Rect extends Shape{
	private int w;
	private int h;
	
	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public void draw() {
		System.out.println("직사각형을 그렸습니다!"); 
	 }

	@Override
	public double calculateArea() {
		return (double)w*h;
	}


}
